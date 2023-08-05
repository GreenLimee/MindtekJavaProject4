package ProjestDay2;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        /*Write a program that asks a user to enter a number.
        If number can evenly be divided by 3, then program prints "Fizz".
        If number can evenly be divided by 5, then program prints "Buzz".
        If number can evenly be divided by 3 and 5 at the same time, then program prints "FizzBuzz".
Example:
Enter number: 10
Buzz
Example 2: Enter number: 6
Fizz
Example 3: Enter number: 30
FizzBuzz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, please");
        int num = input.nextInt();
        if (num%3==0&&num%5==0) {
            System.out.println("FizzBuzz");
        } else if (num%3==0){
            System.out.println("Fizz");
        } else if (num%5==0){
            System.out.println("Buzz");
        }






    }
}
