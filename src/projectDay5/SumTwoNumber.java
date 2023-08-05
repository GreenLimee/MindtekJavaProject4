package projectDay5;

public class SumTwoNumber {
    public static void main(String[] args) {
        /**
         * Write a method implementation that accepts
         * an array of ints and returns a boolean.
         * Return true if that array contains
         * two ints that has sum 100.
         *
         * Example:
         *      .make100With2([5,3,2,99,1]); -> returns true as sum of 99 and 1 is 100
         *      .make100With2([43,88,23,57]); -> returns true as sum of 43 and 57 is 100
         *      .make100With2([5,3,77,3,43]); -> returns false as there is no number with sum of 100
         *
         * @param nums
         * @return boolean
         */

        int[] nums = new int[]{40,88,23,60,43};
        System.out.println(make100With2(nums));
    }

    public static boolean make100With2(int[] nums){
        //logic to find if x+y=100 in nums
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                System.out.println(nums[i]+"+"+nums[j]);
                if(nums[i]+nums[j]==100) return true;
            }
        }
        return false;
    }

    public static boolean make100With3(int[] nums){
        //logic to find if x+y=100 in nums
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                System.out.println(nums[i]+"+"+nums[j]);
                if(nums[i]+nums[j]==100) return true;
            }
        }
        return false;
    }



}
