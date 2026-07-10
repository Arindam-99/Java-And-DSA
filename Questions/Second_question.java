import java.util.Scanner;

public class Second_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item;
        int quantity;
        String member;

        double price = 0;
        double totalBill;
        double discount = 0;
        double serviceCharge = 0;
        double finalAmount;

        // Input
        System.out.print("Enter item (Burger/Pizza/Pasta/Coffee): ");
        item = sc.nextLine();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Are you a member? (yes/no): ");
        member = sc.nextLine();

        // Determine item price using if-else
        if (item.equalsIgnoreCase("Burger")) {
            price = 120;
        } else if (item.equalsIgnoreCase("Pizza")) {
            price = 250;
        } else if (item.equalsIgnoreCase("Pasta")) {
            price = 180;
        } else if (item.equalsIgnoreCase("Coffee")) {
            price = 80;
        } else {
            System.out.println("Invalid item selected!");
            return;
        }

        // Calculate total bill
        totalBill = price * quantity;

        // Apply discount for members
        if (member.equalsIgnoreCase("yes")) {
            if (totalBill > 500) {
                discount = totalBill * 0.10; // 10% discount
            } else {
                discount = totalBill * 0.05; // 5% discount
            }
        }

        double amountAfterDiscount = totalBill - discount;

        // Apply service charge
        if (amountAfterDiscount > 1000) {
            serviceCharge = amountAfterDiscount * 0.05;
        }

        finalAmount = amountAfterDiscount + serviceCharge;

        // Output
        System.out.println("\n----- Bill Summary -----");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Original Bill: ₹" + totalBill);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Service Charge: ₹" + serviceCharge);
        System.out.println("Final Amount: ₹" + finalAmount);

        // Bonus condition
        if (quantity >= 5) {
            System.out.println("Congratulations! You received a free coffee coupon.");
        }

        sc.close();
    }
}