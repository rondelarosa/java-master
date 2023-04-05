package org.example.practices;

/**
 * Base case - A function does not call itself at all
 * Recursive case - A function call itself
 */
public class Recursion {
    public static void process() {
        var facOutput = getFactorialOf(4);
        System.out.println("Factorial > " + facOutput);

        var fibOutput = getFibonacci(8);
        System.out.println("Fibonacci > " + fibOutput);
    }

    /**
     * Cannot be less than 1 based on what defined in factorial
     * f(0) = 1
     * f(1) = 1 * f( 1-1) = 1 > 1 * 1
     */
    public static int getFactorialOf(int num) {
        // assuming that n is a positive integer or 0
        if (num >= 1) return  num * getFactorialOf(num - 1); // called a recursive case
        else
            return 1; // called a base case
    }

    /**
     * Fibonacci number, it's sum of two preceded number
     * e.g: 1,1,2,3,5,8,13,21
     */
    public static int getFibonacci(int fibIndex) {
        if (fibIndex >= 3)
            return getFibonacci(fibIndex - 1) + getFibonacci(fibIndex - 2); // called a recursive case
        else
            return 1; // called a base case
    }
}
