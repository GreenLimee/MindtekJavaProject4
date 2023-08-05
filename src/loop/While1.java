package loop;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        //ask a user to give two numbers
        //"From?" x, "To" y
        // print all numbers from x to y, if x<y

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = input.nextInt();
        System.out.println("Please enter one more number");
        int num2 = input.nextInt();

        while(num1<=num2){
            System.out.println(num1);
            num1++;
        }


    }
}
