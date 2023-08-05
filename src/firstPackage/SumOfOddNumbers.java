package firstPackage;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;
        if (num % 2 == 0) {
            while (num > 0) {
                sum = sum + (num-1);
                num = num - 2;
            }
            System.out.println("Sum " + sum);

        } else {
            while (num > 0) {
                sum = sum + num;
                num = num - 2;
            }
            System.out.println("Sum " + sum);
        }

        }
    }



