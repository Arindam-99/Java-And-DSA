package staticExample;

// Singleton class example
class SingletonClass {

    // 1️. Create a private static object of the same class
    // This object will be the only instance of this class
    private static SingletonClass instance;

    // 2️. Make the constructor private
    // So no one can create object using "new" keyword
    private SingletonClass() {
        System.out.println("Singleton Constructor Called");
    }

    // 3️. Create a public static method to provide access to the object
    public static SingletonClass getInstance() {

        // If object is not created, create it
        if (instance == null) {
            instance = new SingletonClass();
        }

        // Return the same object every time
        return instance;
    }
}


// Main class to test Singleton
public class Sin {
    public static void main(String[] args) {

        // Trying to create object
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        // Checking if both references are same
        System.out.println(obj1 == obj2);  // true
    }
}