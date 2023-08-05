package arraysInJava;

public class ArrayTask6 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 23, 11, 45, 566, -2000, -23, 45};

        // print "It is in increasing order" or not

        boolean isIncreasingOrder = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                System.out.println("Is not in increasing order");
                isIncreasingOrder = false;
                break;
            }
        }
        if(isIncreasingOrder)
        System.out.println("Is in increasing order");
    }
}
