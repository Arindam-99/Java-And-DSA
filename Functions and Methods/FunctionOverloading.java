// Function Overloading in Java is a feature that allows a class to have multiple methods with the same name but different parameters (different number, type, or order of parameters).

// It helps increase code readability and reusability because the same method name can perform similar tasks with different inputs.
// Key Points

// Methods must have the same name but different parameter lists.

// The return type alone cannot distinguish overloaded methods.

// It is resolved at compile-time — hence called compile-time polymorphism or static polymorphism.

import java.util.Arrays;

public class FunctionOverloading {
  public static void main(String[] args) {
    fun("Arindam");
    fun(21);
    int ans = sum(10, 20);
    System.out.println(ans);
    int ans2 = sum(10, 20,30);
    System.out.println(ans2);
    demo(12,34,23,56);
    demo("Arindam","Rahul","Sujata","Roni","Subha");
    // demo() if this is empty then it showed an error....
  }
  static void fun(int a){
    System.out.println(a);
  }
   static void fun(String name){
    System.out.println(name);
  }
    static int sum(int a,int b){
   return a + b;    
  }
    static int sum(int a,int b,int c,int ...v){
    return a+ b+ c;
  }
  static void demo(int ...v){
    System.out.println(Arrays.toString(v));
  }
  static void demo(String ...v){
    System.out.println(Arrays.toString(v));
  }
}
