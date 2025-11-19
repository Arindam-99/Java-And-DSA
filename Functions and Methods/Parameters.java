import java.util.Scanner;


public class Parameters {
  public static void main(String[] args) {
    int ans = sum(10, 20);
    System.out.println(ans);

    System.out.println("Enter ypur name:");
    Scanner sc  = new Scanner(System.in);
    String name = sc.next();
    String details = mygreeting(name);
    System.out.println(details);
    sc.close();
  }

  static int sum(int a,int b){
    int sum = a + b;
    return sum;
  }

  static String mygreeting(String name){
    String message = "Hello "  + name;
    return message;
  }
}
