package loop;

import java.util.Scanner;

public class PintNameLengthTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.next();
        int amount = name.length();

        while (amount>0){
            System.out.println(name);
            amount--;
        }
    }
    }
