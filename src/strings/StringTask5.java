package src.strings;

import java.util.Scanner;

public class StringTask5 {
    public static void main(String[] args) {

        String userName = "maria123@gmail.com";
        String userPassword = "PasswordForGmail123!";

        //ask user to enter their username, save it in variable
        //ask a password, save it as well
        //if username and password matches, print; "You logged in.", else, print; "Sorry, wrong credential"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the username");
        String userName1 = input.next();
        System.out.println("Enter the password");
        String userPassword1 = input.next();

        if (userName1.equals(userName) && userPassword1.equals(userPassword)) {
            System.out.println("You logged in.");
        }else{
            System.out.println("Sorry, wrong credential");

        }



    }
}
