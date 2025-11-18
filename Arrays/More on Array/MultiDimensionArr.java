import java.util.Scanner;

public class MultiDimensionArr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /*
     Example of a 3x3 matrix:
     1 2 3 
     4 5 6
     7 8 9
    */

    // Different ways to declare 2D arrays in Java:

    //  Declare a 2D array with only row size
    // int[][] arr = new int[3][];

    // Static initialization of 2D array
    // int[][] arr = {
    //   {1, 2, 3},
    //   {4, 5, 6},
    //   {7, 8, 9}
    // };

    //  Jagged array example (rows with different lengths)
    // int[][] arr2D = {
    //   {1, 2, 3},    // 0th index
    //   {4, 5},       // 1st index
    //   {6, 7, 8, 9}  // 2nd index → arr2D[2] = {6,7,8,9}
    // };

    // Example of printing one specific row from each array
    // System.out.println(Arrays.toString(arr[1]));
    // System.out.println(Arrays.toString(arr2D[1]));

    //  Creating a 3x3 2D array dynamically
    int[][] arr = new int[3][3];

    // Print total number of rows
    System.out.println(arr.length); // Number of rows

    //  Input: Taking elements for each row and column
    for (int row = 0; row < arr.length; row++) {
      // For each column in every row
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = sc.nextInt();
      }
    }

    // Closing the Scanner
    sc.close();
  }
}
