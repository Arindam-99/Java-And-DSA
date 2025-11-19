import java.util.Arrays;

public class VarArgs {
  public static void main(String[] args) {
    // fun(2,3,4,5,6,7,8,9);
    multiple(10, 20, "Arindam");
  }

  static void fun(int ...v){
    System.out.println(Arrays.toString(v));
  }

  static void  multiple(int a,int b, String ...v){

  }
}
