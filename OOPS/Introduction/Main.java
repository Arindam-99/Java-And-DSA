

public class Main {
  public static void main(String[] args) {
    // store 5 roll nos
    int[] numbers = new int[5];
    // store 5 names
    String[] names = new String[5];
    // data of 5 students: { roll no, name,marks}
    int[] rolno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];

    Student[] student = new Student[5];
    // Uses the parameterized constructor to create a fully initialized object.
    Student arindam = new Student(265,"Arindam",89.4f);
    // Uses the default constructor values.
    Student rahul = new Student();

    // arindam.rolno = 265;
    // arindam.name = "Arindam";
    // arindam.marks = 89.6f;
    // arindam.greeting();
    // arindam.changeName("Rio");
    System.out.println(arindam.rolno);
    System.out.println(arindam.name);
    System.out.println(arindam.marks);
    System.out.println(rahul.rolno);
    System.out.println(rahul.name);
    System.out.println(rahul.marks);

    Student random = new Student(arindam);
    System.out.println(random.name);

    // System.out.println(Arrays.toString(student));
  }

  // Create a class
  static class Student {
    int rolno;
    String name;
    float marks;
    // Instance methods can access current object fields using `this`.
    void greeting(){ 
      System.out.println("Hello! my name is " + this.name);
    }
    void changeName(String newName){
      name = newName;
    }
    Student (Student other){
      this.name = other.name;
      this.rolno = other.rolno;
      this.marks = other.marks;
    }
    // Default constructor: sets fallback values when no arguments are provided.
    Student(){
      this(0, "Unknown", 0.0f);
    }

    // Parameterized constructor: assigns input values to object fields.
    Student(int rolno, String name, float marks){
      // `this.field` refers to current object's field.
      this.rolno = rolno;
      this.name = name;
      this.marks = marks;
    }
   

  }

}
