package operators2;

import java.util.Scanner;

public class IfEsle3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Print in the number");
        int userNumber = input.nextInt();

        if(userNumber>0){
            System.out.println("The given number is positive. ");
        }else if(userNumber>0){
            System.out.println("The given number is negative");
        }else{
            System.out.println("The given number is zero.");
        }

        System.out.println("The end.");



    }
}
