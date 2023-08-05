package src.sundayClass;

import java.util.Scanner;

public class StrMethods {
    public static void main(String[] args) {

        //substring()
        //startsWith()
        //endsWith()
        //trim()

        /*String str = "Hello world!  ";

        System.out.println(str.startsWith("He"));
        System.out.println(str.endsWith("!"));
        System.out.println("The length is: "+str.trim().length());

        System.out.println(str.substring(str.indexOf(" ")-1));
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the word");
        String word = input.next();
        // A t t a c k
        // if word starts with A, then move first letter to the end of the word
        // example Apple -> ppleA
        //if word ends with k, then move last letter to the beginning of the word
        // example; hello -> Hello


        if (word.startsWith("A") && word.endsWith("k")) {
            String result = word.substring(1, word.length() - 1);
            System.out.println(result);

        } else if (word.startsWith("A")) {
            String front = word.substring(0, 1);
            String back = word.substring(1);
            String result = back + front;

            System.out.println(result);
        } else if (word.endsWith("k")) {

            // Bank --> kBan
            System.out.println(word.substring(word.length() -1) + word.substring(0, word.length() - 1));

        } else {
            System.out.println(word);
        }









        }





    }

