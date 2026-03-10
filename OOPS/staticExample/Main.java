package staticExample;

class Human {

    int age;
    String name;
    int salary;
    boolean married;

    static long population;   // shared by all objects

    // Static block (runs only once when class loads)
    static {
        population = 0;
        System.out.println("Static block executed");
    }

    // Constructor
    Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        population++;   // increase population whenever object is created
    }

    // Static method
    static void message() {
        System.out.println("This is a static method inside Human class");
        // cannot access name here directly (non-static)
    }

    // Non-static method
    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Main {

    public static void main(String[] args) {

        Human arindam = new Human(18, "Arindam", 0, false);
        Human rahul = new Human(28, "Rahul", 100000, true);
        Human subha = new Human(45, "Subha", 2000, false);

        // Accessing static variable (correct way)
        System.out.println("Population: " + Human.population);

        // Accessing via object (not recommended but possible)
        System.out.println("Population using object: " + arindam.population);

        // Calling static method
        Human.message();

        // Calling non-static method
        arindam.introduce();
        rahul.introduce();

        // Calling static method inside same class
        fun();
    }

    // Static method
    static void fun() {

        // greeting(); //  Not allowed (non-static)

        Main obj = new Main();
        obj.greeting();   //  allowed using object
    }

    void fun2() {
        greeting();  // allowed (non-static calling non-static)
    }

    void greeting() {
        System.out.println("Hello from Main class");
    }
}