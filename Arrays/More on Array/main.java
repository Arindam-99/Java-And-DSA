public class main {
  public static void main(String[] args) {
    // Question : Store roll number :
    int a = 19;
    // Question : store a persons's name
    String name = "Arindam Das";
    // Question : store 5 Student roll number:
    int roll1 = 10;
    int roll2 = 11;
    int roll3 = 12;
    int roll4 = 13;
    int roll5 = 14; // This will not make sense 

    // Syntax
    // datatype[] variable_name = new datatype[size];
    // store 5 roll numbers :
    int[] rollnum = new int[5];
    // directly write 
    int[] rollnum2 = {23,34,55,67,68};

    /*
     int [] rollnum; // Declaratiopn of array: rollnum is getting defined in the (stack)
     rolln7um = new int[5]; // Initializationb: actually here subject is being created in the memory(heap)f
     */

     int [] ros;
     ros = new int[5];
     System.out.println(ros[1]); // 0


     String [] arr = new String[4];
     System.out.println(arr[0]); // null

     /*null is a special literal value that represents the absence of an object reference. It is not an object itself, but rather a value that can be assigned to any reference type variable to indicate that it is not currently pointing to any object in memory. */

     
  }
}
