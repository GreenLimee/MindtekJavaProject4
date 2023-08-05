package Project;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        // Write a program for below output:
        //Do you know Java? (1 for Yes/ 2 for No)
        //1
        //How many percent is your attendance? (0-100) 80
        //Did you finish all assignments? (1 for Yes/ 2 for No) 1
        //It is time to learn Selenium
        //** If one of the answers is No(2) or attendance is below 80 then print 'Practice Java' otherwise print 'It is time to learn Selenium'.

        Scanner input = new Scanner(System.in);
        System.out.println("Do you know Java? (1 for Yes/ 2 for No)");
        int answer = input.nextInt();
        if( answer==1) {
            System.out.println("It is time to learn Selenium");
        }
        else if (answer==2) {
            System.out.println("Practice Java");
        }

        System.out.println("How many percent is your attendance? (0-100)");
        int attendance = input.nextInt();
        if (attendance<80) {
            System.out.println("Practice Java");
        } else if (attendance>=80){
            System.out.println("It is time to learn Selenium");
        }

        System.out.println("Did you finish all assignments? (1 for Yes/ 2 for No) 1");
        int assignmentsAnswer = input.nextInt();

        if( assignmentsAnswer==1) {
            System.out.println("It is time to learn Selenium");
        }
        else if (assignmentsAnswer==2) {
            System.out.println("Practice Java");
        }


    }

}