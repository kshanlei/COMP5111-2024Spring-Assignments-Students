package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestTask2 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.Class<?> wildcardClass2 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject(10, (int) (short) 100, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        boolean[] booleanArray5 = new boolean[] { false, false, true };
        boolean boolean6 = parameterHandler1.hasOneTrue(booleanArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) (byte) 0, (int) (short) 1, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject((int) (short) 0, (int) (byte) 1, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("");
        boolean boolean5 = taskHandler1.hasNested("");
        java.lang.String str7 = taskHandler1.remove("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        boolean[] booleanArray5 = new boolean[] { false, false, true };
        boolean boolean6 = parameterHandler1.hasOneTrue(booleanArray5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = parameterHandler1.parse("", ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap12 = parameterHandler1.parse("", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean17 = parameterHandler1.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        boolean[] booleanArray5 = new boolean[] { false, false, true };
        boolean boolean6 = parameterHandler1.hasOneTrue(booleanArray5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = parameterHandler1.parse("", ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap12 = parameterHandler1.parse("", 'a');
        boolean[] booleanArray16 = new boolean[] { true, false, true };
        boolean boolean17 = parameterHandler1.hasOneTrue(booleanArray16);
        java.lang.Boolean boolean22 = parameterHandler1.toBooleanObject("", "", "hi!", "");
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler24 = subject23.new ParameterHandler();
        boolean[] booleanArray28 = new boolean[] { false, false, true };
        boolean boolean29 = parameterHandler24.hasOneTrue(booleanArray28);
        boolean boolean30 = parameterHandler1.hasOneTrue(booleanArray28);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + boolean22 + "' != '" + true + "'", boolean22, true);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        boolean boolean5 = taskHandler1.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("");
        boolean boolean5 = taskHandler1.isIndexed("hi!");
        java.lang.String str7 = taskHandler1.getKey("");
        boolean boolean9 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        boolean[] booleanArray5 = new boolean[] { false, false, true };
        boolean boolean6 = parameterHandler1.hasOneTrue(booleanArray5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = parameterHandler1.parse("", ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap12 = parameterHandler1.parse("", 'a');
        boolean[] booleanArray16 = new boolean[] { true, false, true };
        boolean boolean17 = parameterHandler1.hasOneTrue(booleanArray16);
        java.lang.Boolean boolean22 = parameterHandler1.toBooleanObject("", "hi!", "hi!", "");
        java.lang.Boolean boolean24 = parameterHandler1.toBooleanObject("");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject((-1), 1, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("hi!");
        boolean boolean5 = taskHandler1.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("");
        java.lang.String str5 = taskHandler1.remove("");
        java.lang.String str7 = taskHandler1.remove("hi!");
        boolean boolean9 = taskHandler1.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.hasNested("");
        int int5 = taskHandler1.getIndex("hi!");
        int int7 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("");
        boolean boolean5 = taskHandler1.isIndexed("hi!");
        java.lang.String str7 = taskHandler1.getKey("");
        java.lang.String str9 = taskHandler1.getKey("");
        java.lang.String str11 = taskHandler1.findNext("");
        boolean boolean13 = taskHandler1.hasNested("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isIndexed("");
        boolean boolean5 = taskHandler1.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        boolean[] booleanArray5 = new boolean[] { false, false, true };
        boolean boolean6 = parameterHandler1.hasOneTrue(booleanArray5);
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("");
        boolean boolean5 = taskHandler1.isIndexed("hi!");
        java.lang.String str7 = taskHandler1.getKey("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("");
        boolean boolean5 = taskHandler1.isIndexed("hi!");
        java.lang.String str7 = taskHandler1.getKey("");
        java.lang.String str9 = taskHandler1.getKey("");
        java.lang.String str11 = taskHandler1.remove("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        boolean[] booleanArray5 = new boolean[] { false, false, true };
        boolean boolean6 = parameterHandler1.hasOneTrue(booleanArray5);
        java.lang.Boolean boolean8 = parameterHandler1.toBooleanObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean13 = parameterHandler1.toBooleanObject((int) '#', 0, (-10086), (-10086));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        boolean[] booleanArray5 = new boolean[] { false, false, true };
        boolean boolean6 = parameterHandler1.hasOneTrue(booleanArray5);
        java.lang.Boolean boolean8 = parameterHandler1.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = parameterHandler1.parse("", '#');
        boolean[] booleanArray16 = new boolean[] { true, false, false, true };
        boolean boolean17 = parameterHandler1.hasOneTrue(booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("");
        java.lang.String str5 = taskHandler1.remove("");
        java.lang.String str7 = taskHandler1.remove("hi!");
        int int9 = taskHandler1.getIndex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }
}

