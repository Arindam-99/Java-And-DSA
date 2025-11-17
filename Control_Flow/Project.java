package Control_Flow;

import java.util.Scanner;

public class Project {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Number:");
    int number = sc.nextInt();

     if (number % 5 == 0 && number % 3 == 0 ){
      System.out.println("Fizz Buzz");

    }else if(number % 3 == 0){
      System.out.println("Buzz");
    }else if(number % 5 == 0){
      System.out.println("Fizz");
    }else {
      System.out.print(number);
    }
    sc.close();
  }
}
