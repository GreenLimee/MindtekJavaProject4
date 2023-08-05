package firstPackage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Discussion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi! What is your name?");
        String name = input.next();
        System.out.println("Nice tyo meet you, "+name);
        System.out.println("What do you do, "+name);
        String employment = input.next();
        System.out.println("So, you are "+employment);
        System.out.println("How many days in a week do you work?");
        int workDays = input.nextInt();
        System.out.println("And how many hours you work daily?");
        int workHours = input.nextInt();
        System.out.println("So, you work weekly "+workHours*workHours+" hours.");
        System.out.println(workDays*workHours*4+" hours per month");
        System.out.println("And "+workDays*workHours*52+" hours per year");
    }
}
