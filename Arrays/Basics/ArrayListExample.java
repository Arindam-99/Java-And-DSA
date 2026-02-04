package Basics;
import java.util.ArrayList;
import java.util.*;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(10);
    Scanner sc = new Scanner(System.in);
    // Add items
    // list.add(265);
    // list.add(266);
    // list.add(267);
    // list.add(268);
    // list.add(269);
    // list.add(270);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // list.add(269);
    // // print the items
    // System.out.println(list);
    // System.out.println("Yes i Find : " + list.contains(265));
    // list.remove(2);
    // list.set(0, 99);
    // System.out.println(list);

    
    // Input
    for (int i = 0; i < 5; i++) {
      list.add(sc.nextInt());
    }
    // Print/Output
    for (int i = 0; i < 5; i++) {
      System.out.println(list.get(i)); // pass index herem list[index] syntax will not work here
    }
    System.out.println(list);
  }
}
