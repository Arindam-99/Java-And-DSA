import java.util.Scanner;

public class MultidimentionalArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int [] [] arr = new int[3][];

    // int [][] arr2D = {
    //   {1,2,3}, // 0th index
    //   {4,5},// 1st index
    //   {6,7,8,9}// 2nd index -> ar2D[2] = {6,7,8,9}
    // };
    int [][] arr = new int[3][2];
    System.out.println(arr.length);
    // Input 
    for(int row = 0; row <arr.length;row++){
      // for each col in every row 
      for(int col = 0; col < arr[row].lenght; col ++){
        arr[row][col] = sc.nextInt();
        
      }
    }
  }
}
