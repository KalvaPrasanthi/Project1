package java_fundamentals;

public class FinallyBlock {
	public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int result = divideNumbers(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle specific exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Code in the finally block will always execute
            System.out.println("This block always executes, regardless of whether an exception occurred or not.");
        }
    }

    static int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
