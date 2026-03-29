public class Exercise {

    // Function to compute the quotient of two integers
    public static int computeQuotient(int dividend, int divisor) {
        return dividend / divisor;
    }

    // Function to compute the remainder of two integers
    public static int computeRemainder(int dividend, int divisor) {
        return dividend % divisor;
    }

    // Function to return both quotient and remainder as an array
    public static int[] getQuotientAndRemainder(int dividend, int divisor) {
        try {
            int quotient = computeQuotient(dividend, divisor);
            int remainder = computeRemainder(dividend, divisor);
            return new int[]{quotient, remainder};
        } catch (Exception e) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}