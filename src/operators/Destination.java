package operators;

import java.util.Scanner;

public class Destination {
    public static void main(String[] args) {
        // What is your speed?
        // What is the total distance?
        // Calculate arrival time
        // input.nextDouble()

        Scanner input = new Scanner(System.in);
        System.out.println("What is your speed? ");
        double speed = input.nextDouble();

        System.out.println("What is the total distance? ");
        double distance = input.nextDouble();

        System.out.println("You will get there in " + distance/speed + " hours");
        // minutes and seconds
        System.out.println("Minutes: " + distance/speed*60);
        System.out.println("Seconds: "+ distance/speed*60*60);


    }
}
