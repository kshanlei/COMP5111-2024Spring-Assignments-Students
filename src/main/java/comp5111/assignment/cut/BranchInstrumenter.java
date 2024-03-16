package comp5111.assignment.cut;

import soot.*;
import soot.jimple.*;
import soot.util.Chain;

import java.util.Iterator;
import java.util.Map;

public class BranchInstrumenter extends BodyTransformer {

    /* some internal fields */
    static SootClass counterClass;
    static SootMethod add_branch;

    static {
        counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.cut.Counter");
        add_branch = counterClass.getMethod("void covered_branch(java.lang.String,java.lang.String)");

    }

    /*
     * internalTransform goes through a method body and inserts counter
     * instructions before method returns
     */
    @Override
    protected void internalTransform(Body body, String phase, Map options) {
        // body's method
        SootMethod method = body.getMethod();
        
        // we dont instrument constructor (<init>) and static initializer (<clinit>)
        // Note that you should instrument the constructor and static initializer in your Assignments.
        if (method.isConstructor() || method.isStaticInitializer()) {
            return;
        }

        // debugging
        System.out.println("instrumenting method: " + method.getSignature());

        // get body's unit as a chain
        Chain<Unit> units = body.getUnits();

        // get a snapshot iterator of the unit since we are going to
        // mutate the chain when iterating over it.
        Iterator<?> stmtIt = units.snapshotIterator();
        
        //This part is for statement coverage, firstly retrieve the class and method name from signature
        String signature = method.getSignature();
        int left_ptr = signature.indexOf("<") + 1;
        int mid_ptr = signature.indexOf(":", left_ptr);
        int right_ptr = signature.indexOf(">", mid_ptr);
        String class_signature = signature.substring(left_ptr, mid_ptr);
        String method_signature = signature.substring(mid_ptr + 2, right_ptr);

        // typical while loop for iterating over each statement
        while (stmtIt.hasNext()) {
            // cast back to a statement.
            Stmt stmt = (Stmt) stmtIt.next();
            
            // If statement is branch statement
            if (stmt instanceof IfStmt){
                //update the total number of branches
                Counter.update_branch(class_signature);
                // get the next statement
                Stmt nextstmt = (Stmt) stmtIt.next();   

                InvokeExpr L = Jimple.v().newStaticInvokeExpr(add_branch.makeRef(), 
                    StringConstant.v(class_signature),
                    StringConstant.v(Integer.toString(stmt.getJavaSourceStartLineNumber()) + stmt.toString())
                );
                InvokeExpr R = Jimple.v().newStaticInvokeExpr(add_branch.makeRef(), 
                    StringConstant.v(class_signature),
                    // to make difference of two branches add "!" to the end of branch signature
                    StringConstant.v(Integer.toString(stmt.getJavaSourceStartLineNumber()) + stmt.toString() + "!")
                );
                // define the new statements for two branches of if statements
                Stmt LCounter = Jimple.v().newInvokeStmt(L);
                Stmt RCounter = Jimple.v().newInvokeStmt(R);
                // get the target statement of if statement
                Stmt target = ((IfStmt) stmt).getTarget();
                
                // set the new target of if statement (in case condition satisfied) based on our strategy
                ((IfStmt)stmt).setTarget(LCounter);
                // new goto statements introduced based on our strategy
                GotoStmt LGoto = Jimple.v().newGotoStmt(target);
                GotoStmt RGoto = Jimple.v().newGotoStmt(nextstmt);

                // place the newly introduced statements on right places
                units.insertAfter(RCounter, stmt);
                units.insertAfter(RGoto, RCounter);
                units.insertAfter(LCounter, RGoto);
                units.insertAfter(LGoto, LCounter);
            }
        }  
    }
}
