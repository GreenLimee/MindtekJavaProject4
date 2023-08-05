package arraysInJava;

import java.util.Arrays;

public class ArraysStringTask1 {
    public static void main(String[] args) {
        //create a string array, which can hold up to 5 elements
        //print your array by using arrays.tostring method
        //one by one add; "zebra, eagle, dog, cat, mouse" to you array and then print one more time

        String[] animals = new String[5];
        System.out.println(Arrays.toString(animals));
        animals[0]="Zebra";
        animals[1]="Eagle";
        animals[2]="Dog";
        animals[3]="Cat";
        animals[4]="Mouse";
        System.out.println(Arrays.toString(animals));

        //reverse

        String[] animals2 = new String[5];
        animals2[0]=animals[4];
        animals2[1]=animals[3];
        animals2[2]=animals[2];
        animals2[3]=animals[1];
        animals2[4]=animals[0];

        System.out.println(Arrays.toString(animals2));






    }
}
