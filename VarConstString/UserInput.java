package VarConstString;
// import java.util.Scanner;

// public class UserInput {
//   public static void main(String[] args) {
//     System.out.println("Enter your age : ");
//     Scanner sc = new Scanner(System.in);
//     byte age = sc.nextByte();
//     System.out.println("Your age " + age );
//   }
// }

import java.util.Scanner;
public class UserInput {

  public static void main(String[] args) {
    System.out.println("Enter your name:");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    System.out.println("Enter your Age");
    int age = sc.nextInt();
    System.out.println("Your name is: " + name+ "And Your age is " + age);

  
  }
}
