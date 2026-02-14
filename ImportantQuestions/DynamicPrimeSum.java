import java.util.Scanner;
import java.util.Arrays;

public class DynamicPrimeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        
        // Validation: Check if the input is actually an integer
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            if (n < 2) {
                System.out.println("There are no primes less than 2. Sum: 0");
            } else {
                long result = calculateSieveSum(n);
                System.out.printf("The sum of all prime numbers from 1 to %d is: %,d%n", n, result);
            }
        } else {
            System.out.println("Error: Please enter a valid whole number.");
        }

        scanner.close();
    }

    /**
     * Efficiently calculates the sum using the Sieve of Eratosthenes.
     */
    public static long calculateSieveSum(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }
        return sum;
    }
}