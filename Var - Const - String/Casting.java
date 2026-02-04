package VarConstString;

public class Casting {
   public static void main(String[] args) {
    //Implicit casting 
    // byte > short > int > long > float > double 

    // short x= 1;
    // int y = x+2;

    double  x= 1.1;
    // double y = x+2;
    double y =(int)x + 2;

    System.out.println(y);

    String A = "1234";
    int B = Integer.parseInt(A) +2;
    System.out.println(B);


    String C = "1.1";
    double D = Double.parseDouble(C) +2;
    System.out.println(D);

   }
}
