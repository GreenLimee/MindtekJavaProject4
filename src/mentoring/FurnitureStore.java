package mentoring;

import java.util.Scanner;

public class FurnitureStore {
    public static void main(String[] args) {

        /*
        How many chairs do you want?
        15
        Your total: $1500
        You got 10% discount
        Your total after discount: $1350

        less than 10 chairs -> no discount
        between 10 and 19 -> 10% discount
        between 20 and 24 -> 15% discount
        between 25 and more -> 20% discount

        One chair -> $100
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many chairs do you want?");
        int chairs = input.nextInt();
        int total = chairs*100;
        if (chairs<10&&chairs>=0){
            System.out.println("Your total is: $"+total);
        } else if (chairs>=10 && chairs<=19) {
            System.out.println("Your total is: $"+total);
            System.out.println("You have 10% discount");
            System.out.println("Your total after discount: $"+total*0.9);
        } else if (chairs>=20 && chairs<=24) {
            System.out.println("Your total is: $"+total);
            System.out.println("You have 15% discount");
            System.out.println("Your total after discount: $"+total*0.85);
        } else if (chairs>=25) {
            System.out.println("Your total is: $"+total);
            System.out.println("You have 20% discount");
            System.out.println("Your total after discount: $"+total*0.80);
        }else {
            System.out.println("Invalid entry");
        }


    }
}
