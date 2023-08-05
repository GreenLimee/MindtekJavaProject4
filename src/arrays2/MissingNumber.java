package arrays2;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

    int[] nums = {3, 2, 6, 1, 5, 8, 9, 7, 10};

    // can you find a missing number between 1-10;
        // 1. Sort
        // 2. Use for loop
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i+1){
                System.out.println(i+1);
                break;
            }
        }




    }
}
