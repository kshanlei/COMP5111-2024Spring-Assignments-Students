import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        java.lang.String str3 = textHandler1.unescapeJava("hi!");
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject4.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler6 = subject4.new TextHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler8 = subject7.new TextHandler();
        char[] charArray10 = textHandler8.string2char("");
        char[] charArray13 = textHandler6.toUpperCase(charArray10, 10, (int) (short) -1);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject14.new TextHandler();
        char[] charArray17 = textHandler15.string2char("");
        char[] charArray20 = textHandler6.toLowerCase(charArray17, 0, (int) (short) 10);
        char[] charArray23 = textHandler1.toLowerCase(charArray17, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNull(charArray23);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.maximum(0, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler4 = subject3.new TextHandler();
        char[] charArray6 = textHandler4.string2char("");
        char[] charArray9 = textHandler2.toUpperCase(charArray6, 10, (int) (short) -1);
        java.lang.String str11 = textHandler2.unescapeJava("");
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler13 = subject12.new TextHandler();
        char[] charArray15 = textHandler13.string2char("");
        char[] charArray18 = textHandler2.toUpperCase(charArray15, 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
        org.junit.Assert.assertNull(charArray18);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        long long5 = numberHandler1.maximum((long) (short) 0, (long) ' ', (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.minimum((int) (byte) 100, (int) (byte) 0, (int) ' ');
        long long9 = numberHandler1.minimum(0L, (long) (byte) 0, (long) '#');
        boolean boolean11 = numberHandler1.isNumber("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = parameterHandler1.hasOneTrue(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        char[] charArray3 = textHandler1.string2char("");
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject4.new TextHandler();
        char[] charArray7 = textHandler5.string2char("");
        char[] charArray10 = textHandler1.toUpperCase(charArray7, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNull(charArray10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean3 = parameterHandler1.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = parameterHandler1.parse("", 'a');
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler4 = subject3.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject3.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler7 = subject6.new TextHandler();
        char[] charArray9 = textHandler7.string2char("");
        char[] charArray12 = textHandler5.toUpperCase(charArray9, 10, (int) (short) -1);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler14 = subject13.new TextHandler();
        char[] charArray16 = textHandler14.string2char("");
        char[] charArray19 = textHandler5.toLowerCase(charArray16, 0, (int) (short) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = parameterHandler1.parse("hi!", charArray19);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject2.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler4 = subject2.new TextHandler();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler6 = subject5.new TextHandler();
        char[] charArray8 = textHandler6.string2char("");
        char[] charArray11 = textHandler4.toUpperCase(charArray8, 10, (int) (short) -1);
        char[] charArray13 = textHandler4.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = parameterHandler1.parse(charArray13, (int) 'a', 32, '#');
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler19 = subject18.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler20 = subject18.new TextHandler();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler22 = subject21.new TextHandler();
        char[] charArray24 = textHandler22.string2char("");
        char[] charArray27 = textHandler20.toUpperCase(charArray24, 10, (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler1.parse(charArray24, 'a');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertNull(charArray27);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject3.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject3.new SortTools();
        int[] intArray9 = new int[] { 32, (byte) 0, (short) 100 };
        int[] intArray12 = sortTools5.reverse(intArray9, 1, (int) 'a');
        int[] intArray15 = sortTools2.insertionSort(intArray9, (int) (short) 10, (int) 'a');
        int[] intArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = sortTools2.swap(intArray16, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, 100]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        int[] intArray6 = new int[] { 32, (byte) 0, (short) 100 };
        int[] intArray9 = sortTools2.reverse(intArray6, 1, (int) 'a');
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject10.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools12 = subject10.new SortTools();
        int[] intArray16 = new int[] { 32, (byte) 0, (short) 100 };
        int[] intArray19 = sortTools12.reverse(intArray16, 1, (int) 'a');
        int[] intArray22 = sortTools2.insertionSort(intArray19, (int) (byte) 0, 0);
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler24 = subject23.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools25 = subject23.new SortTools();
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler27 = subject26.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject26.new SortTools();
        int[] intArray32 = new int[] { 32, (byte) 0, (short) 100 };
        int[] intArray35 = sortTools28.reverse(intArray32, 1, (int) 'a');
        int[] intArray38 = sortTools25.insertionSort(intArray32, (int) (short) 10, (int) 'a');
        int[] intArray42 = sortTools2.doRotate(intArray38, (int) (short) -1, 0, 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 0, 100]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 0, 100]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[32, 0, 100]");
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNull(intArray42);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        int int6 = numberHandler1.compare((double) 1.0f, (double) (byte) 1);
        long long10 = numberHandler1.minimum((long) 'a', (long) 32, (long) (short) 1);
        int int13 = numberHandler1.compare((float) (byte) 1, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler4 = subject3.new TextHandler();
        char[] charArray6 = textHandler4.string2char("");
        char[] charArray9 = textHandler2.toUpperCase(charArray6, 10, (int) (short) -1);
        java.lang.String str11 = textHandler2.unescapeJava("");
        java.lang.String str13 = textHandler2.unescapeJava("hi!");
        char[] charArray15 = textHandler2.newTextBuffer((int) (short) 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(charArray15);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        int int5 = numberHandler1.minimum((int) (byte) 1, 0, (int) (byte) -1);
        boolean boolean7 = numberHandler1.isDigits("");
        boolean boolean9 = numberHandler1.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        int int6 = numberHandler1.compare((double) 1.0f, (double) (byte) 1);
        long long10 = numberHandler1.minimum((long) 'a', (long) 32, (long) (short) 1);
        boolean boolean12 = numberHandler1.isNumber("");
        long long16 = numberHandler1.minimum((long) '4', (long) (short) 100, 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        boolean boolean3 = numberHandler1.isDigits("");
        int int6 = numberHandler1.compare((double) 1.0f, (double) (byte) 1);
        int int10 = numberHandler1.maximum((int) (byte) -1, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject3.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject3.new SortTools();
        int[] intArray9 = new int[] { 32, (byte) 0, (short) 100 };
        int[] intArray12 = sortTools5.reverse(intArray9, 1, (int) 'a');
        int[] intArray16 = sortTools2.rotate(intArray9, 0, (int) ' ', (int) '#');
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, 100]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray16);
    }
}

