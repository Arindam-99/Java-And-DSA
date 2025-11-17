package Control_Flow;

public class ForEachLoop {
  public static void main(String[] args) {
    String[] fruits ={
      "Apple","Mango","orange"
    };

     String[] vagitables ={
      "Cucomber","corn","chilli"
    };


    for (int i = 0; i<fruits.length;i++){
      System.out.println(fruits[i]);
    }

    for(String vegis: vagitables)
    System.out.println(vegis);

  }
}
