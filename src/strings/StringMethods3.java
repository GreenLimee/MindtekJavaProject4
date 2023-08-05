package src.strings;

public class StringMethods3 {
    public static void main(String[] args) {
        // startsWith(String value) -> boolean
        String s = "Java";
        System.out.println(s.startsWith("Ja"));

        // endsWith(String value) -> boolean
        System.out.println(s.endsWith("ava"));

        //replace (char f, char r) -> String
        System.out.println(s.replace('a','q'));

        String text = "   Hello World!   ";
        System.out.println(text.toLowerCase().replaceAll(" ",""));
    }

}
