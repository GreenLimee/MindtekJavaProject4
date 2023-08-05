package src.sundayClass;

import java.util.Scanner;

public class StrMethods2 {
    public static void main(String[] args) {
       /* Ask a user to input a word.
                Print out a new string made of 3 copies of the first 2 chars of the original string.
                The string may be any length. If there are fewer than 2 chars, use whatever is there.
                Example:
        "Hello"  → "HeHeHe"
        "ab"     → "ababab"
        "H"      → "HHH"
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Tape a word");
        String word = input.next();

        if (word.length()>=2){
            String result = word.substring(0,2) + word.substring(0,2) + word.substring(0,2);
        } else {
            System.out.println(word+word+word);
        }

    }
}
