package loop;

import java.util.Scanner;

public class FindNumber2 {
    public static void main(String[] args) {
        int numberInCpu = 7;

        Scanner input = new Scanner(System.in);
        System.out.println("I have a number in my cpu, try to guess it...");
        int givenNumber = input.nextInt();
        int count = 1;

        while (givenNumber != numberInCpu) {
            System.out.println("********");
        System.out.println("Nope, try one more time...");
        givenNumber = input.nextInt();
        count++;
    }
        System.out.println("Congrats, you got it. It took " + count + " tries");
    }
}



