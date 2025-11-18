import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    System.out.println("Enter 5 numbers: ");
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
   
    // input using for loop
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("The outputr will be : ");
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] + " ");
    }
  }
}
