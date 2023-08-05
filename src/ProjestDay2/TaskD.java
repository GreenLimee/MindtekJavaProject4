package ProjestDay2;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a word.
        If first and last letters of word are the same, then program prints 'Same'.
        Otherwise program should print 'Different'.
(Cases should be ignored)
Example 1: Enter a word: Mom
Same
Example 2: Enter a word: Hello Different
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word, please");
        String word = input.next().toLowerCase();
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        if (firstLetter == lastLetter) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}


