import java.util.Arrays;

public class Question1 {
  public static long sumPrimes(int n) {
    if (n < 2)
      return 0;

    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;

    for (int p = 2; p * p <= n; p++) {
      if (isPrime[p]) {
        // Update all multiples of p to false
        for (int i = p * p; i <= n; i += p)
          isPrime[i] = false;
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

  public static void main(String[] args) {
    int n = 100;
    System.out.println("Sum of primes up to " + n + ": " + sumPrimes(n));
  }
}