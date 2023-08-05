package src.Wrappers;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{7, 8, 9};

        System.out.println(contains(arr1, 4));
        System.out.println(isEmpty(arr2));
        System.out.println(get(arr1,0));
        set(arr1, 2, 45);
        System.out.println(Arrays.toString(arr1));
    }

    private static boolean contains(int[] arr, int a) {
        for (int el : arr)if (el == a) return true;
        return false;
    }

    private static boolean isEmpty(int[] arr){
        return arr.length==0;
    }
    private static int get(int[] arr, int index){
        return arr[index];
    }
// method to set a given value to a given index
    private static void set(int[] arr, int index, int newValue){
        arr[index]=newValue;
    }
}
