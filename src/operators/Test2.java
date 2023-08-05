package operators;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // ask a user 2 numbers.
        // print Sum:
        // print Multiplication:
        // print Subtraction:
        // print Division:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int num1 = input.nextInt();
        System.out.println("Enter a number 2");
        int num2 = input.nextInt();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Remainder: " + num1 % num2);



    }
}
