package firstPackage;

import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter one more number");
        int num2 = input.nextInt();
        System.out.println("Find a remainder of "+num1+" by "+num2);
        int userRemainder = input.nextInt();
        int realRemainder = num1%num2;
        boolean remainder = userRemainder==realRemainder;
        if (remainder==true){
            System.out.println("Remainder is "+userRemainder+". It is true");
        }else if(remainder==false){
            System.out.println("Remainder is "+userRemainder+". It is false. The right remainder is "+realRemainder);
        }
    }
}
