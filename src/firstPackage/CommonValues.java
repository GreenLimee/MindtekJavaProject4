package src.firstPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonValues {
    /*1. Create a class with main method with below lists
     List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,4,6,1));

    List<Integer> list2=  new ArrayList<>(Arrays.asList(3,4,6,0));
    List<Integer> list3=new ArrayList<>();

2. Find common numbers and store them in list3, then print list3 and output should be '[4,6]'
     */

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,4,6,1));
        List<Integer> list2=  new ArrayList<>(Arrays.asList(3,4,6,0));
        List<Integer> list3=new ArrayList<>();

        for(Integer el: list1){ for(Integer el1: list2) if(el==el1) list3.add(el);

            System.out.println(list3);
        }

    }

}
