package projectDay4;

import java.util.Arrays;

public class OptionalTask {
    public static void main(String[] args) {

        /*Write a code that combines two below arrays into one array and prints combined array.
        (Think that number of elements in array can be changed)
int[] array1={5,3,2}; int[] array2={9,1,3,0,5};
Output for an array should be: [5,3,2,9,1,3,0,5]
         */

        int[] array1={5,3,2};
        int[] array2={9,1,3,0,5};
        int length1= array1.length;
        int length2= array2.length;
        int length3= length1+length2;
        int[] array3=new int[length3];

        for (int i=0; i<length1; i++){
            array3[i]=array1[i];
        }
        for (int i=0; i<length2; i++){
            array3[length1+i]=array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
