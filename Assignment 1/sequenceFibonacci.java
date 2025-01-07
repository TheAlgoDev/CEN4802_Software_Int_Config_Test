/*
Brent Thompson
CEN4802 Software Integration, Configuration, and Testing
January 7, 2025

This class contains two methods, one to calculate the value at an index of the Fibonacci Secuence,
and one to display the results of the first method
*/

public class sequenceFibonacci {
    /**
     * Calculates the Fibonacci number at the given index using recursion.
     *
     * @param n the index of the Fibonacci sequence for which the value is to be calculated.
     *          It must be a non-negative integer.
     * @return the Fibonacci number at the specified index.
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        int sequenceIndex = 10;
        int calculatedFib = fibonacci(sequenceIndex);
        String fibPrint = "The term at index " +sequenceIndex+ " of the Fibonacci Sequence is " + calculatedFib;
        System.out.println(fibPrint);
    }
}
