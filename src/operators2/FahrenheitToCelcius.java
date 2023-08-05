package operators2;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in Fahrenheit");
        int fa = input.nextInt();
        double ce = (fa - 32)*0.5556;
        System.out.println("It is " + ce + " in Celsius");




    }
}
