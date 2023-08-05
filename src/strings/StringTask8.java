package src.strings;

import java.util.Scanner;

public class StringTask8 {
    public static void main(String[] args) {
        //ask user fName, lName -> fName.lName@gmail.com
        // they might enter uppercase case letters, make sure your is all lower cases

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String fName = input.next();
        System.out.println("Enter your last name");
        String lName = input.next().toLowerCase();
        String email = "Your email is: " + fName +"."+lName +"@gmail.com";

        System.out.println();

    }
}
