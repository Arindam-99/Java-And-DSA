public class VarArgs2 {
  public static void main(String[] args) {
    System.out.println("The sum of Nothing is : " + sum());
    System.out.println("The sum of 4 and 5 is " + sum(4, 5));
    System.out.println("The sum of 4,5,6 is : " + sum(4, 5, 6));
    System.out.println("The sum of 2,3,4,5,6,7,8,9 is :  "+ sum(2,3,4,5,6,7,8,9));
  }
  static int sum(int a, int b){
    return a+b;
  }
   static int sum(int a, int b, int c){
    return a+b+c;
  }

    static int sum(int ...v){
      int result = 0;
    // Available as int [] v;
    for (int i : v) {
      result +=i;
    }return result;

  }
}
