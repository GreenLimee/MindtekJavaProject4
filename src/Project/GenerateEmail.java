package Project;

import java.util.Scanner;

public class GenerateEmail {
    public static void main(String[] args) {
       // Write a program that will generateEmail. Program will ask to enter first name and last name, and then prints auto generated email. Like below:
        //Example:
        //Enter your first name: John
        //Enter your last name:
        //Doe
        //Email: john.doe@gmail.com

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name = input.next();
        System.out.println("Enter your last name: ");
        String lastName = input.next();
        System.out.println("Email: " + name.toLowerCase() + "." + lastName.toLowerCase() + "@gmail.com");
    }
}
