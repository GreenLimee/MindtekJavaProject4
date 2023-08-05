package src.strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringTask10 {
    public static void main(String[] args) {
        //swimming club accepting new members, age 5-10 y.o., only girls
        //Print "Welcome to the club" or "Sorry, you didn`t qualify"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an age of a new member");
        int age = input.nextInt();
        System.out.println("Enter a gender of a new member");
        String gender = input.next();
         /*if ((5<=age&&age<=10) && (gender.equals("women"))) {
            System.out.println("Welcome to the club");
        }else{
            System.out.println("Sorry, you didn`t qualify");
        }

        boolean ageIsAccepted = age >= 5 && age <= 10;
        boolean genderIsAccepted = gender.toLowerCase().equals("female");
        if(ageIsAccepted=true && genderIsAccepted=true) {
            System.out.println("Welcome to the club");
        }else{
            System.out.println("Sorry, you didn`t qualify");

          */
        }

    }

