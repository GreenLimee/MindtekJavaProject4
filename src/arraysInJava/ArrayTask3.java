package arraysInJava;

import java.util.Arrays;

public class ArrayTask3 {
    public static void main(String[] args) {
        String[] countries = new String[]{"USA", "Canada", "France", "China", "Ukraine", "Turkey",
                "Japan", "Australia", "Morocco", "Egypt", "Portugal", "Brazil", "Argentina", "Chile", "Uganda"};

        //print countries which starts letter a
        int count = 0;
        for(int i = 0; i < countries.length-1; i++){
          if(countries[i].toLowerCase().startsWith("a")){
              System.out.println(countries[i]);
              count++;
          }
      }


        System.out.println("Amount of countries that starts with a is "+count);


    }
}
