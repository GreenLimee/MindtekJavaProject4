package operators3;

import java.util.Scanner;

public class PasswordFinder {
    public static void main(String[] args) {

        int password = 2589;
         //ask user to input 4 digit password
        // if entered password matches password, print: "Access granted, the door is opening"
        // if doesnt match then print "Wrong password"

        Scanner input = new Scanner(System.in);
        System.out.println("Input 4 digits password");
        int givenPassword = input.nextInt();

        if (givenPassword == 2589) {
            System.out.println("Access granted, the door is opening");
        } else {
            System.out.println("Wrong password");


        }




    }
}
