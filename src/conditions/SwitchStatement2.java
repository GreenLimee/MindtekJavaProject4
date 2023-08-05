package conditions;

import java.util.Scanner;

public class SwitchStatement2 {
    public static void main(String[] args) {
        //ask user a day and store i
        // then using swith a statement compare days and print the matching number
        // Monday -> 1,Tuesday -> 2,.....
        Scanner input = new Scanner(System.in);
        System.out.println("What is the day of the week?");
        String day = input.next().toLowerCase();
        // 1 -> Monday, 2 -> Tuesday.......
        switch (day){
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Not found");

        }



    }
}
