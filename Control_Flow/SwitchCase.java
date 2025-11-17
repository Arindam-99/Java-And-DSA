package Control_Flow;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the day :");
  String Day = sc.nextLine().trim().toLowerCase();

  switch (Day) {
    case "monday":
      System.out.println("It is Monday ");
      break;

      case "tuesday":
      System.out.println("It is Tuesday ");
      break;

      case "wednesday":
      System.out.println("It is Wednesday ");
      break;

      case "thursday":
      System.out.println("It is Thursday ");
      break;

      case "friday":
      System.out.println("It is Friday ");
      break;

      case "saturday":
      System.out.println("It is Friday ");
      break;

      case "sunday":
      System.out.println("It is Friday ");
      break;
  
    default:
    System.out.println("Error");
      break;
  }        sc.close(); // Always close the Scanner

}
  
}
