package loop;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;
        while (num>0) {
            sum = sum + num;
            num--;
        }
        System.out.println("Sum "+sum);

    }
}
