package Project;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        // 1. Create a class with name Circle and create main
        //  method with Scanner.
        // 2. Then ask user to enter radius of Circle.
        // 3. Then program will print perimeter and area of
        // Circle. Like below:
        // Enter radius of circle:
        // 8
        // Perimeter of circle is: 50
        // Area of circle is: 201
        // Task B

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of Circle");
        double radiusCircle = input.nextDouble();

        double P = 3.14;
        double perimeter = 2 * P * radiusCircle;
        System.out.println("Perimeter of circle is: " + perimeter);

        double area = P * (radiusCircle * radiusCircle);
        System.out.println("Area of circle is: " + area);
        System.out.println("Task B");


    }
}
