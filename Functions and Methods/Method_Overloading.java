public class Method_Overloading {
  static void sample(){
    System.out.println("Hello Everyone ");
  }
   static void sample(int a){
    System.out.println("Hello Everyone , my age is " + a);
  }
  static void sample(int a, int b){
    System.out.println("Hello Everyone , my age is " + a + " And my mom's age is : " + b);
  }
  static void change(int a) {
    a = 98;
  }
 

  static void changeArray(int[] arr) {
    arr[0] = 98;
  }

  static void tellJoke() {
    System.out.println("Hii ! I am Arindam Das : \n" + "I am a Web developer: ");
  }

  public static void main(String[] args) {
    // tellJoke();

    // Case 1: Changing the integer :
    int x = 45;
    change(x);
    System.out.println("The value of X after running change is : " + x); // it does not change the value
    // ----------------------------------------------------------------------------------------------------

    // Case 2: Changing the array
    int[] marks = { 52, 73, 77, 89, 99 };
    changeArray(marks);
    System.out.println("The value of X after running  change is: " + marks[0]);

    // Method OverLoading.... 
    sample();
    sample(21);
    sample(21, 38);
    // Arguments are actual ! 
  }
}
 