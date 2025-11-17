package Control_Flow;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        // While loop
        input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
            System.out.println("You typed: " + input);
        }

        System.out.println("Exited while loop.");

        // Do-while loop
        do {
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
            System.out.println("You typed: " + input);
        } while (!input.equals("quit"));

        System.out.println("Exited do-while loop.");

        sc.close(); // Always close the Scanner
    }
}
