package src.Wrappers;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersect {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 5, 6};
        int[] arr2 = new int[]{4, 5, 8, 9};
       // System.out.println(Arrays.toString(intersectWithArrays(arr1,arr2)));
        //create an arr with only unique elements
        intersectWithArraysList(arr1, arr2);
    }
    private static int[] intersectWithArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];

        //put every element nums1 into array
        for (int i = 0; i < nums1.length; i++) array[i] = nums1[i];
        System.out.println(Arrays.toString(array));

        boolean found = false;
        int index = nums1.length;
        for (int i = 0; i < nums2.length; i++) {
            found = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                array[index] = nums2[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
        int[] res = new int[index];
        for (int i = 0; i < res.length; i++) res[i] = array[i];
        System.out.println(Arrays.toString(res));
        return res;
    }

    private static Integer[] intersectWithArraysList(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int el: nums1) list.add(el);

        for(int el: nums2) {
            if(!list.contains(el)) list.add(el);
        }
        return list.toArray(new Integer[0]);
    }
}

