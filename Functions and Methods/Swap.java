public class Swap {
  public static void main(String[] args) {
    int a = 20;
    int b = 10;
    // swap number code : 
    // int temp = a;
    // a = b;
    // b = temp;

    // System.out.println(a);
    // System.out.println(b);
    swap(a,b);
  }

  static void swap(int a,int b){
  int temp = a;
    a = b;
    b = temp;
  }
  static void swap1(int num1 ,int num2){
    int temp = num1;
    num1 = num2;
    num2 = temp;
    // this change will only be valid in this fucntion scope only..
  }
}
