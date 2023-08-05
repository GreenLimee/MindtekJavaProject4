package loop;

import java.util.Scanner;

public class FizzBuzzLoop {
    public static void main(String[] args) {
        // ask a positive number
        // /3 - Fizz, /5 - Buzz, /15 - FizzBuzz

        Scanner input = new Scanner(System.in);
        System.out.println("Type in a positive number: ");
        int num = input.nextInt();
        int startingNumber = 1;
        while(startingNumber<=num){
            if (startingNumber%15==0){
                System.out.println(startingNumber+" FizzBuzz");
                startingNumber++;
                continue;
            }
            if (startingNumber%5==0){
                System.out.println(startingNumber+" Buzz");
                startingNumber++;
                continue;
            }
            if (startingNumber%3==0){
                System.out.println(startingNumber+" Fizz");
                startingNumber++;
                continue;
            }
            System.out.println(startingNumber);
            startingNumber++;
        }

    }
}
