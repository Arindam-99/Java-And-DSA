import java.util.Scanner;

public class Demo2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    int size = sc.nextInt();

    int[] numbers = new int[size];

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter the value: " + i);
      numbers[i] = sc.nextInt();

    }
    System.out.println("Enter the value you want to search for: ");
    int x = sc.nextInt();
    System.out.println("The output will be : ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i] + " ");
    }
    System.out.println();
  }
}
