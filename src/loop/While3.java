package loop;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        // ask user for teo numbers
        //print all even numbers between them

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = input.nextInt();
        System.out.println("Please enter one more number");
        int num2 = input.nextInt();

        if (num1 % 2 == 1){

         while (num1 <= num2) {
             System.out.println(num1);
             num1 = num1 + 2;
         }

        }

    }
}
