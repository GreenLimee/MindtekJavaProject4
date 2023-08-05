package projectDay3;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter any word: ");
        String anyWord= input.next().toLowerCase();

        System.out.println("Type a character");
        char letter = input.next().charAt(0);

        int wordLength=anyWord.length()-1;

        int count=0;
        int index=0;

        while(index<=wordLength){
            if (anyWord.charAt(index)==letter){
                count++;
            }
            index++;

        }

        System.out.println("The number of "+letter+" is "+count);
    }
}
