package src.strings;

public class StringContains {
    public static void main(String[] args) {
        //contains(seqOfChars): accepts a string, a return a boolean. True if sontains, false if doesnt contain
        String course = "Java programing language";
        String lang = "Java";

        System.out.println(course.contains("lang"));

        //chain methods in one line
        System.out.println(course.toUpperCase().contains(lang));

        String movieName = "The Matrix";
        System.out.println(movieName.toUpperCase().contains("X"));


    }
}
