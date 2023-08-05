package src.strings;

import java.util.Scanner;

public class StringTask1 {
    public static void main(String[] args) {

        // ask a user to type their name
        // print the as character from their name
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println(name.charAt(name.length()-2));





    }
}
