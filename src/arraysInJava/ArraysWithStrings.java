package arraysInJava;

import java.util.Arrays;

public class ArraysWithStrings {
    public static void main(String[] args) {
        String[] languages = new String[]{"Java", "Python", "CSS", "SQL", "C#"};
        System.out.println(Arrays.toString(languages));
        System.out.println("The length: "+languages.length);

        String[] words = new String[5];
        words[0] = "word1";
        words[0] = "table";
        words[words.length-1]="drink";
        System.out.println(Arrays.toString(words));


    }
}
