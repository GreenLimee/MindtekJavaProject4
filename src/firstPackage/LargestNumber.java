package firstPackage;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter one more number");
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println("Largest number is "+num1);
        }else if(num1<num2){
            System.out.println("Largest number is "+num2);
        }
    }
}
