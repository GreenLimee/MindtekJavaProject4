package projectDay5;

public class threeAmigos {
    /**
     * Write a method implementation that accepts
     * an array of integers as parameter and
     * returns a boolean.
     * Method should return true if array contains three consecutive even number
     * or three consecutive odd numbers otherwise return false.
     *
     * Example:
     *      .threeAmigos([2, 1, 3, 5]) -> returns true
     *      .threeAmigos([2, 1, 2, 5]) -> returns false
     *      .threeAmigos([2, 4, 2, 5]) -> returns true
     *
     */

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,66,22,5,6,7,8};



    }

    // adding "static" keyword to be able to callthis method from the main method
    public static boolean threeAmigos(int[] arr){
        for(int i=2; i< arr.length; i++){
           if(arr[i]%2==0 && arr[i-2]%2==0 && arr[i-3]%2==0) return true;
           if(arr[i]%2==1 && arr[i-2]%2==1 && arr[i-3]%2==1) return true;
        }
        return false;
    }


   /* public static int[] threeAmigos2(int[] arr){
        for(int i=2; i< arr.length; i++){
            if(arr[i]%2==0 && arr[i-2]%2==0 && arr[i-3]%2==0) return
            if(arr[i]%2==1 && arr[i-2]%2==1 && arr[i-3]%2==1)
        }
        return null;

    */
    }






