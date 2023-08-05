package src.strings;

public class StringEquals {
    public static void main(String[] args) {
        // Equals(text): accepts one string parameter, returns true if equals and false if not equals
        String comp1 = "yujhbj";
        String comp2 = "Canon";

        //check if comp1 has the same value with comp2
        System.out.println(comp1.equals(comp2));

        System.out.println(comp1.equalsIgnoreCase(comp2));

    }
}
