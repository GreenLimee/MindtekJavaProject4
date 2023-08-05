package src.sundayClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {

        /*
        Sales Tax  = 10%
   Iphone Trade in value = $500;
   Iphone 14 Pro Max = $1250;
   Finance time = 2 years;
   Wireless service = $60 per month;


Ask user what kind of iphone they want to buy?
Input Iphone 14 Pro max
Print out the price for the Iphone 14 Pro Max   ---> $1250


Ask user what kind iphone they have for trade in;
Input Iphone 11 pro max;
Print out the trade in value for the Iphone 11 pro max  ---> $500;


Print out the Total price for the iphone after trade in;
Print out the Total price for the iphone after trade in  + 10% sales tax;
Print out monthly payment for 2 years for the phone without sales tax;


Print out how much will buyer pay first month for the phone + sales tax.
Print out monthly payment + wireless service $60 per month;


Print out how much will buyer pay first month for the phone + sales tax + wireless service.
Print out in how much buyer will pay in total for 2 years for the phone + service;


 */

        Scanner input = new Scanner(System.in);
        System.out.println("What kind of the phone would you like to buy?");
        String newPhone = input.next();
        System.out.println("The price for your " + newPhone + " is $1250");
        Double newPhonePrice = 1250.0;
        System.out.println("What kind of the phone would you like to trade in?");
        String trdInPhone = input.next();
        System.out.println("For your " + trdInPhone + " you will get $500");
        Double trdInPhonePrice = 500.0;

        Double afterTrdInPrice = newPhonePrice - trdInPhonePrice;
        System.out.println("For the " + newPhone + " you will pay " + afterTrdInPrice);









    }
}
