package arraysInJava;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

    // Array: linear data structure, that holds objects or primitive variables
    // The data is stored in specified indexes, starting from 0 to the end
    // create array of integers: type[] name = new type[x]

    int[] arrNumbers = new int[4];

    arrNumbers[0]=55;
    arrNumbers[1]=-55;
    arrNumbers[2]=100;
    arrNumbers[3]=-10;

    arrNumbers[0]=5;

    System.out.println("The first element`s value "+ arrNumbers [0]);
    System.out.println("The second element`s value "+ arrNumbers [1]);
    System.out.println("The third element`s value "+ arrNumbers [2]);
    System.out.println("The fourth element`s value "+ arrNumbers [3]);

    System.out.println(Arrays.toString(arrNumbers));
    }
}
