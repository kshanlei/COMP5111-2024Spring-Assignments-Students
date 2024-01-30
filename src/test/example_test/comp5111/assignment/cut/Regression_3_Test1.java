package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_3_Test1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test501");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.getProperty("");
        boolean boolean17 = taskHandler1.isIndexed("hi!");
        java.lang.String str19 = taskHandler1.findNext("");
        boolean boolean21 = taskHandler1.hasNested("");
        java.lang.String str23 = taskHandler1.getProperty("hi!");
        java.lang.String str25 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test502");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getKey("");
        boolean boolean11 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test503");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        int int7 = taskHandler1.getIndex("hi!");
        java.lang.String str9 = taskHandler1.remove("");
        java.lang.String str11 = taskHandler1.getProperty("");
        java.lang.String str13 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test504");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str6 = textHandler2.escapeJavaStyleString("hi!", true, false);
        char[] charArray8 = textHandler2.string2char("");
        char[] charArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = textHandler2.toUpperCase(charArray9, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test505");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        int int11 = numberHandler3.minimum((int) 'a', (int) (byte) -1, 0);
        int int14 = numberHandler3.compare((double) 100, 1.0d);
        long long18 = numberHandler3.maximum((long) (-1), (long) (-10086), (long) 35);
        int int22 = numberHandler3.maximum((int) (byte) 10, (int) (short) -1, 97);
        long long26 = numberHandler3.maximum(0L, (-1L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test506");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (short) 100, (long) (byte) 100, 35L);
        int int9 = numberHandler2.compare((double) 1L, 1.0d);
        int int13 = numberHandler2.maximum(97, (int) (byte) 10, 97);
        boolean boolean15 = numberHandler2.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test507");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        boolean boolean5 = taskHandler1.isMapped("");
        boolean boolean7 = taskHandler1.hasNested("");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test508");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.isMapped("");
        boolean boolean12 = taskHandler6.isMapped("hi!");
        java.lang.String str14 = taskHandler6.findNext("hi!");
        int int16 = taskHandler6.getIndex("");
        java.lang.String str18 = taskHandler6.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test509");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.maximum((int) (byte) 1, (int) 'a', (int) (short) -1);
        int int8 = numberHandler1.compare(0.0f, (float) (short) -1);
        int int12 = numberHandler1.minimum((-1), 35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test510");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.getKey("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        boolean boolean11 = taskHandler1.hasNested("");
        java.lang.String str13 = taskHandler1.getKey("");
        boolean boolean15 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test511");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        long long9 = numberHandler1.maximum((long) (byte) 10, (long) (byte) 1, (-1L));
        int int13 = numberHandler1.maximum((int) (byte) 0, (int) (byte) -1, (int) (short) -1);
        long long17 = numberHandler1.maximum(100L, 0L, 0L);
        boolean boolean19 = numberHandler1.isNumber("");
        int int22 = numberHandler1.compare((float) 0L, (float) (-10086L));
        boolean boolean24 = numberHandler1.isNumber("hi!");
        boolean boolean26 = numberHandler1.isDigits("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test512");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        long long9 = numberHandler1.maximum((long) (byte) 10, (long) (byte) 1, (-1L));
        int int13 = numberHandler1.maximum((int) (byte) 0, (int) (byte) -1, (int) (short) -1);
        long long17 = numberHandler1.maximum(100L, 0L, 0L);
        int int21 = numberHandler1.minimum(35, 10, (int) (byte) 1);
        boolean boolean23 = numberHandler1.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test513");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        boolean boolean9 = taskHandler1.hasNested("");
        boolean boolean11 = taskHandler1.isMapped("");
        java.lang.String str13 = taskHandler1.remove("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test1.test514");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.getKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }
}

