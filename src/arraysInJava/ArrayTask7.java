package arraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask7 {
    public static void main(String[] args) {
        //ask a user how many numbers they want to store: 5

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to store?");
        int len = input.nextInt();
        int [] arr = new int[len];
        System.out.println(Arrays.toString(arr));

        int num = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Type a number " + (i+1));
            num = input.nextInt();
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
    }
}
