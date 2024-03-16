package comp5111.assignment;

import java.io.IOException;
import java.util.Arrays;
import comp5111.assignment.cut.*;


public class Assignment1 {
	
    static String SubjectClass = "comp5111.assignment.cut.Subject$";
    private static String[] classUnderTest = new String[]{
        SubjectClass + "NumberHandler",
        SubjectClass + "ParameterHandler",
        SubjectClass + "SortTools",
        SubjectClass + "TaskHandler",
        SubjectClass + "TextHandler"
    };
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        /* check the arguments */
        if (args.length <= 1 || (args[0].compareTo("0") != 0 && args[0].compareTo("1") != 0 && args[0].compareTo("2") != 0)) {
            System.err.println("Usage: java comp5111.assignment.Assignment1 [coverage level] test-suite [soot options] " +
                "classname");
            System.err.println("Usage: [coverage level] = 0 for statement coverage");
            System.err.println("Usage: [coverage level] = 1 for branch coverage");
            System.exit(0);
        }

        // these args will be passed into soot.
        String[] classNames = Arrays.copyOfRange(args, 1, args.length);
        
        String mainClass = "";
        if (classNames.length > 1){
            // add prefix extension to specify package name
            mainClass = SubjectClass + classNames[1];
            // verify entered input class takes place in main class
            Boolean found_class = false;
            for (int i = 0; i < classUnderTest.length; i++)
                found_class |= classUnderTest[i].equals(mainClass);
            // if class not found, raise error
            if (!found_class){
                System.err.println("Searched class not found, please enter one of following classes to be analyzed:");
                System.err.print("\tNumberTasks\n\tCharTasks\n\tGregorianTasks"+
                "\n\tFilenameTasks\n\tArrayTasks\n\tStringTasks\n\tBooleanTasks\n");
                System.exit(0);
            }
        }
        

        if (args[0].compareTo("0") == 0) {
            // TODO invoke your statement coverage instrument function
        	Instrumenter instrumenter = new Instrumenter();
            EntryPoint.instrumentWithSoot(classUnderTest, instrumenter);

            // TODO run tests on instrumented classes to generate coverage report

            EntryPoint.runJunitTests(classNames[0]);

        } else if (args[0].compareTo("1") == 0) {
            // TODO invoke your branch coverage instrument function
        	BranchInstrumenter instrumenter = new BranchInstrumenter();
            // Instrument the classes for testing
            EntryPoint.instrumentWithSoot(classUnderTest, instrumenter);
            
            // TODO run tests on instrumented classes to generate coverage report
            EntryPoint.runJunitTests(classNames[0]);
        }
    }
}