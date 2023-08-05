package operators3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // ask user an int number, save it
        // if even, print "Number is even", if odd, print: "Number is odd"
        // if x is divisible by 2, then x is even, else x is odd

        Scanner input = new Scanner(System.in);
        System.out.println("Type the number");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}