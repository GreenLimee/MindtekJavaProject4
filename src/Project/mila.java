package Project;

import java.util.Scanner;

public class mila {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you know Java?");
        int knowJava = input.nextInt();
        if(knowJava==2){
            System.out.println("Practice Java");
        }else if(knowJava==1){
            System.out.println("How many percent is your attendance?");
            int percent = input.nextInt();
            if(percent<80){
                System.out.println("Practice Java");
            } else if(percent>100 && percent<0){
                System.out.println("incorrect number");
            }
            else if (percent>=80) {
                System.out.println("Did you finish all assignments?");
                int assignment = input.nextInt();
                if(assignment==2){
                    System.out.println("Practice Java");
                }else if(assignment==1){
                    System.out.println("It is time to learn Selenium");
                }

            }
        }
    }
}
