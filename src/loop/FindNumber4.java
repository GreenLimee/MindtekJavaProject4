package loop;

import java.util.Scanner;

public class FindNumber4 {
    public static void main(String[] args) {
        int numberInCpu = 7;

        Scanner input = new Scanner(System.in);
        System.out.println("I have a number in my cpu, try to guess it...You have only three tries...");
        int givenNumber = input.nextInt();
        int count = 1;


        while (givenNumber != numberInCpu && count < 3) {
            if (givenNumber > numberInCpu) {
                System.out.println("Incorrect, try lower...");
            } else if (givenNumber < numberInCpu) {
                System.out.println("Incorrect, try higher...");
            }
            givenNumber = input.nextInt();
            count++;
        }

        if (givenNumber != numberInCpu) {
            System.out.println("You lost! You have used 3 chances....");
        } else {
            System.out.println("Congrats, it tokk you " + count + " tries");
        }

    }
}
