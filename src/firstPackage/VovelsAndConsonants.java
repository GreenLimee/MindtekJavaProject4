package firstPackage;

import java.util.Locale;
import java.util.Scanner;

public class VovelsAndConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        String letter = input.next().toLowerCase();
        boolean vorC = letter.equals("a")||letter.equals("e")||letter.equals("y")||letter.equals("u")||letter.equals("o")||letter.equals("i");
        if(vorC){
            System.out.println("It is a Vowel");
        }else{
            System.out.println("It is a Consonant");
        }

    }
}
