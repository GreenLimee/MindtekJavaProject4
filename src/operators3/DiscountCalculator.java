package operators3;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        // ask a user total price, save it in a double variable
        // ask discount percentage, save it in double
        // calculate new total price and print this: "Your total is $80"

        Scanner input = new Scanner(System.in);
        System.out.println("What is the total price?");
        double totalPrice = input.nextDouble();
        System.out.println("What was the discount percentage?");
        double dis = input.nextDouble();
        double disdPr = totalPrice-(totalPrice/100*dis);
        System.out.println("Your total is " + "$" + disdPr);
    }
}

