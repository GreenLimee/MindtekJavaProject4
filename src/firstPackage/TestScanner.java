package firstPackage;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {

        //code for scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What is Yor name: ");
        String name = input.next();
        System.out.println("What is your email: " + name);
        String email = input.next();
        System.out.println("What is your age: ");
        int age = input.nextInt();
        System.out.println("Your name is " + name);
        System.out.println("Your email is " + email);
        System.out.println("Your age is " + age);
    }
}

