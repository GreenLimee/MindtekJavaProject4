package src.sundayClass;

import java.util.Scanner;

public class Applestore {
    public static void main(String[] args) {
        double iphone14 = 950;
        double iphone14Pro = 1100;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, welcome to the Apple Store. Please select the phone from the list: " +
                "\n1. Iphone 14 " +
                "\n2. Iphone 14 Pro");

        int phoneType = input.nextInt();


        System.out.println("Please select the payment option" +
                "\n1. Full payment" +
                "\n2. Finance with apple card for 12 months");

        int paymentOption = input.nextInt();

        if(phoneType==1 && paymentOption==1){
            System.out.println("Your total is$"+iphone14);
        }else if(phoneType==1 && paymentOption==2){
            System.out.println("Your monthly payment is $"+ Math.round(iphone14/12));
        }else if(phoneType==2 && paymentOption==1) {
            System.out.println("Your total is$" + iphone14Pro);
        }else if(phoneType==2 && paymentOption==2) {
            System.out.println("Your monthly payment is $" + Math.round(iphone14Pro / 12));
        }else{
            System.out.println("Error. Please, select the correct option and try again...");


        }






        }


    }

