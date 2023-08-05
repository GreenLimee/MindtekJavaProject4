package firstPackage;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please,enter your grade in a scale 100");
        int grade = input.nextInt();
        if (grade >= 80 && grade <= 100) {
            System.out.println("Your grade is A");
        } else if (grade >= 60 && grade <= 79) {
            System.out.println("Your grade is b");
        } else if (grade >= 40 && grade <= 59) {
            System.out.println("Your grade is C");
        } else if (grade >= 0 && grade <= 39) {
            System.out.println("Your grade is F");
        }
    }
}
