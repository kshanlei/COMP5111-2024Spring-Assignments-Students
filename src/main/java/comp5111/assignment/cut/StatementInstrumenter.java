package comp5111.assignment.cut;

import soot.*;
import soot.jimple.*;
import soot.util.Chain;

import java.util.Iterator;
import java.util.Map;

public class StatementInstrumenter extends BodyTransformer {

    /* some internal fields */
    static SootClass counterClass;
    static SootMethod addStaticInvocationMethod, addInstanceInvocationMethod, add_branch, add_statement;

    static {
        counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.cut.Counter");
        add_statement = counterClass.getMethod("void covered_statement(java.lang.String,java.lang.String,java.lang.String)");
 
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
                    
            //This part is for statement coverage
            // 1 Get the statement signature
            String line_signature = Integer.toString(stmt.getJavaSourceStartLineNumber());
            String statement_signature = method_signature + line_signature + stmt.toString();

            // 2 if this line is new invoked instruction, or argument define statement of method, skip it
            if (line_signature.charAt(0) == '-') 
                continue;

            // 3 Update the total number of statements and lines
            Counter.update_statement(class_signature, statement_signature, line_signature);
            
            // 4.1 make a new invoke expression for adding 1 for statement
            InvokeExpr V = Jimple.v().newStaticInvokeExpr(add_statement.makeRef(), 
                StringConstant.v(class_signature),
                StringConstant.v(statement_signature),
                StringConstant.v(line_signature)
            );
            // 4.2 then, make a invoke statement
            Stmt VCounter = Jimple.v().newInvokeStmt(V);
            
            // 5 insert new statement into the chain, before return statement
            units.insertBefore(VCounter, stmt);
        }

    }
}
