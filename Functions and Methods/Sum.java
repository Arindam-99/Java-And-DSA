import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    /*\
     Asscess modifier,
      return_type name(){
      return type;
      }
     */
    sum();
    greeding();
    int ans = sum2();
    System.out.println(ans);

  }

  // Making a function.... 
  static void sum(){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number 1 : ");
  int a = sc.nextInt();
   System.out.print("Enter number 2 : ");
  int b = sc.nextInt();
  System.out.print("The sum of the twop number is: " + (a+b));
  sc.close();
  }

  static void greeding(){
    System.out.println("\nHello Jiii ");
  }

  static int sum2() {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number 3 : ");
  int a = sc.nextInt();
  System.out.print("Enter number 4 : ");
  int b = sc.nextInt();
  int sum = a+b;
  sc.close();
  return sum;

  }
}
