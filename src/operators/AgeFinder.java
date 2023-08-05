package operators;

import java.util.Scanner;

public class AgeFinder {
    public static void main(String[] args) {
        // ask a user their birth year.
        // you are x years old

        Scanner input = new Scanner(System.in);
        System.out.println("What is your birth year?");
        int birhtYear = input.nextInt();
        int age = 2023 - birhtYear;
        System.out.println("You are " + age + " years old");
    }
}