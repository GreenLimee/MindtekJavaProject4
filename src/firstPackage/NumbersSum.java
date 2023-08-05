package firstPackage;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter one more number");
        int num2 = input.nextInt();
        System.out.println("Enter one more number");
        int num3 = input.nextInt();
        System.out.println("Please enter sum of those numbers");
        int sumUser = input.nextInt();
        int sumReal = num1+num2+num3;

        boolean sumChecking = sumUser==sumReal;
        if(sumChecking){
            System.out.println("Correct. Good for you");
        }else{
            System.out.println("Wrong, your sum is "+sumReal);
        }




    }
}
