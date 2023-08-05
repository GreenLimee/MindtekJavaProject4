package src.strings;

import java.util.Scanner;

public class StringTask9 {
    public static void main(String[] args) {
        //ask user any word
        //if word contains any vowel letter, then print "Your word contains vowels", else: "No vowels in your word"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next().toLowerCase();

        boolean containsVowels = word.contains("a") || word.contains("e")|| word.contains("y")|| word.contains("u") || word.contains("i") || word.contains("o");

        if(containsVowels == true){
         System.out.println("Your word contains vowels");
        }else{
            System.out.println("No vowels in your word");
        }




    }
}
