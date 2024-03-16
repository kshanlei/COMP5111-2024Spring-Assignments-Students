package comp5111.assignment.cut;

import soot.*;
import soot.options.Options;
import org.junit.runner.JUnitCore;

public class EntryPoint {

	public static void instrumentWithSoot(String[] classUnderTest, BodyTransformer instrumenter) {
        // the path to the compiled Subject class file
        String classUnderTestPath = "./raw-classes";
        String targetPath = "./target/classes";

        String classPathSeparator = ":";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            classPathSeparator = ";";
        }

        /*Set the soot-classpath to include the helper class and class to analyze*/
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);

        System.out.println(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);
        // we set the soot output dir to target/classes so that the instrumented class can override the class file
        Options.v().set_output_dir(targetPath);

        // retain line numbers
        Options.v().set_keep_line_number(true);
        // retain the original variable names
        Options.v().setPhaseOption("jb", "use-original-names:true");

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");

        jtp.add(new Transform("jtp.instrumenter", instrumenter));

        // pass arguments to soot
        soot.Main.main(classUnderTest);  // added phases will be executed in this method
    }

	public static void runJunitTests(String test_suite) {
        Class<?> testClass = null;
        try {
            // here we programmitically run junit tests
            testClass = Class.forName("comp5111.assignment.cut." + test_suite);
            JUnitCore junit = new JUnitCore();
            System.out.println("Running junit test: " + testClass.getName());
            junit.run(testClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}