package projectDay3;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Greatest number is "+num1);
        }else if (num2>num1 && num2>num3) {
            System.out.println("Greatest number is "+ num2);
        }else if (num3>num1 && num3>num2){
            System.out.println("Greatest number is " +num3);
        }

    }
}
