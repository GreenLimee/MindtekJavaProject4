package firstPackage;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        boolean validation = num%2==0 &&num>0 &&num<100;

        if (validation==true){
            System.out.println("Valid number");
        }else{
            System.out.println("Invalid number");
        }
    }
}
