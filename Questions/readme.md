Question 1: Pattern printing using for loop (File Name:first_question.java)
Question 2: # Restaurant Order Billing System

Write a Java program for a restaurant billing system.

The restaurant menu is as follows:

* Burger → ₹120
* Pizza → ₹250
* Pasta → ₹180
* Coffee → ₹80

Your program should perform the following tasks:

1. Take the following inputs from the user:

   * Food item name
   * Quantity of the item
   * Whether the customer is a member of the restaurant loyalty program (`yes` or `no`)

2. Calculate the total bill amount based on the selected item and quantity.

3. Apply discounts according to the following conditions:

   * If the customer is a member and the bill amount is greater than ₹500, provide a 10% discount.
   * If the customer is a member and the bill amount is ₹500 or less, provide a 5% discount.
   * If the customer is not a member, no discount should be applied.

4. After applying the discount:

   * If the final amount exceeds ₹1000, add a 5% service charge.
   * Otherwise, no service charge is added.

5. Display the following details:

   * Ordered item
   * Quantity
   * Original bill amount
   * Discount amount
   * Service charge
   * Final payable amount

### Bonus Challenge

If the customer orders 5 or more items, display the following message:

`Congratulations! You received a free coffee coupon.`
