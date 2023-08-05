package projectDay4;

import java.util.Arrays;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        /*Write a code that asks user to enter 5 different numbers.
        And all entered numbers should be stored in array of ints and printed
        Then write a logic that prints largest number from that array.
Example:
Array: [3,2,5,4,0]
Largest number from array: 5

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Type five different numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int[] arrNum = new int[]{num1,num2,num3,num4,num5};

        int max = arrNum[0];
        System.out.println(Arrays.toString(arrNum));

        for (int i=0; i < arrNum.length; i++) {
            if (arrNum[i] > max) max = arrNum[i];
        }
        System.out.println("The max is " + max);

    }
}
