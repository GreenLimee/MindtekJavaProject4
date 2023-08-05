package methods;

import java.util.Arrays;

public class GetLengths {
    public static void main(String[] args) {
        String [] arr = new String[]{"Hey", "Hello", "How are you"};
        System.out.println(Arrays.toString(arr));
        GetLengths obj = new GetLengths();
        int[] arrLengts = obj.getLengths(arr);
        System.out.println(Arrays.toString(arrLengts));
    }
public int [] getLengths(String[] arrOfWords) {
    int[] numArr = new int[arrOfWords.length];

    for (int i = 0; i < arrOfWords.length; i++) {
        numArr[i] = arrOfWords[i].length();
    }
    return numArr;
}
}
