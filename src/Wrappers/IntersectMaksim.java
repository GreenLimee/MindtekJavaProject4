package src.Wrappers;

public class IntersectMaksim {
    static String[] equal(int[] nums1 , int[] nums2){
        String toArr = "";
        int bgNumsLength = Math.min(nums1.length, nums2.length);
        for (int i = 0; i < bgNumsLength; i++){
            for (int i1 = 0; i1 < bgNumsLength; i1++){
                if (nums1[i] == nums2[i1]){
                    toArr += nums1[i]+",";
                    break;
                }
            }
        }
        return toArr.split(",");
    }
}
