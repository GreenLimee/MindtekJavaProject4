package src.sundayClass;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Squirrels {
    public static void main(String[] args) {

/*The squirrels in Palo Alto spend most of the day playing.
Ask a user to input temperature:
They play if the temperature is between 60 and 90 (inclusive). But, if it is Summer,
then the upper limit is 100 instead of 90.
Print out true if the squirrels play and false otherwise.
 */

    Scanner input = new Scanner(System.in);
        System.out.println("Temperature");
        int temp = input.nextInt();
        System.out.println("Is summer: true/false");
        boolean isSummer = input.hasNextBoolean();
        boolean squirrelsArePlaying;
        if(temp>=60 && temp<=100 && isSummer){
            squirrelsArePlaying = true;
             System.out.println("true");
        } else if (temp>=60 && temp<=90 && !isSummer){
            squirrelsArePlaying = true;
            System.out.println("true");
        }else {
            System.out.println("false");
        }
}
}
