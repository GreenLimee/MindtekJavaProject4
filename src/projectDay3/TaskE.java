package projectDay3;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of stairs");
        int num = input.nextInt();
        String stairs = "";
        while(num>0){
            stairs += "*";
            System.out.println(stairs);
            num--;
        }

    }
}
