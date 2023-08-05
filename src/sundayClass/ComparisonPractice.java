package src.sundayClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ComparisonPractice {
    public static void main(String[] args) {

        String recruiter = "Harsh Patel";
        int patelYears = 6;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("How many years have you been living in US?");
        int userYears = input.nextInt();

        boolean hasLivedMore = patelYears > userYears;
        System.out.println(recruiter + " has lived in US more than " + name + ":" + hasLivedMore);



    }
}
