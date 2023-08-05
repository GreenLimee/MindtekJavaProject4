package operators;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        // ask a user side of a square
        // calculate the area of a square and print those values

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side of a square");
        double side = input.nextDouble();
        System.out.println("The area of the square is " + side * side);
        System.out.println("The perimeter of the square is " + side * 4);


    }
}
