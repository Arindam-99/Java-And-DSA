package Control_Flow;

public class IfStatement {
  public static void main(String[] args) {
    int temp = 2;

    if (temp > 30) {
      System.out.println("It's a hot day.");
      System.out.println("Drink water.");
    } else if (temp > 20 && temp <= 30) {
      System.out.println("Beautiful day.");
    } else {
      System.out.println("Cold day.");
    }

    // Simplified block for checking high income
    int income = 120_000;
    boolean hasHighIncome = income > 100_000;

    System.out.println("Has high income: " + hasHighIncome);
  }
}
