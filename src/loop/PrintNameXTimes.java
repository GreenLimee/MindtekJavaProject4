package loop;

import java.util.Scanner;

public class PrintNameXTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.next();
        System.out.println("How many times?");
        int amount = input.nextInt();
        int count = 0;

        while (amount>0){
            System.out.println(name);
            amount--;
        }
    }
}
