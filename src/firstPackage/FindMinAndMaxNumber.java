package firstPackage;

import java.util.Scanner;

public class FindMinAndMaxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        if (num1>num2 && num1>num3 && num1>num4 && num1>num5){
            System.out.println("The max number is "+num1);
        }else if(num2>num3 && num2>num4 && num2>num5){
            System.out.println("The max number is "+num2);
        }else if (num3>num4 && num3>num5){
            System.out.println("The max number is "+num3);
        }else if (num4>num5){
            System.out.println("The max number is "+num4);
        }else{
            System.out.println("The max number is "+num5);
        }

        if (num1<num2 && num1<num3 && num1<num4 && num1<num5){
            System.out.println("The min number is "+num1);
        }else if(num2<num3 && num2<num4 && num2<num5){
            System.out.println("The min number is "+num2);
        }else if (num3<num4 && num3<num5){
            System.out.println("The min number is "+num3);
        }else if (num4<num5){
            System.out.println("The min number is "+num4);
        }else{
            System.out.println("The min number is "+num5);
        }





    }
}
