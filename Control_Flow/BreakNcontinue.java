package Control_Flow;

import java.util.Scanner;

public class BreakNcontinue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String input;

        // While loop
        input = "";
        while (true) {
            System.out.print("Input: ");
            input = sc.next().toLowerCase();

            if(input.equals("pass"))
            continue;

            if(input.equals("quit"))
            break;
            System.out.println("You typed: " + input);
        }

        System.out.println("Exited while loop.");
  sc.close();

  }
}
