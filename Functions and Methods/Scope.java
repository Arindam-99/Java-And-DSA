public class Scope {
  public static void main(String[] args) {
    int a = 20;
    int b = 20;
    String name = "Arindam";

    {
      // int a = 78; // already initialised outside the block in the same method, hence you cannot initialise
      a = 78; // reassign the original ref variable to some other value 
      int c = 99;
      // Values initialised in this block, will remain in block

   name = "Rahul";


    }
    // If i print the value outsider the block the output will be changed value 
    System.out.println(a);
    System.out.println(name);
    // System.out.println(c);
  }
  static void random(int marks){
    int num = 67;
    System.out.println(num);
    System.out.println(marks);
  }
}
