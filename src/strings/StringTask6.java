package src.strings;

import java.util.Scanner;

public class StringTask6 {
    public static void main(String[] args) {
        //ask a user to enter a word
        //ask a user "Which char you want to print? (type number)", save it in int
        //print that char
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        System.out.println("Which char you want to print? (type number)");
        int num = input.nextInt();
        System.out.println(word);
        System.out.println(word.charAt(num-1));


    }
}
