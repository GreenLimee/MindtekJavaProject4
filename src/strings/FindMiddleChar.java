package src.strings;

import java.util.Scanner;

public class FindMiddleChar {
    public static void main(String[] args) {

        //ask user a word
        //if the length of characters is odd, print one middle letter
        //if the length of characters is even, print two middle letters

        Scanner input = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = input.next();

        // check if the length is odd or even: word.length%2==0
        if (word.length()%2==0){
            System.out.println("The length is even");
            //System.out.println((word.length()-1)/2)+
        }else{
            System.out.println("The length is odd");
            //find middle letter: word.charAt(x)
            // x =(word.length()-1)/2;
            System.out.println((word.length()-1)/2);
        }






    }
}
