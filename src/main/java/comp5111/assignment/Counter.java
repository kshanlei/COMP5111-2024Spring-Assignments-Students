package comp5111.assignment;

public class Counter {
    private static int numStaticInvocations = 0;
    private static int numInstanceInvocations = 0;

    public static void addStaticInvocation(int n) {
        numStaticInvocations += n;
    }

    public static void addInstanceInvocation(int n) {
        numInstanceInvocations += n;
    }

    public static int getNumInstanceInvocations() {
        return numInstanceInvocations;
    }

    public static int getNumStaticInvocations() {
        return numStaticInvocations;
    }
}
