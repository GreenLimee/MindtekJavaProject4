package loop;

import java.util.Scanner;

public class ForLoopTask1 {
    public static void main(String[] args) {
        // print sum of all numbers from 1 to given number

        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        int num = input.nextInt();
        int result = 0;
        for(int i = 1; i <= num; i++){
            result = result + i;
        }
        System.out.println(result);
    }
}
