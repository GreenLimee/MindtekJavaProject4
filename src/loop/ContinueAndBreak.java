package loop;

import java.util.Scanner;

public class ContinueAndBreak {
    public static void main(String[] args) {
        // break: escape from the loop
        //continue: jump to the next iteration
        // print even numbers from num1 to num2
        Scanner input = new Scanner(System.in);
        System.out.println("From ");
        int num1 = input.nextInt();;
        System.out.println("To ");
        int num2 = input.nextInt();

        while (num1<=num2){
            System.out.println("Beginning of a while loop....");
            if (num1%2==1){
                num1++;
                System.out.println("Hi from a first condition!");
                continue;  //jump to the nex iteration
            }
            if (num1 % 2 == 0) {
                System.out.println("Hi from second condition!");
                System.out.println(num1);
            }
            num1++;
            System.out.println("The end of the while loop.....");
        }

    }
}
