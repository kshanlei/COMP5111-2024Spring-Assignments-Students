package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_3_Test0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test001");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$SortTools with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test002");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test003");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        java.lang.Class<?> wildcardClass10 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test004");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str6 = textHandler2.escapeJavaStyleString("hi!", true, false);
        java.lang.Class<?> wildcardClass7 = textHandler2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test005");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.minimum(97L, (-1L), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test006");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test007");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        boolean boolean7 = sortTools4.checkRange(32, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test008");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        boolean boolean15 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test009");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.Class<?> wildcardClass8 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test010");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        java.lang.Class<?> wildcardClass5 = numberHandler2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test011");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str6 = textHandler2.escapeJavaStyleString("hi!", true, false);
        java.lang.String str10 = textHandler2.escapeJavaStyleString("hi!", false, false);
        char[] charArray12 = textHandler2.string2char("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[h, i, !]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test012");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 1);
        java.lang.String str8 = textHandler2.unescapeJava("hi!");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test013");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        int int8 = numberHandler4.maximum((int) (short) 10, 0, (int) (short) -1);
        long long12 = numberHandler4.maximum((long) (byte) 0, (long) (short) 0, (long) 35);
        boolean boolean14 = numberHandler4.isNumber("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test014");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.getKey("");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test015");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$ParameterHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test016");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str4 = textHandler2.unescapeJava("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test017");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 1);
        char[] charArray8 = textHandler2.newTextBuffer((int) (byte) -1);
        java.lang.String str10 = textHandler2.unescapeJava("");
        char[] charArray12 = textHandler2.newTextBuffer((int) (short) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(charArray12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test018");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("hi!");
        java.lang.Class<?> wildcardClass6 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test019");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        java.lang.String str7 = taskHandler1.remove("");
        java.lang.Class<?> wildcardClass8 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test020");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        int int5 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test021");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$NumberHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test022");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        long long9 = numberHandler1.maximum((long) (byte) 10, (long) (byte) 1, (-1L));
        int int12 = numberHandler1.compare((double) 0, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test023");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.remove("");
        java.lang.String str11 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test024");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str7 = textHandler3.escapeJavaStyleString("hi!", false, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test025");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        long long7 = numberHandler1.maximum(0L, (long) 0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test026");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        java.lang.Class<?> wildcardClass6 = taskHandler5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test027");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.remove("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test028");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.getKey("hi!");
        java.lang.String str17 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test029");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$TextHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test030");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test031");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.remove("hi!");
        java.lang.String str13 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test032");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test033");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test034");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("");
        java.lang.String str5 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test035");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = numberHandler4.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test036");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("hi!");
        java.lang.String str5 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10086) + "'", int3 == (-10086));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test037");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 1);
        char[] charArray8 = textHandler2.newTextBuffer((int) (byte) -1);
        java.lang.String str10 = textHandler2.unescapeJava("");
        java.lang.String str12 = textHandler2.unescapeJava("");
        java.lang.String str16 = textHandler2.escapeJavaStyleString("hi!", true, false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test038");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.string2char("hi!");
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test039");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        java.lang.String str5 = taskHandler1.findNext("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test040");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.findNext("");
        java.lang.String str15 = taskHandler1.remove("hi!");
        boolean boolean17 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test041");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.getKey("");
        java.lang.String str13 = taskHandler1.getProperty("hi!");
        boolean boolean15 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test042");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test043");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test044");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        int int8 = numberHandler2.minimum((int) (short) 1, (int) (short) 1, 52);
        int int11 = numberHandler2.compare(1.0f, (float) (-10086));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test045");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        long long11 = numberHandler3.minimum((long) '#', (long) (byte) -1, 10L);
        boolean boolean13 = numberHandler3.isDigits("");
        int int17 = numberHandler3.maximum((int) (short) 1, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test046");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.findNext("hi!");
        java.lang.String str15 = taskHandler1.remove("");
        java.lang.Class<?> wildcardClass16 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test047");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        int int7 = taskHandler1.getIndex("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test048");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str7 = textHandler3.escapeJavaStyleString("hi!", true, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test049");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        java.lang.String str9 = taskHandler1.findNext("");
        int int11 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test050");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        int int11 = numberHandler3.minimum((int) 'a', (int) (byte) -1, 0);
        int int14 = numberHandler3.compare((float) 1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test051");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        java.lang.String str5 = taskHandler1.getProperty("hi!");
        java.lang.String str7 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test052");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        java.lang.String str7 = taskHandler1.getProperty("");
        boolean boolean9 = taskHandler1.isMapped("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test053");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        java.lang.String str11 = taskHandler1.getProperty("");
        java.lang.String str13 = taskHandler1.getProperty("");
        boolean boolean15 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test054");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        java.lang.String str11 = taskHandler1.getProperty("");
        boolean boolean13 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test055");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        long long11 = numberHandler3.minimum((long) '#', (long) (byte) -1, 10L);
        boolean boolean13 = numberHandler3.isDigits("");
        boolean boolean15 = numberHandler3.isNumber("hi!");
        boolean boolean17 = numberHandler3.isNumber("");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test056");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        boolean boolean5 = taskHandler1.isIndexed("");
        boolean boolean7 = taskHandler1.isIndexed("");
        boolean boolean9 = taskHandler1.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test057");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test058");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        boolean boolean5 = numberHandler3.isDigits("");
        long long9 = numberHandler3.maximum((long) ' ', (long) (-10086), (long) (short) 1);
        long long13 = numberHandler3.maximum((long) '4', (-10086L), 10L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test059");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.remove("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test060");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (byte) 1, 1L, (long) (-1));
        int int10 = numberHandler2.maximum((int) '#', (int) ' ', (int) '#');
        int int13 = numberHandler2.compare((float) 35L, (float) 52L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test061");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test062");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        int[] intArray3 = null;
        int[] intArray7 = sortTools2.rotate(intArray3, 35, 10, 32);
        boolean boolean10 = sortTools2.checkRange((int) (byte) 0, 10);
        int[] intArray12 = new int[] { 100 };
        int[] intArray16 = sortTools2.rotate(intArray12, 32, 32, 0);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test063");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.remove("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test064");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.getKey("");
        boolean boolean9 = taskHandler1.hasNested("");
        java.lang.String str11 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test065");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test066");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        java.lang.String str9 = taskHandler1.findNext("");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test067");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.Class<?> wildcardClass8 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test068");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.isMapped("");
        java.lang.String str12 = taskHandler6.findNext("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test069");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("hi!");
        int int6 = numberHandler1.compare((double) (short) 10, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test070");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        java.lang.String str13 = taskHandler1.getProperty("hi!");
        int int15 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test071");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test072");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.remove("hi!");
        int int11 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10086) + "'", int11 == (-10086));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test073");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        int int9 = numberHandler1.maximum((int) (short) 0, (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test074");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.getProperty("");
        int int17 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test075");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("hi!");
        java.lang.Class<?> wildcardClass4 = taskHandler1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10086) + "'", int3 == (-10086));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test076");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        java.lang.Boolean boolean12 = parameterHandler7.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass13 = parameterHandler7.getClass();
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test077");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        java.lang.String str15 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test078");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.minimum(0L, (long) (byte) 100, 1L);
        int int8 = numberHandler1.compare(1.0d, (double) 'a');
        long long12 = numberHandler1.minimum((long) 0, (-10086L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-10086L) + "'", long12 == (-10086L));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test079");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("hi!");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        boolean boolean15 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10086) + "'", int11 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test080");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test081");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test082");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        boolean boolean13 = taskHandler1.isIndexed("");
        java.lang.String str15 = taskHandler1.getProperty("");
        java.lang.String str17 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test083");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.minimum(0L, (long) (byte) 100, 1L);
        int int8 = numberHandler1.compare(1.0d, (double) 'a');
        java.lang.Number number10 = numberHandler1.parseNumber("");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test084");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.remove("hi!");
        java.lang.String str7 = taskHandler1.remove("");
        java.lang.String str9 = taskHandler1.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test085");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        boolean boolean5 = numberHandler3.isDigits("");
        long long9 = numberHandler3.maximum((long) ' ', (long) (-10086), (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = numberHandler3.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test086");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getProperty("");
        java.lang.String str9 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test087");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject0.new TaskHandler();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test088");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        java.lang.String str8 = textHandler2.escapeJavaStyleString("", true, true);
        char[] charArray10 = textHandler2.newTextBuffer((-1));
        char[] charArray12 = textHandler2.newTextBuffer((int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(charArray12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test089");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        boolean boolean5 = taskHandler1.isIndexed("");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test090");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str4 = textHandler2.unescapeJava("hi!");
        char[] charArray6 = textHandler2.string2char("");
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject7.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler9 = subject7.new TextHandler();
        char[] charArray11 = textHandler9.string2char("hi!");
        char[] charArray14 = textHandler2.toUpperCase(charArray11, 100, 35);
        java.lang.String str16 = textHandler2.unescapeJava("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[h, i, !]");
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test091");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$TaskHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test092");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (short) 100, (long) (byte) 100, 35L);
        boolean boolean8 = numberHandler2.isNumber("");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test093");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.string2char("hi!");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test094");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test095");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        int int9 = taskHandler1.getIndex("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test096");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 1);
        char[] charArray8 = textHandler2.newTextBuffer((int) (byte) -1);
        java.lang.String str10 = textHandler2.unescapeJava("");
        java.lang.String str12 = textHandler2.unescapeJava("");
        char[] charArray14 = textHandler2.newTextBuffer(0);
        java.lang.String str16 = textHandler2.unescapeJava("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test097");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler3 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler4.toBooleanObject("hi!");
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test098");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        boolean boolean9 = taskHandler1.hasNested("");
        java.lang.String str11 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test099");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) (-1.0f), (double) 0.0f);
        java.lang.Number number7 = numberHandler2.parseNumber("");
        long long11 = numberHandler2.minimum((-1L), 97L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test100");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test101");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test102");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        boolean boolean13 = taskHandler1.hasNested("");
        boolean boolean15 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test103");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test104");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        java.lang.Class<?> wildcardClass14 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test105");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        java.lang.String str7 = taskHandler5.getKey("hi!");
        boolean boolean9 = taskHandler5.isIndexed("hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test106");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        int int11 = numberHandler3.minimum((int) 'a', (int) (byte) -1, 0);
        int int14 = numberHandler3.compare((double) 100, 1.0d);
        long long18 = numberHandler3.maximum((long) (byte) -1, (long) 'a', (long) (byte) -1);
        int int21 = numberHandler3.compare((double) (byte) 0, (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test107");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.hasNested("");
        java.lang.String str10 = taskHandler6.findNext("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test108");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test109");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.remove("hi!");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test110");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        boolean boolean9 = taskHandler1.isMapped("hi!");
        boolean boolean11 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test111");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        boolean boolean6 = numberHandler4.isDigits("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test112");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        java.lang.String str15 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test113");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        boolean boolean7 = taskHandler5.isIndexed("");
        java.lang.String str9 = taskHandler5.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test114");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test115");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.findNext("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test116");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.findNext("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        int int15 = taskHandler1.getIndex("");
        java.lang.String str17 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test117");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.Class<?> wildcardClass10 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test118");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.string2char("");
        char[] charArray6 = textHandler2.newTextBuffer((int) (byte) 0);
        java.lang.String str8 = textHandler2.unescapeJava("hi!");
        java.lang.String str10 = textHandler2.unescapeJava("hi!");
        java.lang.String str14 = textHandler2.escapeJavaStyleString("hi!", false, false);
        char[] charArray16 = textHandler2.newTextBuffer(0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(charArray16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test119");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test120");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler5 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler6 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test121");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        boolean boolean9 = numberHandler3.isDigits("hi!");
        int int12 = numberHandler3.compare((float) (byte) 10, (float) 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test122");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test123");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.hasNested("hi!");
        java.lang.String str15 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test124");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test125");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str4 = textHandler2.unescapeJava("hi!");
        char[] charArray6 = textHandler2.string2char("");
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject7.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler9 = subject7.new TextHandler();
        char[] charArray11 = textHandler9.string2char("hi!");
        char[] charArray14 = textHandler2.toUpperCase(charArray11, 100, 35);
        char[] charArray16 = textHandler2.newTextBuffer((int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[h, i, !]");
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test126");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        boolean boolean13 = taskHandler1.hasNested("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test127");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        int int11 = numberHandler3.minimum((int) 'a', (int) (byte) -1, 0);
        int int14 = numberHandler3.compare((double) 100, 1.0d);
        long long18 = numberHandler3.maximum((long) (byte) -1, (long) 'a', (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = numberHandler3.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test128");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.remove("hi!");
        java.lang.String str19 = taskHandler1.getKey("");
        java.lang.String str21 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test129");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test130");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.getProperty("");
        java.lang.String str17 = taskHandler1.remove("hi!");
        boolean boolean19 = taskHandler1.isIndexed("");
        java.lang.String str21 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test131");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getProperty("");
        java.lang.String str9 = taskHandler1.remove("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test132");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        java.lang.String str5 = taskHandler1.getKey("");
        int int7 = taskHandler1.getIndex("hi!");
        int int9 = taskHandler1.getIndex("hi!");
        java.lang.String str11 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10086) + "'", int9 == (-10086));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test133");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 1);
        char[] charArray8 = textHandler2.newTextBuffer((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = charArray8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertNull(charArray8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test134");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.remove("hi!");
        boolean boolean11 = taskHandler1.isIndexed("");
        java.lang.String str13 = taskHandler1.getProperty("");
        java.lang.String str15 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test135");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isMapped("");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.getProperty("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test136");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        java.lang.String str11 = taskHandler1.getProperty("");
        int int13 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10086) + "'", int13 == (-10086));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test137");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        java.lang.String str13 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test138");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.getProperty("");
        java.lang.String str17 = taskHandler1.remove("hi!");
        boolean boolean19 = taskHandler1.isIndexed("");
        int int21 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10086) + "'", int21 == (-10086));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test139");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        boolean boolean15 = taskHandler1.isMapped("hi!");
        java.lang.String str17 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test140");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        int int11 = numberHandler3.minimum((int) 'a', (int) (byte) -1, 0);
        int int14 = numberHandler3.compare((double) 100, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = numberHandler3.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test141");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str4 = textHandler2.unescapeJava("hi!");
        char[] charArray6 = textHandler2.string2char("");
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject7.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler9 = subject7.new TextHandler();
        char[] charArray11 = textHandler9.string2char("hi!");
        char[] charArray14 = textHandler2.toUpperCase(charArray11, 100, 35);
        char[] charArray16 = textHandler2.string2char("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[h, i, !]");
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test142");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test143");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        boolean boolean5 = taskHandler1.isIndexed("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test144");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        java.lang.Boolean boolean12 = parameterHandler7.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean17 = parameterHandler7.toBooleanObject((int) (byte) 100, 1, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean22 = parameterHandler7.toBooleanObject((int) ' ', (int) (byte) 0, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test145");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.remove("hi!");
        java.lang.String str19 = taskHandler1.findNext("hi!");
        java.lang.String str21 = taskHandler1.findNext("");
        boolean boolean23 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test146");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum((long) 97, (long) (byte) 0, (long) ' ');
        java.lang.Class<?> wildcardClass8 = numberHandler3.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test147");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test148");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        boolean boolean17 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test149");
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
        java.lang.Class<?> wildcardClass20 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test150");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        int int8 = numberHandler2.minimum((int) (short) 1, (int) (short) 1, 52);
        int int11 = numberHandler2.compare((double) (short) -1, (double) (-10086));
        int int14 = numberHandler2.compare((float) (byte) 100, (float) 'a');
        java.lang.Class<?> wildcardClass15 = numberHandler2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test151");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        int int6 = numberHandler1.compare((double) 0.0f, (double) 0L);
        int int9 = numberHandler1.compare((float) (-1), (float) (byte) 10);
        int int12 = numberHandler1.compare((float) (-1L), 10.0f);
        long long16 = numberHandler1.maximum((long) (byte) 0, (long) 1, 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test152");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) (-1.0f), (double) 0.0f);
        java.lang.Number number7 = numberHandler2.parseNumber("");
        java.lang.Class<?> wildcardClass8 = numberHandler2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test153");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("hi!");
        java.lang.String str7 = taskHandler1.getProperty("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test154");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.remove("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test155");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        boolean boolean21 = taskHandler1.isMapped("hi!");
        java.lang.String str23 = taskHandler1.remove("");
        java.lang.String str25 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test156");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        boolean boolean7 = taskHandler5.isIndexed("");
        java.lang.String str9 = taskHandler5.getKey("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test157");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        java.lang.String str7 = taskHandler1.getProperty("");
        boolean boolean9 = taskHandler1.hasNested("hi!");
        java.lang.String str11 = taskHandler1.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test158");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        boolean boolean5 = sortTools2.checkRange(35, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test159");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.getProperty("");
        java.lang.String str17 = taskHandler1.remove("hi!");
        int int19 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-10086) + "'", int19 == (-10086));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test160");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.findNext("hi!");
        java.lang.String str15 = taskHandler1.getKey("hi!");
        java.lang.String str17 = taskHandler1.getKey("");
        boolean boolean19 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test161");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        int int8 = numberHandler4.maximum((int) (short) 10, 0, (int) (short) -1);
        long long12 = numberHandler4.maximum((long) (byte) 0, (long) (short) 0, (long) 35);
        int int15 = numberHandler4.compare((float) (-10086L), (float) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test162");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        boolean boolean15 = taskHandler1.hasNested("hi!");
        java.lang.String str17 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test163");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("hi!");
        long long7 = numberHandler1.minimum((long) (short) 0, (long) (byte) -1, 0L);
        int int11 = numberHandler1.minimum((int) (byte) -1, (int) (byte) 1, 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test164");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        java.lang.String str15 = taskHandler1.remove("");
        java.lang.String str17 = taskHandler1.remove("");
        boolean boolean19 = taskHandler1.isIndexed("");
        boolean boolean21 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test165");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.remove("hi!");
        boolean boolean11 = taskHandler1.isIndexed("");
        boolean boolean13 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test166");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.findNext("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.remove("hi!");
        java.lang.String str17 = taskHandler1.findNext("hi!");
        boolean boolean19 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test167");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        java.lang.String str9 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test168");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str6 = textHandler2.escapeJavaStyleString("hi!", true, false);
        java.lang.String str10 = textHandler2.escapeJavaStyleString("hi!", false, false);
        char[] charArray12 = textHandler2.newTextBuffer((-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(charArray12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test169");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getProperty("hi!");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test170");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 1);
        char[] charArray8 = textHandler2.newTextBuffer((int) (byte) -1);
        char[] charArray10 = textHandler2.string2char("");
        java.lang.String str12 = textHandler2.unescapeJava("hi!");
        java.lang.String str14 = textHandler2.unescapeJava("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test171");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.findNext("");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test172");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (byte) 1, 1L, (long) (-1));
        java.lang.Number number8 = numberHandler2.parseNumber("");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(number8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test173");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.isIndexed("");
        int int12 = taskHandler6.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test174");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test175");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        java.lang.String str17 = taskHandler1.getProperty("hi!");
        int int19 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-10086) + "'", int19 == (-10086));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test176");
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
        java.lang.Class<?> wildcardClass18 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test177");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        boolean boolean15 = taskHandler1.hasNested("");
        java.lang.String str17 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test178");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.remove("hi!");
        int int21 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10086) + "'", int21 == (-10086));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test179");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum((long) 97, (long) (byte) 0, (long) ' ');
        int int10 = numberHandler3.compare((float) (-1L), (float) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test180");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        java.lang.String str15 = taskHandler1.remove("");
        java.lang.String str17 = taskHandler1.remove("");
        boolean boolean19 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test181");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test182");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getProperty("");
        java.lang.String str9 = taskHandler1.remove("");
        java.lang.String str11 = taskHandler1.remove("");
        int int13 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test183");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        boolean boolean5 = taskHandler1.isMapped("");
        java.lang.String str7 = taskHandler1.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test184");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test185");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        int int11 = numberHandler3.minimum((int) 'a', (int) (byte) -1, 0);
        int int14 = numberHandler3.compare((double) 100, 1.0d);
        long long18 = numberHandler3.maximum((long) (byte) -1, (long) 'a', (long) (byte) -1);
        int int22 = numberHandler3.minimum(52, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test186");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test187");
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
        boolean boolean25 = taskHandler1.isIndexed("");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test188");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test189");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        int int8 = numberHandler2.minimum((int) (short) 1, (int) (short) 1, 52);
        int int11 = numberHandler2.compare((float) 32, (float) 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test190");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isMapped("");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.getProperty("hi!");
        java.lang.String str13 = taskHandler1.getProperty("");
        java.lang.String str15 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test191");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.minimum(97, (int) (byte) 0, (int) (byte) -1);
        int int9 = numberHandler1.minimum(1, 32, (int) '4');
        java.lang.Class<?> wildcardClass10 = numberHandler1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test192");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        java.lang.String str15 = taskHandler1.remove("hi!");
        boolean boolean17 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test193");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getKey("");
        boolean boolean11 = taskHandler1.hasNested("");
        boolean boolean13 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test194");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        java.lang.String str15 = taskHandler1.remove("");
        java.lang.String str17 = taskHandler1.remove("");
        int int19 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-10086) + "'", int19 == (-10086));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test195");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.remove("");
        java.lang.String str17 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test196");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test197");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        boolean boolean7 = numberHandler1.isDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = numberHandler1.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test198");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler5 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler6 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject0.new SortTools();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test199");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        boolean boolean5 = taskHandler1.isIndexed("");
        java.lang.String str7 = taskHandler1.getProperty("hi!");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test200");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getKey("");
        boolean boolean11 = taskHandler1.hasNested("");
        java.lang.String str13 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test201");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.getKey("");
        boolean boolean17 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test202");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test203");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (byte) 1, 1L, (long) (-1));
        int int10 = numberHandler2.maximum((int) '#', (int) ' ', (int) '#');
        int int13 = numberHandler2.compare((float) 35, (float) 100);
        int int17 = numberHandler2.minimum((-1), (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test204");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        boolean boolean9 = taskHandler1.isMapped("hi!");
        boolean boolean11 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test205");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        java.lang.String str7 = taskHandler5.getKey("hi!");
        boolean boolean9 = taskHandler5.hasNested("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test206");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        java.lang.String str7 = taskHandler1.getProperty("");
        java.lang.Class<?> wildcardClass8 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test207");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        java.lang.String str7 = taskHandler5.getKey("");
        java.lang.String str9 = taskHandler5.remove("hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test208");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        java.lang.String str7 = taskHandler5.getKey("hi!");
        java.lang.String str9 = taskHandler5.getProperty("");
        boolean boolean11 = taskHandler5.isMapped("hi!");
        java.lang.String str13 = taskHandler5.getProperty("hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test209");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        boolean boolean15 = taskHandler1.hasNested("hi!");
        java.lang.String str17 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test210");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.minimum(0L, (long) (byte) 100, 1L);
        int int8 = numberHandler1.compare(1.0d, (double) 'a');
        boolean boolean10 = numberHandler1.isDigits("hi!");
        int int13 = numberHandler1.compare((float) (byte) -1, (float) 97);
        int int16 = numberHandler1.compare((double) ' ', (double) ' ');
        long long20 = numberHandler1.maximum(97L, (long) 'a', (long) 35);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test211");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        boolean boolean9 = taskHandler1.hasNested("hi!");
        java.lang.String str11 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test212");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test213");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test214");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.hasNested("hi!");
        boolean boolean12 = taskHandler6.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test215");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isMapped("");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test216");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler10 = subject0.new TextHandler();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test217");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.remove("hi!");
        java.lang.String str11 = taskHandler1.getKey("");
        java.lang.String str13 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test218");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        java.lang.Class<?> wildcardClass4 = taskHandler1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test219");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler5 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler6 = subject0.new NumberHandler();
        int int10 = numberHandler6.maximum((int) (byte) 0, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test220");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.getProperty("");
        java.lang.String str17 = taskHandler1.remove("hi!");
        boolean boolean19 = taskHandler1.isIndexed("");
        boolean boolean21 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test221");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (short) 100, (long) (byte) 100, 35L);
        int int9 = numberHandler2.compare((double) 1L, 1.0d);
        long long13 = numberHandler2.minimum((long) (byte) 100, 97L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test222");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        java.lang.String str7 = taskHandler5.getKey("hi!");
        boolean boolean9 = taskHandler5.hasNested("hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test223");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.maximum((int) (byte) 1, (int) 'a', (int) (short) -1);
        boolean boolean7 = numberHandler1.isNumber("");
        long long11 = numberHandler1.minimum((long) (byte) 0, (long) 'a', (long) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test224");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        int int15 = taskHandler1.getIndex("");
        java.lang.String str17 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test225");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 1);
        char[] charArray8 = textHandler2.newTextBuffer((int) (byte) -1);
        java.lang.String str10 = textHandler2.unescapeJava("");
        java.lang.String str12 = textHandler2.unescapeJava("");
        java.lang.String str14 = textHandler2.unescapeJava("hi!");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test226");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        boolean boolean21 = taskHandler1.isMapped("hi!");
        java.lang.String str23 = taskHandler1.getProperty("hi!");
        int int25 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test227");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        boolean boolean13 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test228");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("");
        java.lang.String str5 = taskHandler1.remove("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test229");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int9 = numberHandler5.minimum((int) (short) 10, (int) '#', (int) (byte) 100);
        long long13 = numberHandler5.minimum(35L, (long) (byte) 0, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test230");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.string2char("");
        char[] charArray6 = textHandler2.newTextBuffer((int) (byte) 0);
        java.lang.String str8 = textHandler2.unescapeJava("hi!");
        java.lang.String str10 = textHandler2.unescapeJava("hi!");
        java.lang.String str14 = textHandler2.escapeJavaStyleString("hi!", false, false);
        java.lang.String str16 = textHandler2.unescapeJava("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test231");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        boolean boolean5 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test232");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        boolean boolean5 = numberHandler3.isDigits("");
        int int8 = numberHandler3.compare((float) (short) 100, (float) (short) 100);
        long long12 = numberHandler3.minimum(0L, (long) 35, 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test233");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        boolean boolean15 = taskHandler1.isMapped("");
        boolean boolean17 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test234");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        boolean boolean15 = taskHandler1.isMapped("hi!");
        boolean boolean17 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test235");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        java.lang.String str5 = taskHandler1.getProperty("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        java.lang.String str13 = taskHandler1.findNext("");
        java.lang.String str15 = taskHandler1.getKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test236");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        int int6 = numberHandler1.compare((double) 0.0f, (double) 0L);
        int int9 = numberHandler1.compare((float) (-1), (float) (byte) 10);
        int int12 = numberHandler1.compare((float) 100L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test237");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        boolean boolean7 = numberHandler1.isDigits("hi!");
        int int11 = numberHandler1.minimum(32, (int) (short) 100, (int) (byte) -1);
        int int14 = numberHandler1.compare((float) 52, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test238");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.findNext("");
        java.lang.String str11 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test239");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject0.new SortTools();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test240");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        java.lang.String str11 = taskHandler1.getProperty("");
        java.lang.String str13 = taskHandler1.getProperty("");
        java.lang.String str15 = taskHandler1.remove("");
        java.lang.String str17 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test241");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        boolean boolean15 = taskHandler1.isMapped("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test242");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        java.lang.String str17 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test243");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test244");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isMapped("");
        java.lang.String str9 = taskHandler1.remove("");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test245");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.getProperty("");
        boolean boolean17 = taskHandler1.isIndexed("");
        boolean boolean19 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test246");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        boolean boolean15 = taskHandler1.hasNested("");
        java.lang.String str17 = taskHandler1.findNext("");
        java.lang.String str19 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test247");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test248");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        int int11 = numberHandler3.minimum((int) 'a', (int) (byte) -1, 0);
        int int14 = numberHandler3.compare((double) 100, 1.0d);
        int int17 = numberHandler3.compare((float) (-10086), (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = numberHandler3.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test249");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.getProperty("");
        java.lang.String str17 = taskHandler1.findNext("hi!");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test250");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        boolean boolean15 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test251");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.string2char("");
        java.lang.Class<?> wildcardClass5 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test252");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.maximum((int) (byte) 1, (int) 'a', (int) (short) -1);
        boolean boolean7 = numberHandler1.isNumber("");
        boolean boolean9 = numberHandler1.isNumber("");
        java.lang.Number number11 = numberHandler1.parseNumber("");
        boolean boolean13 = numberHandler1.isDigits("");
        boolean boolean15 = numberHandler1.isDigits("");
        long long19 = numberHandler1.maximum((long) 'a', (long) (-1), (-10086L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test253");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("hi!");
        boolean boolean5 = taskHandler1.isIndexed("");
        java.lang.String str7 = taskHandler1.remove("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10086) + "'", int3 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test254");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        int int8 = numberHandler4.maximum((int) (short) 10, 0, (int) (short) -1);
        long long12 = numberHandler4.maximum((long) (byte) 0, (long) (short) 0, (long) 35);
        long long16 = numberHandler4.maximum(0L, 10L, (long) '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test255");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        java.lang.String str21 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test256");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        boolean boolean15 = taskHandler1.hasNested("");
        boolean boolean17 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test257");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.minimum(0L, (long) (byte) 100, 1L);
        int int8 = numberHandler1.compare(1.0d, (double) 'a');
        boolean boolean10 = numberHandler1.isDigits("hi!");
        int int14 = numberHandler1.maximum(52, 52, (int) (short) 100);
        int int18 = numberHandler1.minimum((-1), 32, 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test258");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        boolean boolean15 = taskHandler1.hasNested("");
        java.lang.String str17 = taskHandler1.findNext("");
        boolean boolean19 = taskHandler1.hasNested("hi!");
        java.lang.String str21 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test259");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.getKey("");
        int int9 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10086) + "'", int9 == (-10086));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test260");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.remove("hi!");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        java.lang.String str21 = taskHandler1.findNext("");
        java.lang.String str23 = taskHandler1.findNext("");
        boolean boolean25 = taskHandler1.hasNested("");
        boolean boolean27 = taskHandler1.isMapped("");
        boolean boolean29 = taskHandler1.hasNested("");
        boolean boolean31 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test261");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        boolean boolean13 = taskHandler1.hasNested("");
        java.lang.String str15 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test262");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.remove("");
        boolean boolean19 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test263");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.getProperty("");
        int int17 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-10086) + "'", int17 == (-10086));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test264");
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
        java.lang.String str21 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test265");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler5 = subject0.new ParameterHandler();
        java.lang.Boolean boolean7 = parameterHandler5.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = parameterHandler5.parse("", ' ');
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test266");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.maximum((int) (byte) 1, (int) 'a', (int) (short) -1);
        boolean boolean7 = numberHandler1.isNumber("");
        boolean boolean9 = numberHandler1.isNumber("");
        java.lang.Number number11 = numberHandler1.parseNumber("");
        boolean boolean13 = numberHandler1.isDigits("");
        boolean boolean15 = numberHandler1.isDigits("");
        int int19 = numberHandler1.maximum((int) (byte) 1, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(number11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test267");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.maximum((int) (byte) 1, (int) 'a', (int) (short) -1);
        boolean boolean7 = numberHandler1.isNumber("");
        boolean boolean9 = numberHandler1.isNumber("");
        long long13 = numberHandler1.minimum(1L, (long) 32, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test268");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        java.lang.String str7 = taskHandler1.remove("");
        int int9 = taskHandler1.getIndex("");
        boolean boolean11 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test269");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        java.lang.String str7 = taskHandler1.remove("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test270");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        boolean boolean13 = taskHandler1.isIndexed("");
        java.lang.String str15 = taskHandler1.getProperty("");
        int int17 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test271");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        boolean boolean21 = taskHandler1.isMapped("hi!");
        java.lang.String str23 = taskHandler1.remove("");
        java.lang.String str25 = taskHandler1.remove("");
        java.lang.String str27 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test272");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        int int6 = numberHandler1.compare((double) (short) 10, (double) 97L);
        int int9 = numberHandler1.compare((float) (-1L), (float) 100);
        int int13 = numberHandler1.maximum((int) (short) -1, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test273");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        boolean boolean9 = taskHandler1.isMapped("hi!");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test274");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (byte) 1, 1L, (long) (-1));
        int int10 = numberHandler2.maximum((int) '#', (int) ' ', (int) '#');
        int int13 = numberHandler2.compare((float) 35, (float) 100);
        long long17 = numberHandler2.minimum((long) 0, (long) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test275");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test276");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("hi!");
        java.lang.String str7 = taskHandler1.getProperty("hi!");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.remove("");
        java.lang.String str13 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test277");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        boolean boolean15 = taskHandler1.isMapped("");
        int int17 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-10086) + "'", int17 == (-10086));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test278");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        java.lang.String str11 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test279");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("hi!");
        java.lang.String str7 = taskHandler1.getProperty("hi!");
        boolean boolean9 = taskHandler1.hasNested("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test280");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test281");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.remove("hi!");
        java.lang.String str19 = taskHandler1.findNext("hi!");
        java.lang.String str21 = taskHandler1.findNext("");
        java.lang.String str23 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test282");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isNumber("hi!");
        long long7 = numberHandler1.minimum(32L, (long) (byte) 1, (long) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test283");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        java.lang.Boolean boolean12 = parameterHandler7.toBooleanObject("hi!", "", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler7.parse("", '#');
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test284");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        boolean boolean5 = numberHandler3.isDigits("");
        int int8 = numberHandler3.compare((float) (short) 100, (float) (short) 100);
        boolean boolean10 = numberHandler3.isDigits("hi!");
        long long14 = numberHandler3.maximum(0L, (long) (-10086), (long) (short) 1);
        boolean boolean16 = numberHandler3.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test285");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.minimum(0L, (long) (byte) 100, 1L);
        int int8 = numberHandler1.compare(1.0d, (double) 'a');
        boolean boolean10 = numberHandler1.isDigits("hi!");
        int int13 = numberHandler1.compare((float) (byte) -1, (float) 97);
        boolean boolean15 = numberHandler1.isDigits("");
        int int19 = numberHandler1.maximum((int) (short) 10, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test286");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.remove("hi!");
        boolean boolean19 = taskHandler1.isMapped("hi!");
        boolean boolean21 = taskHandler1.isIndexed("hi!");
        boolean boolean23 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test287");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        boolean boolean7 = taskHandler5.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test288");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.remove("hi!");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        java.lang.String str21 = taskHandler1.findNext("");
        java.lang.String str23 = taskHandler1.findNext("");
        boolean boolean25 = taskHandler1.hasNested("");
        boolean boolean27 = taskHandler1.isMapped("");
        java.lang.String str29 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test289");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        int int8 = numberHandler4.minimum((int) ' ', (int) (byte) 1, (int) '#');
        long long12 = numberHandler4.minimum((long) (-10086), 35L, 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-10086L) + "'", long12 == (-10086L));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test290");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        int int11 = taskHandler1.getIndex("");
        int int13 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10086) + "'", int13 == (-10086));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test291");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        java.lang.String str13 = taskHandler1.getProperty("hi!");
        boolean boolean15 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test292");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        java.lang.String str8 = textHandler2.escapeJavaStyleString("", true, true);
        char[] charArray10 = textHandler2.newTextBuffer((-1));
        java.lang.String str12 = textHandler2.unescapeJava("");
        java.lang.String str16 = textHandler2.escapeJavaStyleString("", false, true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test293");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        boolean boolean7 = sortTools4.checkRange(97, 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test294");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) (-1.0f), (double) 0.0f);
        boolean boolean7 = numberHandler2.isNumber("hi!");
        java.lang.Number number9 = numberHandler2.parseNumber("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test295");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        int int19 = taskHandler1.getIndex("");
        java.lang.String str21 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test296");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        long long9 = numberHandler1.maximum((long) (byte) 10, (long) (byte) 1, (-1L));
        boolean boolean11 = numberHandler1.isDigits("");
        boolean boolean13 = numberHandler1.isNumber("hi!");
        int int16 = numberHandler1.compare((-1.0d), (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test297");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        boolean boolean21 = taskHandler1.isMapped("hi!");
        java.lang.String str23 = taskHandler1.remove("");
        java.lang.String str25 = taskHandler1.remove("");
        java.lang.String str27 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test298");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        long long9 = numberHandler1.maximum((long) (byte) 10, (long) (byte) 1, (-1L));
        long long13 = numberHandler1.maximum((long) (byte) 10, (long) '4', 0L);
        boolean boolean15 = numberHandler1.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test299");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.remove("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        int int13 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10086) + "'", int13 == (-10086));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test300");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject0.new TaskHandler();
        boolean boolean10 = taskHandler8.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test301");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject0.new TaskHandler();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test302");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test303");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        boolean boolean7 = numberHandler1.isDigits("hi!");
        int int11 = numberHandler1.minimum(32, (int) (short) 100, (int) (byte) -1);
        long long15 = numberHandler1.maximum(10L, (long) 10, (long) (-10086));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test304");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("");
        java.lang.String str17 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test305");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("hi!");
        java.lang.String str7 = taskHandler1.getProperty("hi!");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test306");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.minimum(0L, (long) (byte) 100, 1L);
        int int8 = numberHandler1.compare(1.0d, (double) 'a');
        boolean boolean10 = numberHandler1.isDigits("hi!");
        int int13 = numberHandler1.compare(1.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test307");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        java.lang.String str5 = taskHandler1.getProperty("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        java.lang.String str13 = taskHandler1.findNext("");
        int int15 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10086) + "'", int15 == (-10086));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test308");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        boolean boolean6 = numberHandler2.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test309");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        int int11 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10086) + "'", int11 == (-10086));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test310");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str6 = textHandler2.escapeJavaStyleString("hi!", true, false);
        java.lang.String str10 = textHandler2.escapeJavaStyleString("hi!", false, false);
        java.lang.String str12 = textHandler2.unescapeJava("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test311");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (byte) 1, 1L, (long) (-1));
        int int10 = numberHandler2.maximum((int) '#', (int) ' ', (int) '#');
        int int14 = numberHandler2.maximum((int) (byte) -1, 1, (int) (short) 100);
        long long18 = numberHandler2.maximum((long) (byte) 1, (long) (-10086), (long) '4');
        java.lang.Class<?> wildcardClass19 = numberHandler2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test312");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.getProperty("");
        boolean boolean17 = taskHandler1.isIndexed("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test313");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        int int17 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test314");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        boolean boolean9 = numberHandler3.isDigits("hi!");
        int int13 = numberHandler3.maximum((int) '#', 0, 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test315");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) (-1.0f), (double) 0.0f);
        boolean boolean7 = numberHandler2.isNumber("hi!");
        boolean boolean9 = numberHandler2.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test316");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        int int13 = taskHandler1.getIndex("hi!");
        boolean boolean15 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10086) + "'", int13 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test317");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        java.lang.String str7 = taskHandler1.getProperty("");
        int int9 = taskHandler1.getIndex("hi!");
        java.lang.String str11 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10086) + "'", int9 == (-10086));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test318");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler5 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler6 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler7 = subject0.new TaskHandler();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test319");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (byte) 1, 1L, (long) (-1));
        int int10 = numberHandler2.maximum((int) '#', (int) ' ', (int) '#');
        int int14 = numberHandler2.maximum((int) (byte) -1, 1, (int) (short) 100);
        boolean boolean16 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test320");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        long long9 = numberHandler1.maximum((long) (byte) 10, (long) (byte) 1, (-1L));
        int int13 = numberHandler1.maximum((int) (byte) 0, (int) (byte) -1, (int) (short) -1);
        long long17 = numberHandler1.maximum(100L, 0L, 0L);
        boolean boolean19 = numberHandler1.isNumber("");
        int int22 = numberHandler1.compare((double) (-1.0f), (double) 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test321");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        long long9 = numberHandler1.maximum((long) (byte) 10, (long) (byte) 1, (-1L));
        int int13 = numberHandler1.maximum((int) (byte) 0, (int) (byte) -1, (int) (short) -1);
        long long17 = numberHandler1.maximum(100L, 0L, 0L);
        boolean boolean19 = numberHandler1.isNumber("");
        boolean boolean21 = numberHandler1.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test322");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.isIndexed("");
        java.lang.String str7 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test323");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        long long11 = numberHandler3.minimum((long) '#', (long) (byte) -1, 10L);
        long long15 = numberHandler3.maximum((long) 10, 32L, 1L);
        int int18 = numberHandler3.compare((double) 32L, 100.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test324");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("hi!");
        boolean boolean5 = taskHandler1.isIndexed("");
        boolean boolean7 = taskHandler1.isMapped("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10086) + "'", int3 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test325");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("hi!");
        boolean boolean5 = numberHandler1.isDigits("");
        boolean boolean7 = numberHandler1.isDigits("hi!");
        int int10 = numberHandler1.compare((double) (byte) 1, (double) 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test326");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.isIndexed("");
        boolean boolean12 = taskHandler6.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test327");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test328");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        boolean boolean21 = taskHandler1.isMapped("hi!");
        boolean boolean23 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test329");
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
        int int16 = taskHandler6.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10086) + "'", int16 == (-10086));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test330");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        boolean boolean13 = taskHandler1.hasNested("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        boolean boolean17 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test331");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.getKey("");
        java.lang.String str9 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test332");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.string2char("");
        char[] charArray6 = textHandler2.newTextBuffer((int) (byte) 0);
        java.lang.String str8 = textHandler2.unescapeJava("hi!");
        java.lang.String str10 = textHandler2.unescapeJava("hi!");
        java.lang.String str14 = textHandler2.escapeJavaStyleString("", true, false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test333");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        boolean boolean13 = taskHandler1.hasNested("");
        boolean boolean15 = taskHandler1.isMapped("");
        boolean boolean17 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test334");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.string2char("");
        char[] charArray6 = textHandler2.string2char("");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test335");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test336");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        java.lang.String str7 = taskHandler5.getKey("");
        java.lang.String str9 = taskHandler5.getKey("");
        java.lang.String str11 = taskHandler5.getKey("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test337");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        boolean boolean9 = numberHandler3.isDigits("hi!");
        int int13 = numberHandler3.maximum(32, (int) 'a', (int) (short) -1);
        int int16 = numberHandler3.compare(10.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test338");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        boolean boolean9 = taskHandler1.isMapped("hi!");
        java.lang.String str11 = taskHandler1.getProperty("hi!");
        java.lang.String str13 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test339");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.minimum(0L, (long) (byte) 100, 1L);
        int int8 = numberHandler1.compare(1.0d, (double) 'a');
        boolean boolean10 = numberHandler1.isNumber("");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test340");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test341");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler11 = subject0.new NumberHandler();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test342");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        boolean boolean13 = taskHandler1.hasNested("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test343");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        java.lang.String str7 = taskHandler1.getKey("");
        boolean boolean9 = taskHandler1.hasNested("");
        java.lang.String str11 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test344");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.minimum(0L, (long) (byte) 100, 1L);
        int int8 = numberHandler1.compare(1.0d, (double) 'a');
        int int11 = numberHandler1.compare((double) 52, (double) (byte) 100);
        int int14 = numberHandler1.compare((float) (byte) -1, (float) 52);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test345");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test346");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.minimum(97, (int) (byte) 0, (int) (byte) -1);
        int int8 = numberHandler1.compare((double) (byte) 10, 10.0d);
        int int11 = numberHandler1.compare((float) 100, 1.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test347");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.minimum(97, (int) (byte) 0, (int) (byte) -1);
        int int9 = numberHandler1.minimum(1, 32, (int) '4');
        long long13 = numberHandler1.minimum(0L, (long) (byte) 100, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test348");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.findNext("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test349");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.minimum(97, (int) (byte) 0, (int) (byte) -1);
        int int8 = numberHandler1.compare((double) (byte) 10, 10.0d);
        long long12 = numberHandler1.minimum((long) 35, (long) 97, (long) (-10086));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-10086L) + "'", long12 == (-10086L));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test350");
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
        boolean boolean19 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test351");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.findNext("");
        boolean boolean13 = taskHandler1.isMapped("");
        boolean boolean15 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test352");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        int int9 = taskHandler1.getIndex("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        java.lang.String str13 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test353");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.hasNested("hi!");
        boolean boolean12 = taskHandler6.isIndexed("hi!");
        java.lang.String str14 = taskHandler6.remove("");
        int int16 = taskHandler6.getIndex("");
        java.lang.String str18 = taskHandler6.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test354");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("hi!");
        boolean boolean5 = taskHandler1.hasNested("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10086) + "'", int3 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test355");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject0.new TaskHandler();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test356");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        int int6 = numberHandler1.compare((double) 0.0f, (double) 0L);
        int int9 = numberHandler1.compare((float) (-1), (float) (byte) 10);
        int int12 = numberHandler1.compare(0.0f, (float) ' ');
        int int16 = numberHandler1.minimum((int) 'a', 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test357");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.findNext("hi!");
        java.lang.String str15 = taskHandler1.remove("");
        java.lang.String str17 = taskHandler1.remove("hi!");
        java.lang.String str19 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test358");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.getProperty("");
        java.lang.String str17 = taskHandler1.findNext("hi!");
        int int19 = taskHandler1.getIndex("hi!");
        boolean boolean21 = taskHandler1.isMapped("");
        boolean boolean23 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-10086) + "'", int19 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test359");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        int int8 = numberHandler2.minimum((int) (short) 1, (int) (short) 1, 52);
        int int11 = numberHandler2.compare((double) (short) -1, (double) (-10086));
        int int14 = numberHandler2.compare((float) (byte) 100, (float) 'a');
        int int17 = numberHandler2.compare((float) 100, (float) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test360");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        java.lang.String str15 = taskHandler1.remove("");
        boolean boolean17 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test361");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        java.lang.Class<?> wildcardClass9 = taskHandler6.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test362");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        java.lang.String str9 = taskHandler1.getKey("");
        boolean boolean11 = taskHandler1.isMapped("");
        java.lang.String str13 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test363");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.getKey("");
        java.lang.String str13 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test364");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.remove("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        int int13 = taskHandler1.getIndex("");
        boolean boolean15 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test365");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        boolean boolean15 = taskHandler1.isIndexed("");
        boolean boolean17 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test366");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (short) 100, (long) (byte) 100, 35L);
        boolean boolean8 = numberHandler2.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test367");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        boolean boolean15 = taskHandler1.isIndexed("hi!");
        java.lang.String str17 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test368");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        long long9 = numberHandler1.maximum((long) (byte) 10, (long) (byte) 1, (-1L));
        long long13 = numberHandler1.maximum((long) (byte) 10, (long) '4', 0L);
        int int17 = numberHandler1.maximum((int) (short) 10, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test369");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        int int11 = numberHandler3.minimum((int) 'a', (int) (byte) -1, 0);
        int int14 = numberHandler3.compare((double) 100, 1.0d);
        long long18 = numberHandler3.maximum((long) (-1), (long) (-10086), (long) 35);
        int int22 = numberHandler3.maximum((int) (short) 0, (-1), 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test370");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        java.lang.String str8 = textHandler2.escapeJavaStyleString("", false, false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test371");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.getKey("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        boolean boolean11 = taskHandler1.hasNested("");
        java.lang.String str13 = taskHandler1.findNext("");
        java.lang.String str15 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test372");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        java.lang.String str13 = taskHandler1.getProperty("hi!");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test373");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.minimum(0L, (long) (byte) 100, 1L);
        int int8 = numberHandler1.compare(1.0d, (double) 'a');
        boolean boolean10 = numberHandler1.isDigits("hi!");
        int int14 = numberHandler1.maximum(52, 52, (int) (short) 100);
        int int18 = numberHandler1.maximum((int) (byte) 0, 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test374");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.remove("");
        java.lang.String str11 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test375");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.hasNested("hi!");
        boolean boolean12 = taskHandler6.isIndexed("hi!");
        java.lang.String str14 = taskHandler6.remove("");
        int int16 = taskHandler6.getIndex("");
        java.lang.String str18 = taskHandler6.getKey("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test376");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.minimum(97, (int) (byte) 0, (int) (byte) -1);
        int int9 = numberHandler1.minimum(1, 10, 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test377");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        boolean boolean9 = taskHandler1.isIndexed("hi!");
        java.lang.String str11 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test378");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        java.lang.String str7 = taskHandler1.remove("");
        java.lang.String str9 = taskHandler1.remove("");
        int int11 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test379");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        java.lang.String str7 = taskHandler1.getProperty("");
        java.lang.String str9 = taskHandler1.remove("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test380");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        int int11 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test381");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test382");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        long long11 = numberHandler3.minimum((long) '#', (long) (byte) -1, 10L);
        int int15 = numberHandler3.minimum(0, (int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test383");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        java.lang.String str21 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test384");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test385");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int9 = numberHandler5.minimum((int) (short) 10, (int) '#', (int) (byte) 100);
        int int12 = numberHandler5.compare((double) 97, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test386");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject0.new SortTools();
        int[] intArray6 = null;
        int[] intArray10 = sortTools5.siftDown(intArray6, (-1), (int) ' ', (int) '#');
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test387");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 1);
        char[] charArray8 = textHandler2.newTextBuffer((int) (byte) -1);
        java.lang.String str10 = textHandler2.unescapeJava("");
        java.lang.String str12 = textHandler2.unescapeJava("hi!");
        char[] charArray14 = textHandler2.string2char("hi!");
        java.lang.String str18 = textHandler2.escapeJavaStyleString("hi!", true, false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[h, i, !]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test388");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("");
        boolean boolean5 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test389");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        boolean boolean5 = taskHandler1.isIndexed("");
        java.lang.String str7 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test390");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.String str11 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test391");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        java.lang.String str13 = taskHandler1.findNext("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        int int19 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-10086) + "'", int19 == (-10086));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test392");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        boolean boolean9 = taskHandler1.hasNested("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test393");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        java.lang.Class<?> wildcardClass8 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test394");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        boolean boolean21 = taskHandler1.isMapped("hi!");
        java.lang.String str23 = taskHandler1.remove("");
        java.lang.String str25 = taskHandler1.remove("");
        boolean boolean27 = taskHandler1.isIndexed("");
        java.lang.String str29 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test395");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        java.lang.Boolean boolean12 = parameterHandler7.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean17 = parameterHandler7.toBooleanObject(0, (int) (short) 0, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test396");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.getProperty("");
        java.lang.String str17 = taskHandler1.getKey("hi!");
        java.lang.String str19 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test397");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        boolean boolean15 = taskHandler1.hasNested("");
        java.lang.String str17 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test398");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        long long9 = numberHandler1.maximum((long) (byte) 10, (long) (byte) 1, (-1L));
        boolean boolean11 = numberHandler1.isDigits("");
        boolean boolean13 = numberHandler1.isNumber("hi!");
        int int16 = numberHandler1.compare(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test399");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        int int11 = numberHandler3.minimum((int) 'a', (int) (byte) -1, 0);
        int int14 = numberHandler3.compare((double) 100, 1.0d);
        long long18 = numberHandler3.maximum((long) (byte) -1, (long) 'a', (long) (byte) -1);
        int int21 = numberHandler3.compare(0.0f, (float) 10);
        long long25 = numberHandler3.minimum((-10086L), 0L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-10086L) + "'", long25 == (-10086L));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test400");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler4 = subject0.new TextHandler();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test401");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        boolean boolean15 = taskHandler1.isMapped("");
        int int17 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test402");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        int int9 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10086) + "'", int9 == (-10086));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test403");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.getKey("");
        boolean boolean17 = taskHandler1.hasNested("");
        java.lang.String str19 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test404");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        int int13 = taskHandler1.getIndex("");
        java.lang.String str15 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test405");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        boolean boolean9 = taskHandler1.hasNested("");
        int int11 = taskHandler1.getIndex("hi!");
        int int13 = taskHandler1.getIndex("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10086) + "'", int11 == (-10086));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test406");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.Class<?> wildcardClass14 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test407");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        boolean boolean5 = taskHandler1.isIndexed("hi!");
        int int7 = taskHandler1.getIndex("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test408");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        boolean boolean21 = taskHandler1.isMapped("hi!");
        java.lang.String str23 = taskHandler1.remove("");
        java.lang.String str25 = taskHandler1.remove("");
        java.lang.String str27 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test409");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler7 = subject0.new TaskHandler();
        boolean boolean9 = taskHandler7.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test410");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 1);
        char[] charArray8 = textHandler2.newTextBuffer((int) (byte) -1);
        java.lang.String str10 = textHandler2.unescapeJava("");
        java.lang.Class<?> wildcardClass11 = textHandler2.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test411");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        java.lang.String str7 = taskHandler5.getKey("hi!");
        java.lang.String str9 = taskHandler5.getKey("");
        java.lang.String str11 = taskHandler5.findNext("hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test412");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        boolean boolean15 = taskHandler1.isMapped("");
        java.lang.String str17 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test413");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.maximum((int) (byte) 1, (int) 'a', (int) (short) -1);
        int int8 = numberHandler1.compare(0.0f, (float) (short) -1);
        int int11 = numberHandler1.compare((double) (-10086L), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test414");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        java.lang.String str15 = taskHandler1.getKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test415");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.findNext("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.remove("hi!");
        java.lang.String str17 = taskHandler1.getProperty("");
        java.lang.String str19 = taskHandler1.findNext("");
        java.lang.String str21 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test416");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.remove("hi!");
        java.lang.String str11 = taskHandler1.getKey("");
        int int13 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10086) + "'", int13 == (-10086));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test417");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        java.lang.String str15 = taskHandler1.remove("");
        java.lang.String str17 = taskHandler1.remove("");
        boolean boolean19 = taskHandler1.isIndexed("");
        java.lang.String str21 = taskHandler1.findNext("hi!");
        boolean boolean23 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test418");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        int[] intArray4 = null;
        int[] intArray8 = sortTools3.siftDown(intArray4, 1, (int) (byte) 0, 1);
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test419");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.hasNested("hi!");
        java.lang.String str15 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test420");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler10 = subject0.new NumberHandler();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test421");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        int int8 = numberHandler4.maximum((int) (short) 10, 0, (int) (short) -1);
        long long12 = numberHandler4.maximum((long) (byte) 1, (long) (short) -1, (long) (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test422");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        java.lang.String str6 = textHandler2.unescapeJava("hi!");
        java.lang.String str10 = textHandler2.escapeJavaStyleString("hi!", false, false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test423");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.findNext("");
        java.lang.String str13 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test424");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        boolean boolean5 = numberHandler3.isDigits("");
        long long9 = numberHandler3.maximum((long) ' ', (long) (-10086), (long) (short) 1);
        long long13 = numberHandler3.minimum((long) (byte) 10, 1L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test425");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.findNext("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.remove("hi!");
        java.lang.String str17 = taskHandler1.findNext("hi!");
        boolean boolean19 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test426");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        boolean boolean7 = taskHandler5.isIndexed("");
        java.lang.String str9 = taskHandler5.remove("hi!");
        boolean boolean11 = taskHandler5.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test427");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.hasNested("hi!");
        java.lang.String str12 = taskHandler6.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test428");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        int int6 = numberHandler1.compare((double) 0.0f, (double) 0L);
        int int9 = numberHandler1.compare((float) (-1), (float) (byte) 10);
        int int12 = numberHandler1.compare((float) (-1L), 10.0f);
        long long16 = numberHandler1.maximum((long) 97, (long) 'a', 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test429");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (byte) 1, 1L, (long) (-1));
        int int10 = numberHandler2.maximum((int) '#', (int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass11 = numberHandler2.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test430");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.getKey("");
        java.lang.String str19 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test431");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) (-1.0f), (double) 0.0f);
        boolean boolean7 = numberHandler2.isNumber("hi!");
        long long11 = numberHandler2.minimum(52L, 97L, 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test432");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.remove("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        boolean boolean15 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test433");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int9 = numberHandler5.minimum((int) (short) 10, (int) '#', (int) (byte) 100);
        int int12 = numberHandler5.compare((float) ' ', (float) '4');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test434");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        boolean boolean9 = taskHandler1.hasNested("");
        int int11 = taskHandler1.getIndex("hi!");
        int int13 = taskHandler1.getIndex("");
        boolean boolean15 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10086) + "'", int11 == (-10086));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test435");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isMapped("");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.getProperty("hi!");
        java.lang.String str13 = taskHandler1.getProperty("");
        boolean boolean15 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test436");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test437");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        int int11 = numberHandler3.minimum((int) 'a', (int) (byte) -1, 0);
        int int14 = numberHandler3.compare((double) 100, 1.0d);
        long long18 = numberHandler3.maximum((long) (byte) -1, (long) 'a', (long) (byte) -1);
        int int21 = numberHandler3.compare(0.0f, (float) 10);
        int int25 = numberHandler3.maximum(0, 100, 97);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test438");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        java.lang.String str15 = taskHandler1.remove("");
        java.lang.String str17 = taskHandler1.remove("");
        boolean boolean19 = taskHandler1.isIndexed("");
        boolean boolean21 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test439");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test440");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.findNext("hi!");
        java.lang.String str7 = taskHandler1.getProperty("");
        java.lang.String str9 = taskHandler1.getKey("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test441");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler5 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler6 = subject0.new NumberHandler();
        int int9 = numberHandler6.compare((double) '4', (double) (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test442");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        java.lang.String str13 = taskHandler1.findNext("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        boolean boolean19 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test443");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        java.lang.String str5 = taskHandler1.getProperty("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.getProperty("");
        boolean boolean13 = taskHandler1.hasNested("hi!");
        java.lang.Class<?> wildcardClass14 = taskHandler1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test444");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.findNext("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        java.lang.String str15 = taskHandler1.remove("hi!");
        java.lang.String str17 = taskHandler1.findNext("hi!");
        java.lang.String str19 = taskHandler1.getProperty("");
        boolean boolean21 = taskHandler1.isIndexed("");
        java.lang.String str23 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test445");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isIndexed("hi!");
        boolean boolean9 = taskHandler1.isIndexed("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test446");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        boolean boolean11 = taskHandler1.isMapped("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        java.lang.String str15 = taskHandler1.remove("");
        java.lang.String str17 = taskHandler1.remove("");
        boolean boolean19 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test447");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        java.lang.String str5 = taskHandler1.getProperty("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        int int13 = taskHandler1.getIndex("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test448");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.hasNested("");
        java.lang.String str10 = taskHandler6.remove("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test449");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler8 = subject0.new TextHandler();
        char[] charArray10 = textHandler8.newTextBuffer((-1));
        char[] charArray12 = textHandler8.newTextBuffer(52);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test450");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        boolean boolean9 = taskHandler1.hasNested("");
        java.lang.String str11 = taskHandler1.getKey("");
        int int13 = taskHandler1.getIndex("");
        boolean boolean15 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test451");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.minimum(0L, (long) (byte) 100, 1L);
        int int8 = numberHandler1.compare(1.0d, (double) 'a');
        int int11 = numberHandler1.compare((double) 52, (double) (byte) 100);
        long long15 = numberHandler1.minimum((long) 97, (long) (-10086), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10086L) + "'", long15 == (-10086L));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test452");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.hasNested("hi!");
        boolean boolean12 = taskHandler6.isIndexed("hi!");
        java.lang.String str14 = taskHandler6.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test453");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = parameterHandler3.parse("", 'a');
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test454");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        boolean boolean19 = taskHandler1.isIndexed("");
        int int21 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10086) + "'", int21 == (-10086));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test455");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        boolean boolean13 = taskHandler1.hasNested("");
        boolean boolean15 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test456");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        boolean boolean13 = taskHandler1.isIndexed("");
        java.lang.String str15 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test457");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(0L, (long) (byte) 10, (long) 1);
        long long11 = numberHandler3.minimum((long) '#', (long) (byte) -1, 10L);
        boolean boolean13 = numberHandler3.isDigits("");
        boolean boolean15 = numberHandler3.isNumber("hi!");
        long long19 = numberHandler3.minimum(32L, (long) (short) 100, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test458");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        int int11 = numberHandler8.compare((double) 100.0f, (double) 1);
        int int14 = numberHandler8.compare((double) 35, 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test459");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        boolean boolean5 = numberHandler3.isDigits("");
        boolean boolean7 = numberHandler3.isNumber("");
        int int11 = numberHandler3.minimum(35, 35, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test460");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        boolean boolean13 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test461");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        boolean boolean15 = taskHandler1.hasNested("");
        boolean boolean17 = taskHandler1.isMapped("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test462");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.remove("hi!");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test463");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test464");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        java.lang.String str13 = taskHandler1.getProperty("hi!");
        java.lang.String str15 = taskHandler1.remove("");
        boolean boolean17 = taskHandler1.hasNested("");
        java.lang.String str19 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test465");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isIndexed("");
        boolean boolean5 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test466");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (short) 100, (long) (byte) 100, 35L);
        int int9 = numberHandler2.compare((double) (-10086L), 10.0d);
        int int12 = numberHandler2.compare((double) (short) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test467");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        boolean boolean17 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test468");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.isMapped("");
        int int12 = taskHandler6.getIndex("hi!");
        boolean boolean14 = taskHandler6.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test469");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.minimum(97, (int) (byte) 0, (int) (byte) -1);
        int int9 = numberHandler1.minimum(1, 32, (int) '4');
        int int12 = numberHandler1.compare((double) 100, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test470");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("");
        boolean boolean11 = taskHandler1.hasNested("hi!");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        int int15 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10086) + "'", int15 == (-10086));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test471");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.remove("hi!");
        boolean boolean11 = taskHandler1.isIndexed("");
        java.lang.String str13 = taskHandler1.findNext("hi!");
        java.lang.String str15 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test472");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test473");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        java.lang.String str8 = textHandler2.escapeJavaStyleString("", true, true);
        char[] charArray10 = textHandler2.newTextBuffer((-1));
        java.lang.String str14 = textHandler2.escapeJavaStyleString("", true, true);
        java.lang.String str16 = textHandler2.unescapeJava("");
        java.lang.Class<?> wildcardClass17 = textHandler2.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test474");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("");
        int int9 = taskHandler1.getIndex("");
        int int11 = taskHandler1.getIndex("");
        boolean boolean13 = taskHandler1.isIndexed("hi!");
        boolean boolean15 = taskHandler1.hasNested("hi!");
        java.lang.String str17 = taskHandler1.getProperty("");
        java.lang.String str19 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test475");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.hasNested("hi!");
        boolean boolean12 = taskHandler6.isIndexed("hi!");
        java.lang.String str14 = taskHandler6.remove("");
        int int16 = taskHandler6.getIndex("");
        boolean boolean18 = taskHandler6.isMapped("");
        boolean boolean20 = taskHandler6.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test476");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.remove("hi!");
        java.lang.String str21 = taskHandler1.getProperty("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test477");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.getProperty("hi!");
        java.lang.String str17 = taskHandler1.remove("hi!");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        java.lang.String str21 = taskHandler1.findNext("");
        java.lang.String str23 = taskHandler1.findNext("");
        boolean boolean25 = taskHandler1.hasNested("");
        boolean boolean27 = taskHandler1.isMapped("");
        boolean boolean29 = taskHandler1.hasNested("");
        java.lang.String str31 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test478");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (byte) 1, 1L, (long) (-1));
        int int10 = numberHandler2.maximum((int) '#', (int) ' ', (int) '#');
        int int13 = numberHandler2.compare((double) (byte) -1, (double) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test479");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isNumber("hi!");
        long long7 = numberHandler1.minimum((long) 0, (long) '4', (long) (-10086));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-10086L) + "'", long7 == (-10086L));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test480");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("hi!");
        int int6 = numberHandler1.compare((float) (short) 0, (float) 97);
        long long10 = numberHandler1.minimum((long) (-1), (long) (short) 1, 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test481");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        boolean boolean5 = numberHandler1.isNumber("hi!");
        long long9 = numberHandler1.maximum((long) (byte) 10, (long) (byte) 1, (-1L));
        int int13 = numberHandler1.maximum((int) (byte) 0, (int) (byte) -1, (int) (short) -1);
        long long17 = numberHandler1.maximum(100L, 0L, 0L);
        boolean boolean19 = numberHandler1.isNumber("");
        int int22 = numberHandler1.compare(0.0d, (-1.0d));
        long long26 = numberHandler1.minimum((long) 100, 35L, 100L);
        int int29 = numberHandler1.compare(1.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test482");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test483");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.hasNested("hi!");
        boolean boolean12 = taskHandler6.hasNested("hi!");
        boolean boolean14 = taskHandler6.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test484");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        int int7 = numberHandler4.compare((float) 0L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test485");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.isMapped("");
        java.lang.String str12 = taskHandler6.remove("");
        boolean boolean14 = taskHandler6.isIndexed("hi!");
        java.lang.String str16 = taskHandler6.getKey("hi!");
        boolean boolean18 = taskHandler6.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test486");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer(100);
        char[] charArray6 = textHandler2.newTextBuffer((int) (short) 1);
        char[] charArray8 = textHandler2.newTextBuffer((int) (byte) -1);
        java.lang.String str10 = textHandler2.unescapeJava("");
        java.lang.String str12 = textHandler2.unescapeJava("");
        char[] charArray14 = textHandler2.newTextBuffer(0);
        char[] charArray16 = textHandler2.newTextBuffer(32);
        java.lang.String str20 = textHandler2.escapeJavaStyleString("", false, true);
        char[] charArray22 = textHandler2.string2char("hi!");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[h, i, !]");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test487");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("hi!");
        boolean boolean10 = taskHandler6.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test488");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        java.lang.String str7 = taskHandler1.getProperty("");
        int int9 = taskHandler1.getIndex("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.remove("hi!");
        boolean boolean17 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10086) + "'", int9 == (-10086));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test489");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        int int13 = taskHandler1.getIndex("hi!");
        java.lang.String str15 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10086) + "'", int13 == (-10086));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test490");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        boolean boolean11 = taskHandler1.isIndexed("hi!");
        boolean boolean13 = taskHandler1.isMapped("hi!");
        boolean boolean15 = taskHandler1.isIndexed("");
        java.lang.String str17 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test491");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        java.lang.String str9 = taskHandler1.getProperty("hi!");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        boolean boolean13 = taskHandler1.isMapped("");
        java.lang.String str15 = taskHandler1.findNext("hi!");
        boolean boolean17 = taskHandler1.isMapped("");
        java.lang.String str19 = taskHandler1.getKey("hi!");
        boolean boolean21 = taskHandler1.isMapped("hi!");
        java.lang.String str23 = taskHandler1.remove("");
        java.lang.String str25 = taskHandler1.remove("");
        int int27 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test492");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.String str11 = taskHandler1.remove("hi!");
        int int13 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test493");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("");
        boolean boolean7 = taskHandler1.isMapped("");
        java.lang.String str9 = taskHandler1.findNext("hi!");
        java.lang.String str11 = taskHandler1.getProperty("hi!");
        int int13 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test494");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test495");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("");
        int int7 = taskHandler1.getIndex("hi!");
        boolean boolean9 = taskHandler1.isMapped("");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        java.lang.String str13 = taskHandler1.remove("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test496");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("");
        java.lang.String str5 = taskHandler1.remove("hi!");
        java.lang.String str7 = taskHandler1.getProperty("hi!");
        boolean boolean9 = taskHandler1.hasNested("hi!");
        boolean boolean11 = taskHandler1.isIndexed("");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test497");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        java.lang.String str9 = taskHandler1.findNext("");
        java.lang.String str11 = taskHandler1.getKey("hi!");
        java.lang.String str13 = taskHandler1.getKey("hi!");
        int int15 = taskHandler1.getIndex("");
        java.lang.Class<?> wildcardClass16 = taskHandler1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test498");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        java.lang.String str5 = taskHandler1.remove("hi!");
        java.lang.String str7 = taskHandler1.remove("");
        java.lang.String str9 = taskHandler1.remove("");
        boolean boolean11 = taskHandler1.isMapped("");
        java.lang.String str13 = taskHandler1.getKey("");
        java.lang.String str15 = taskHandler1.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test499");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        boolean boolean7 = taskHandler1.isIndexed("");
        java.lang.String str9 = taskHandler1.remove("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        int int13 = taskHandler1.getIndex("");
        boolean boolean15 = taskHandler1.isMapped("");
        int int17 = taskHandler1.getIndex("");
        java.lang.String str19 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test0.test500");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("hi!");
        long long7 = numberHandler1.minimum((long) (short) 0, (long) (byte) -1, 0L);
        int int11 = numberHandler1.maximum((int) (byte) 1, 97, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }
}

