package arraysInJava;

import java.util.Scanner;

public class FindMinAndMaxWithLoop {
    public static void main(String[] args) {

        int min = 0,  max = 0, number = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        number = input.nextInt();
        min = number;
        max = number;

        for (int i = 1; i < 10; i++){
            System.out.println("Type a number: ");
            number = input.nextInt();
            if (number < min) min = number;
            if (number < max) max = number;
        }


    }
}
