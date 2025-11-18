import java.util.ArrayList;
import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10); // initial capacity does not matter ..
        Scanner sc = new Scanner(System.in);
        // list.add(234);
        // list.add(76);
        // list.add(34);
        // list.add(24);
        // list.add(20);
        // list.add(284);
        // list.add(4);
        // list.add(34);
        // list.add(24);
        // list.add(104);
        // list.add(344);
        // list.add(41);
        // list.add(42);
        // list.add(244);
        // list.add(64);
        // System.out.println(list.contains(284)); // bool value 
        // list.set(0, 99); // replace the value 
        // list.remove(2); 
        // input 
        for(int i = 0; i< 5 ; i++){
            list.add(sc.nextInt());
        }
        // get item at any item 
         for(int i = 0; i< 5 ; i++){
           System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here 
        }
        // System.out.println(list);

    }
}
