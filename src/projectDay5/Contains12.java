package projectDay5;

public class Contains12 {
    public static void main(String[] args) {
        /**
         *
         * Write a method that takes an array of integers as parameter
         * and returns a boolean. Returns true if the array
         * contains 1 and 2 later somewhere in the array,
         * and 1 has to come before 2. Otherwise it will return false
         *
         * Example:
         *      .contains12([1, 3, 2]) -> true
         *      .contains12([3, 1, 2]) -> true
         *      .contains12([3, 1, 4, 5, 2]) -> true
         *      .contains12([3, 2, 4, 5, 1]) -> false
         *
         * @param nums
         * @return boolean
         */
        int[] nums = new int[]{3,1,4,5,2};
        System.out.println(contains12(nums));
    }
    public static boolean contains12(int[] nums){
        // find the index of 1
        int indOf1 = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1) {
                indOf1 = i;
                break;
            }
        }
        if(indOf1==-1 || indOf1==nums.length-1) return false;

        for(int j = indOf1+1; j<nums.length; j++){
            if(nums[j]==2) return true;
        }
        return false;
    }
}
