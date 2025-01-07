/*
Brent Thompson
CEN4802 Software Integration, Configuration, and Testing
January 7, 2025

This class contains two methods, one to calculate the value at an index of the Fibonacci Secuence,
and one to display the results of the first method
*/

public class sequenceFibonacci {
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
