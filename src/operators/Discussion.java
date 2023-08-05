package operators;

import java.util.Scanner;

public class Discussion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Hi! What is your name?");
        String name = scanner.next();
        System.out.println("Nice to  meet you, " + name);
        System.out.println("What do you do, " + name);

        String work = scanner.next();
        System.out.println("So you are a " + work);
        System.out.println("How many days in a week do you work?");

        int days = scanner.nextInt();

        System.out.println("How many hours do you work daily?");

        int hours = scanner.nextInt();

        int weeklyHrs = days*hours;

        int monthlyHrs = weeklyHrs * 4;

        int yearlyHrs = weeklyHrs * 52;

        System.out.println("So you  work " + weeklyHrs + " hours a week");
        System.out.println("You work " + monthlyHrs + " hours a month.");
        System.out.println("You work " + yearlyHrs + " hours per year");








    }







}
