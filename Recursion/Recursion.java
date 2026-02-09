// package Recursion;

public class Recursion {
    
    // FIXED: Recursive approach
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1); 
        }
    }

    // IMPROVED: Iterative approach
    static int factorial_iterative_approach(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of factorial " + x + " is: " + factorial(x));
        System.out.println("The value of factorial " + x + " is (iterative): " + factorial_iterative_approach(x));
    }
}