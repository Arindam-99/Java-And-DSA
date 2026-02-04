// Q1: Take a matrix as input from the user. Search for a given number X and print the indices at which it occurs

package TwoDArrays;

import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int [][] numbers = new int [rows][cols];
    // input 
    // rows
   for(int i = 0; i <rows; i++){
    // columns
    for(int j = 0;j < cols ; j++){
      numbers [i][j] = sc.nextInt();

    }
   }
   System.out.println("Enter the number which want to found - ");
   int x = sc.nextInt();
   for(int i = 0; i<rows;i++){
    for (int j = 0; j < cols; j++) {
      // Compare with X 
      if(numbers [i][j] == x){
        System.out.println("X found at locations(" +i + " , "+ j + ")");
      }
    }
   }
  }
}
