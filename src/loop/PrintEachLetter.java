package loop;

import java.util.Scanner;

public class PrintEachLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String text = input.next();
        int index = 0;
        while (index < text.length()) {
            System.out.println(text.charAt(index));
            index++;

        }
    }
}
