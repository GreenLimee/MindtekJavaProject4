package src.strings;

import javax.sound.midi.Soundbank;

public class SubstringTask {
    public static void main(String[] args) {

        String word = "Java programming language";

        // print "programing language" portion of word

        System.out.println(word.substring(5));
        System.out.println(word.substring(5,16));

        String text = "   Java     ";
        System.out.println(text.trim().length());

        String text2 = "  Hello World !     ";

        //remove empty spaces in text2, save new value in a new string, print

        String text3 = text2.trim();
        System.out.println(text3);


    }
}
