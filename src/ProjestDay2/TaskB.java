package ProjestDay2;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        /* Write a program that asks user to enter two integers and program should print multiplication of two numbers
        if they are equal, if they are not equals program should print the sum of two numbers.
Example 1:
Enter two numbers: 3
5
Total: 8
Example 2:
Enter two numbers:
3 3
Total: 9
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, please");
        int num1 = input.nextInt();
        System.out.println("Enter one more number, please");
        int num2 = input.nextInt();
        int multiplicatoion = num1 * num2;
        int sum = num1 + num2;
        if (num1 == num2){
            System.out.println(multiplicatoion);
        } else if (num1!=num2){
            System.out.println(sum);
        }


    }
}


