package src.sundayClass;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = input.nextInt();
        System.out.println("Select the operation" +
                "\n 1. Plus" +
                "\n 2. Minus" +
                "\n 3. Multiply" +
                "\n 4. Divide");
        int operation = input.nextInt();
        System.out.println("Please enter number 2");
        int num2 = input.nextInt();

        if (operation == 1) {
            System.out.println(num1 + num2);
        } else if (operation == 2) {
            System.out.println(num1 - num2);
        } else if (operation == 3) {
            System.out.println(num1 * num1);
        } else if (operation == 4) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Wrong number");

        }

    }
}


