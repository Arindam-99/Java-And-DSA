package Arrays;
import java.util.Arrays;

public class MultidimentionalArray {
  public static void main(String[] args) {
    // int [] [] numbers = new int [2] [3] [5];
    // numbers[0] [0] = 1;
    int[] [] numbers = { {1,2,3,},{4,5,6}};
    
   System.out.println(Arrays.deepToString(numbers));
  }
}
