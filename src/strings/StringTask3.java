package src.strings;

import java.util.Scanner;

public class StringTask3 {
    public static void main(String[] args) {
        // ask user non empty word
        // print: The first char is: x
        // print: The last char is: a

        Scanner input = new Scanner(System.in);
        System.out.println("Print in a non empty word");
        String word = input.next();
        int lastIndex = word.length()-1;

        System.out.println("The first char is: " + word.charAt(0));
        System.out.println("The last char is: " + word.charAt(lastIndex));

    }
}
