package src.strings;

public class StringMethods2 {
    public static void main(String[] args) {
        String word = "Java";
        int length = word.length();

        //substring

        System.out.println(word.substring(1));
        System.out.println(word.substring(2));

        String portion = word.substring(3);
        System.out.println(portion);




    }
}
