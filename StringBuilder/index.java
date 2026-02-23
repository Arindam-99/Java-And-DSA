public class index {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Ari");
    System.out.println(sb);

    // chat at index 0
    System.out.println(sb.charAt(0));
    // set char at index 0
    sb.setCharAt(0, 'H');
    System.out.println(sb);
    // insert at first
    sb.insert(0, "p");
    System.out.println(sb);
    // Delete
    sb.delete(2, 3);
    System.out.println(sb);
    // append
    StringBuilder sv = new StringBuilder("A");
    sv.append("r");
    sv.append("i");
    sv.append("n");
    System.out.println(sb.length());


  }
}