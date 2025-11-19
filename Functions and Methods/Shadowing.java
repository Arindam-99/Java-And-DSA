// In Java, shadowing (also called variable shadowing) occurs when a variable declared within a certain scope (like a method, constructor, or inner class) has the same name as a variable in an outer scope (like a class variable).

public class Shadowing {
  static int x = 90;
  public static void main(String[] args) {
    System.out.println(x); // 90
    int x = 40; // the class variable at line 4 is shadowed by this
    System.out.println(x); // 40
    fun(); // 90
  }
  static void fun(){
    System.out.println(x);
  }
}
