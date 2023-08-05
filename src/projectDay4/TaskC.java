package projectDay4;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 different numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int[] arr = new int[]{num1, num2, num3, num4, num5};
        boolean isIncreasing = true;

        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("Is NOT sorted");
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Is sorted");
        }

    }
}

