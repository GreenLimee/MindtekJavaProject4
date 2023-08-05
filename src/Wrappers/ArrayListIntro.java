package src.Wrappers;

import java.util.ArrayList;
import java.util.Arrays;

// array must have a fixed sized when created
public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);

        //read element
        System.out.println(list.get(0));

        //change element
        list.set(2,100);

        //remove el at spec index
        list.remove(0);

        //check if empty
        System.out.println(list.isEmpty());

        //length of arraylist
        System.out.println(list.size());

        //check if your list contains given int a
        list.contains(100);

        System.out.println(list);
        System.out.println("The length of arraylist: "+list.size());
        System.out.println("=======");

        int[] arr = new int[3];
        arr[0] = 55;
        arr[1] = 66;
        arr[2] = 77;
        arr[3] = 88;
        System.out.println(Arrays.toString(arr));
        System.out.println("The length of array: "+arr.length);



    }
}
