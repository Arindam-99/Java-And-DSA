import java.util.Scanner;

public class break_continue2 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to start the loop : ");
    int start = sc.nextInt();
    System.out.print("Enter the number to End the loop: ");
    int end = sc.nextInt();
    System.out.print("Enter the number to break/ continue: ");
    int rukjao = sc.nextInt();

    for (int i = start; i <= end; i++) {
      if( i == rukjao ){
        continue;
        
      }
      System.out.println(i);


    }
    sc.close();
  }
}
