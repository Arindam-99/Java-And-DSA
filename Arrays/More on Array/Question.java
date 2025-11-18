// Program: Taking array input and printing using different methods
// Author: Arindam Das


import java.util.*; // Importing utility package for Scanner and Arrays

public class Question {
    public static void main(String[] args) {

        // Step 1: Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Step 2: Ask user for array size
        System.out.print("Enter the size of an array: --> ");
        int size = sc.nextInt();

        // Step 3: Declare an array of given size
        int arr[] = new int[size];

        // Step 4: Input elements using normal 'for' loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + " element: ");
            arr[i] = sc.nextInt();
        }

        // Step 5: Print array using normal for loop
        System.out.println("\nOutput using normal for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Step 6: Print array using enhanced for-each loop
        System.out.println("\n\nOutput using enhanced for-each loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Step 7: Print array using Arrays.toString() method
        System.out.println("\n\nOutput using Arrays.toString() method:");
        System.out.println(Arrays.toString(arr));

        //Step 8: Array of object ..
        String[] str = new String[4];
        System.out.print("Print the sring array: ");
        for (int i = 0; i < str.length; i++) {
          str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        // Modify.. 
        str[1] = "Arindam";
        System.out.println(Arrays.toString(str));
        // Step 9: Close Scanner...
        sc.close();
    }
}
