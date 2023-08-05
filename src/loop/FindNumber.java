package loop;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        int numberInCpu = 7;

        Scanner input = new Scanner(System.in);
        System.out.println("I have a number in my cpu, try to guess it...");
        int givenNumber = input.nextInt();

        /* boolean condition = givenNumber==numberInCpu;

        while (condition==false){
            System.out.println("Nope, try one more time");
            givenNumber=input.nextInt();
            condition=givenNumber==numberInCpu;
        } if (condition){
            System.out.println("Congrats, you got it");
        }
        */
        while(numberInCpu!=givenNumber){
            System.out.println("Nope, try one more time");
            givenNumber= input.nextInt();
        }
        System.out.println("Congrats, you got it");
    }
}
