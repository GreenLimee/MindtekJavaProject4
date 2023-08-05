package firstPackage;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int factorial = 1;

        while (num>0){
            factorial = factorial*num;
            num--;
        }
        System.out.println("Factorial number is: " + factorial);

    }
}
