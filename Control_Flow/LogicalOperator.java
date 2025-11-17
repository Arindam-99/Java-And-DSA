package Control_Flow;

public class LogicalOperator {
  public static void main(String[] args) {
    //And Operator 
    int temp = 22;
    boolean isWarm = temp > 20 && temp < 30;
    System.out.println(isWarm);
    // or Operator and Noe operator (include and operator)
    boolean hasHighIncome = true;
    boolean hasGoodCredit = true;
    boolean hasCriminalRecord = false;
    boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    System.out.println(isEligible);
  }
}
