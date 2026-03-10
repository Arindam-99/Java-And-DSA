package staticExample;

public class Innerclasses {
  static class Test{

  String name;
  public Test(String name){
    this.name = name;
  }
  }
  public static void main(String[] args) {
    Test a = new Test("Arindam");
    Test b = new Test("Rahul");
  }
}
