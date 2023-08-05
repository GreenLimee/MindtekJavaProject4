package operators2;

import java.util.Scanner;

public class IfElse2 {

    public static void main(String[] args) {
        // ask a user any number
        // save that number in int variable
        // print "The given number is positive" if number is positive
        // print "The given number is negative" if number is negative

        Scanner input = new Scanner(System.in);
        System.out.println("Print in the number");
        int userNumber = input.nextInt();

        if(userNumber > 0){
            System.out.println("The given number is positive");
        }

        if(userNumber < 0){
            System.out.println("The given number is negative");
        }

        if(userNumber == 0){
            System.out.println("The given number is zero");
        }

        System.out.println("The end");




    }
}
