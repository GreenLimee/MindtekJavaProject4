package src.strings;

import java.util.Scanner;

public class StringTask4 {
    public static void main(String[] args) {
        // ask user for a word and the entered empty string

        // if given word is empty: "Sorry, you entered an empty string. No characters in this word"
        // if word is not empty then print the first char and the last char

        Scanner input = new Scanner(System.in);

        System.out.println("Print in a word");

        String word = input.next();
        int lastIndex = word.length()-1;

        if (word.length()==0) {
            System.out.println("Sorry, you entered an empty string. No characters in this word");
        }else{
        System.out.println("The first char is: " + word.charAt(0));
        System.out.println("The last char is: " + word.charAt(lastIndex));
    }








    }
}
