/**
 * Utility class for math operations.
 */
public class Main {

    private Main() {
        // Prevent instantiation
    }

    /**
     * Multiply two integers.
     *
     * @param a the first int
     * @param b the second int
     * @return result of multiplication
     */
    public static int multiply(final int a, final int b) {
        return a * b;
    }

    /**
     * Main method.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        final int num1 = 3;
        final int num2 = 4;
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
    }
}
