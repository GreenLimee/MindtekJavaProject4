package arraysInJava;

import java.util.Arrays;

public class ArraysIntro2 {
    public static void main(String[] args) {

        // second way to create array: type[] name = new type []{val1, val2, val3};

        int[] nums = new int []{100,200,300,400};
        System.out.println("Before change");
        System.out.println(Arrays.toString(nums));

        //change the last element to 700,
        //get the length of array: nameOfArray.length
        int lastIndex = nums.length-1;
        nums[lastIndex]=700;

        System.out.println("After change");
        System.out.println(Arrays.toString(nums));





    }
}
