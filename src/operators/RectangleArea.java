package operators;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        // ask a user one side and second side and store it in double
        // calculate area and perimeter  and print it

        Scanner input = new Scanner(System.in);
        System.out.println("What is the first side of a rectangle?");
        int side1 = input.nextInt();
        System.out.println("What is the second side of a rectangle?");
        int side2 = input.nextInt();
        int area = side1 * side2;
        int perimeter = (side1 + side2)*2;
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter );
    }
}
