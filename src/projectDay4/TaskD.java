package projectDay4;

public class TaskD {
    public static void main(String[] args) {

        /*Write a code that prints number of Quarters, Dimes, Nickels, Penny, and Total in dollars from the jar. (Think that coins in array can be changed)
int[] coins={5, 1, 10, 5, 25, 1, 5, 10, 10, 10 25};
Output: Quarters: 2 Dimes: 4
Nickels: 3
Penny: 2
Total: 1,07 dollars         */

        int[] coins ={5, 1, 10, 5, 25, 1, 5, 10, 10, 10, 25};


        int countPenny=0;
        for (int i=0; i< coins.length; i++){
            if (coins[i]==1){
                countPenny++;
            }
        }

        int countNickels=0;
        for (int i=0; i< coins.length; i++){
            if (coins[i]==5){
                countNickels++;
            }
        }

        int countDimes=0;
        for (int i=0; i< coins.length; i++){
            if (coins[i]==10){
                countDimes++;
            }
        }

        int countQuarters=0;
        for (int i=0; i< coins.length; i++){
            if (coins[i]==25){
                countQuarters++;
            }
        }


        int total = countPenny+countNickels*5+countDimes*10+countQuarters*25;

        System.out.println("Output:\nPenny: "+ countPenny + "\nNickels: " + countNickels+"\nDimes: "+countDimes+"\nQuarters: " + countQuarters+"\nTotal: "+total);


    }
}
