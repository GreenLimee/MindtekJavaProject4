package ProjestDay2;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        /*
Write a program that asks user to enter number of month.
Based on season of entered month program should print special ice-cream of the season.
Special ice-creams of season:
Spring -> Chocolate Winter -> Strawberry Fall -> Pumpkin Summer -> Vanilla
Example 1:
Enter month:
1 4 15
Season is Winter Season is Spring Invalid month Ice-cream: Strawberry Ice-cream: Chocolate
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number, please");
        int month = input.nextInt();
        if (month>=1&&month<=2) {
            System.out.println("Strawberry");
        }else if (month>=3&&month<=5) {
            System.out.println("Chocolate");
        }else if (month>=6&&month<=8) {
            System.out.println("Vanilla");
        }else if (month>=9&&month<=11) {
            System.out.println("Pumpkin");
        }else if (month==12) {
            System.out.println("Strawberry");
        }else if(month<1||month>12){
            System.out.println("Wrong number of month");
        }


    }
}
