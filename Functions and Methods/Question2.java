import java.util.Scanner;

public class Question2 {

  public static void main(String[] args) {
    // Program to print all three-digit Armstrong numbers (100–999)
    Scanner sc = new Scanner(System.in);

    System.out.println("Three-digit Armstrong numbers are:");

    // Loop through all 3-digit numbers
    for (int i = 100; i < 1000; i++) {
      // Check if the number is an Armstrong number
      if (isArmstrong(i)) {
        System.out.print(i + " ");
      }
    }

    sc.close();
  }

  // Method to check whether a number is an Armstrong number
  static boolean isArmstrong(int n) {
    int original = n;  // store original number
    int sum = 0;       // variable to store the sum of cubes of digits

    // loop to extract digits and compute cube sum
    while (n > 0) {
      int rem = n % 10;          // get last digit
      n = n / 10;                // remove last digit
      sum = sum + rem * rem * rem;  // add cube of the digit
    }

    // return true if cube sum equals original number
    return sum == original;
  }
}
