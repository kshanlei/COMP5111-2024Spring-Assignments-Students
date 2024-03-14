package comp5111.assignment;

import soot.*;
import soot.jimple.*;
import soot.util.Chain;

import java.util.Iterator;
import java.util.Map;

public class Instrumenter extends BodyTransformer {

    /* some internal fields */
    static SootClass counterClass;
    static SootMethod addStaticInvocationMethod, addInstanceInvocationMethod;

    static {
        counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.Counter");
        addStaticInvocationMethod = counterClass.getMethod("void addStaticInvocation(int)");
        addInstanceInvocationMethod = counterClass.getMethod("void addInstanceInvocation(int)");
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
        //
        Iterator<?> stmtIt = units.snapshotIterator();

        // typical while loop for iterating over each statement
        while (stmtIt.hasNext()) {

            // cast back to a statement.
            Stmt stmt = (Stmt) stmtIt.next();

            // there are many kinds of statements, here we are only
            // interested in return statements
            // NOTE: there are two kinds of return statements, with or without return value
            if (stmt instanceof ReturnStmt || stmt instanceof ReturnVoidStmt) {
                // now we reach the real instruction
                // call Chain.insertBefore() to insert instructions
                //
                // 1. first, make a new invoke expression
                InvokeExpr incExpr = null;
                if (method.isStatic()) {
                    // if current method is static, we add static method invocation counter
                    incExpr = Jimple.v().newStaticInvokeExpr(
                            addStaticInvocationMethod.makeRef(), IntConstant.v(1));
                } else {
                    // if current method is instance method, we add instance method invocation counter
                    incExpr = Jimple.v().newStaticInvokeExpr(
                            addInstanceInvocationMethod.makeRef(), IntConstant.v(1));
                }

                // 2. then, make a invoke statement
                Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);

                // 3. insert new statement into the chain, before return statement
                // (we are mutating the unit chain).
                units.insertBefore(incStmt, stmt);
            }
        }
    }
}
