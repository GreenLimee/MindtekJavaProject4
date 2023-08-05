package arraysInJava;

import java.util.Arrays;

public class ArrayTask8 {
    public static void main(String[] args) {
        int [] arr = new int[]{12,23,34,45,56,67,78};
        // add 3 into each value of arr

        for(int i=0; i< arr.length; i++){
            arr[i]+=3;
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[arr.length];

        for(int i=0; i<arr2.length; i++){
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));


        //for each loop: for(type name: arr){}
        for(int element: arr){
            System.out.println(element);
        }

    }
}
