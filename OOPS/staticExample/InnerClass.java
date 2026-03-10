package staticExample;

public class InnerClass {
  class Test{

    String name;
    public Test(String name){
      this.name = name;
    }
  }
  public static void main(String[] args) {
    Test a = new Test("Ari");
    Test b = new Test("Roni");
  }
}
