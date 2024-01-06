package Exceptions;

public class DivideRunner {
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println("Result: " + result);
    }

    @Deprecated
    private static int divide(int dividend, int divisor) {
        try {
            int result = dividend / divisor;
            System.out.println("Result Calculated");
            return result;
        }
        catch (ArithmeticException e) {
            System.out.println("Divided by zero");
            return 0; // suppressing an exception, shouldn't be done
        }
        finally {
            System.out.println("Good Bye from Finally");
        }
    }
}
