package Recursion;
public class Fibonacci {

    // Recursive Approach
    // Pros: Very clean and mirrors the mathematical definition.
    // Cons: Very slow for large n (O(2^n)) because it recalculates the same values.
    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Approach
    // Pros: Much faster (O(n)) and uses less memory.
    // Cons: Slightly more "boilerplate" code.
    static void printFibonacciIterative(int count) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2); // Printing first two numbers

        for (int i = 2; i < count; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci Series up to " + n + " terms (Iterative):");
        printFibonacciIterative(n);

        System.out.println("\n\nFibonacci Series up to " + n + " terms (Recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }
}