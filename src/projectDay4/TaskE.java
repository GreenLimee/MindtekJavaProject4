package projectDay4;

public class TaskE {
    public static void main(String[] args) {


        /* Write a program that finds common fruits from two below baskets:
        String[] basket1={"Orange", "Apple", "Kiwi", "Peaches", "Watermelon"}; String[] basket2={"Melon", "Kiwi", "Banana", "Apple", "Kiwi"};
        Output:
        Common fruits are Apple, Kiwi,

         */
        String[] basket1 = {"Orange", "Apple", "Kiwi", "Peaches", "Watermelon"};
        String[] basket2 = {"Melon", "Kiwi", "Banana", "Apple", "Kiwi"};

       /* int count = 0;
        for(int i=0;i<basket1.length;i++){
            if(basket1[i].equalsIgnoreCase("apple"))
                count++;
        */

        String commonFruits = "Common fruits from the basket ";
        for (int i = 0; i < basket1.length; i++) {
            for (int j = i; j < basket2.length; j++) {
                if (basket1[i].equals(basket2[j]) && !commonFruits.contains(basket1[i])){
                    commonFruits=commonFruits+basket1[i]+",";
                }
            }
        }
        System.out.println(commonFruits.substring(0,commonFruits.length()-1));
    }
}
