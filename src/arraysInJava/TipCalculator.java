package arraysInJava;

import javax.imageio.plugins.tiff.TIFFTagSet;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
        Enter a balance:
        100
        How would you rate our service? (Great/Good/Ok/Poor/Other)
        Great
        %25 will be applied
        Your total is: 125
        Do you split?
        No
        Your total: 125
        or
        Yes
        For how many people?
        3
        We are splitting your bil &&& people
        Each pays: 25
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the balance:");
        int balance = input.nextInt();
        String service;

        do {
        System.out.println("How would you rate our service? (Great/Good/Ok/Poor/Other)");
        service = input.next();

        if (service.equalsIgnoreCase("great"))
            balance = (int) (balance + balance * 0.25);
        else if (service.equalsIgnoreCase("good"))
            balance = balance + balance * 20 / 100;
        else if (service.equalsIgnoreCase("Ok"))
            balance += balance * 5 / 100;
        else if (service.equalsIgnoreCase("other")) {
            System.out.println("Enter tip amount");
            int amount = input.nextInt();
            balance += amount;
        } else {
            System.out.println("Invalid entry");
        }
    }while(!"great/good/ok/poor/other".contains(service.toLowerCase()));
        System.out.println("Your total is: "+balance);

        System.out.println("Do you split?");
        String split = input.next();

        if(split.equalsIgnoreCase("No")){
            System.out.println("Your total is: "+balance);
        }else if(split.equalsIgnoreCase("Yes")){
            System.out.println("For how many people");
            int people = input.nextInt();
            int eachPays = balance/people;
            String ands = "";
            while(people>0){
                ands+="&";
                people--;
            }
            System.out.println("We are splitting your bill for "+ands+" people");
            System.out.println("Each pays: "+eachPays);
        }

    }
}
