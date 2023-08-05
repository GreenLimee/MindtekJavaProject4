package src.strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringTask7 {
    public static void main(String[] args) {
        /* String word = "table";
        System.out.println(word.indexOf('a'));
        */
        //ask a user to enter a word
        //ask a user which characters location they want reprinted

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        System.out.println("Which characters location you want to know?");
        String charLoc1 = input.next();
        System.out.println("The location of " + charLoc1 + " is # " + (word.indexOf(charLoc1)+1));;


    }
}