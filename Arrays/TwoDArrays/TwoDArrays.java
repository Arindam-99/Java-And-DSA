package TwoDArrays;
import java.util.Scanner;

public class TwoDArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();

    int[][] numbers = new int[rows][cols];

    // Input section
    System.out.println("\n--- Enter the elements ---");
    for(int i = 0; i < rows; i++) {
      for(int j = 0; j < cols; j++) {
        System.out.print("Element at [" + i + "][" + j + "]: ");
        numbers[i][j] = sc.nextInt();
      }
    }

    // Output section
    System.out.println("\n--- Your 2D Array Matrix ---");
    for(int i = 0; i < rows; i++) {
      // Start row with a bracket for style
      System.out.print("| "); 
      for(int j = 0; j < cols; j++) {
        // \t adds a tab space to keep columns perfectly aligned
        System.out.print(numbers[i][j] + "\t");
      }
      System.out.println("|"); // End row with a bracket
    }
    System.out.println("---------------------------");
  }
}