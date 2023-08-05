package firstPackage;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class GetIndexOfEnteredNumbers {
    public static void main(String[] args) {
        /*1. Create a class with main method
2. Create a below array in main method
int[] nums={3,6,1,9};
2. Write a code that asks user to enter a number, then code prints index number of entered number in array.
(If entered number which is not in array then it should  print -1)
         */

        int[] nums = {3, 6, 1, 9};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter one of this numbers: 3,6,1,9");
        int num = input.nextInt();
        int i=0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                System.out.println(i); break;
            } if (nums[i] != num)  System.out.println("-1");
                }
        }
    }



