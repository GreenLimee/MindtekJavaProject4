package ifElse;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Coffee or Tea?");
        String drinkType = input.next().toLowerCase();
        System.out.println("Which size? Small, medium or large?");
        String size = input.next().toLowerCase();
        double smallPrice = 1.5;
        double mediumPrice = 2;
        double largePrice = 2.5;
        double blackCoffeePrice = 0.5;
        double lattePrice = 1;
        double blackTeaPrice = 1;
        double greenTeaPrice = 1.5;
        double total = 0;

        //Coffee, medium -> Your order is medium coffee
        //coffee type of a drink + size of a drink

        if (drinkType.equals("coffee")){
            System.out.println("Black or Latte");
            String coffeeType = input.next().toLowerCase();
            System.out.println("Your order is"+" "+size+" "+coffeeType+" "+drinkType);
            //calculate the total for a given size
            if(size.equals("small")){
                total=total+smallPrice;
            }else if(size.equals("medium")){
                total=total+mediumPrice;
            }else if(size.equals("large")){
                total=total+largePrice;
            }
            //calculate a total for a given drink type
            if (coffeeType.equals("black")){
                total = total + blackCoffeePrice;
            }else if(coffeeType.equals("latte")){
                total = total + lattePrice;
            }

            System.out.println("Your total is $"+total);
        } else if  (drinkType.equals("tea")){
            System.out.println("Black or green");
            String teaType = input.next().toLowerCase();
            System.out.println("Your order is"+" "+size+" "+ teaType+" "+size);
            if(size.equals("small")){
                total=total+smallPrice;
            }else if(size.equals("medium")){
                total=total+mediumPrice;
            }else if(size.equals("large")){
                total=total+largePrice;
            }
            //calculate a total for a given drink type
            if (teaType.equals("black")){
                total = total + blackTeaPrice;
            }else {
                total = total + greenTeaPrice;
            }
            System.out.println("Your total is $"+total);
        }
         else {
            System.out.println("No such product...");
        }



            }

        }


