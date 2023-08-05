package loop;

import java.util.Scanner;

public class CalculateSum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int value = 1;
        int sum = 0;
        String operation = "";
        while(value<=num){
            operation = operation + value + "+";
            value++;
        }




    }
}
