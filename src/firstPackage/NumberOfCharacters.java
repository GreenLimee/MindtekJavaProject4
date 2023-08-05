package firstPackage;

import java.util.Scanner;

public class NumberOfCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any word and number of characters that program should print");
        String word = input.next();
        int num = input.nextInt();

        if (word.length()>2) {
            System.out.println(word.substring(0, num));
        } else {
            System.out.println("Word doesn't have 3 characters");
        }
    }
}
