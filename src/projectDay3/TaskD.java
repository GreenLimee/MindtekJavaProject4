package projectDay3;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        /* Palindrome
Write a program that asks a user to enter a word, and program prints "It is Palindrome" if entered word is palindrome, otherwise program prints "It is not Palindrome".
(Do a research for a Palindrome words)
Example:
Enter word:
Java
It is not Palindrome
Example 2:
Enter word: Racecar
It is Palindrome

*/
        String str = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();

        int length = word.length();

        int string = length - 1;
        while (string >= 0) {
            str = str + word.charAt(string);
            string--;
        }

        if (word.equals(str))
            System.out.println(word+" is a palindrome");
        else
            System.out.println(word+" is not a palindrome");

    }
}
