package VarConstString;
public class MyString {
  public static void main(String[] args) {
    String message ="   Hello" + "!!   ";
    String Name = "Hello \"Arindam\""; // escape sequence 
    String Example = "c:\\Windows\\..."; // escape sequence
    String Example2 = "c:\tWindows\\..."; // escape sequence 
    String Example3 = "c:\nWindows\\..."; // escape sequence
    System.out.println(Name);
    System.out.println(Example);
    System.out.println(Example2);
    System.out.println(Example3);

   
    System.out.println(message.endsWith("!!"));
    System.out.println(message.startsWith("Ari"));
    System.out.println(message.length());
    System.out.println(message.indexOf("l"));
    System.out.println(message.replace("!","+"));
    System.out.println(message.toLowerCase());
    System.out.println(message.toUpperCase());
    System.out.println(message.trim());

  }
}
