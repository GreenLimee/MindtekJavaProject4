package src.strings;

public class Task2 {
    public static void main(String[] args) {
        // .charAt(index) -> accepts one int parameter, returns back one specific character

        String company = "Apple";
        // get the last character
        // System.out.println("The last: " + company.charAt(8));
        int lastIndex = company.length()-1;
        System.out.println("The last index: " + company.charAt(lastIndex));

        //find middle index
        int middIndex = company.length()/2;
        System.out.println("middIndex: " + middIndex);
        System.out.println("Char at middIndex is : " + company.charAt(middIndex));




    }
}
