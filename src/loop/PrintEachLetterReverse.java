package loop;

import java.util.Scanner;

public class PrintEachLetterReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String text = input.next();
        int index = text.length()-1;
        while (index <= text.length() && index >= 0) {
            System.out.println(text.charAt(index));
            index--;

        }
    }
}
