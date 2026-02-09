package Recursion;

public class Fibonacci2 {
  public static void main(String[] args) {
    int n = 6;
    for (int i = 0; i < n; i++) {
        System.out.print(fibo(i) + " ");

    }
  }
  static int fibo (int n){
    if(n < 2){
      return n;
    }
    return fibo(n-1) + fibo(n-2);
  }
}

// Note: 
// Recursive call 
// if you are calling a function again and again, you treate it as a separate call in the stack 
// This is called tail recursion 
// this is the last function of recursion 
