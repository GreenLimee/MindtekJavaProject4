package referenceVars;

import java.util.Arrays;

public class ObjPractice1 {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.year=2000;
        car1.company = "Toyota";

        Car car2 = new Car(2015,"Audi");
        Car car3 = new Car(2020);
        car3.company = "Honda";

        Car car4 = new Car(2017, "Opel");
        Car car5 = new Car(2019, "Jeep");
        Car car6 = new Car(2022, "Volvo");

        //String[] arr = new String[]{};
        Car[] cars = new Car[]{car1,car2,car3,car4,car5,car6};

        System.out.println(Arrays.toString(cars));

        //print the amount of cars that have a year>2020
        System.out.println("Amount "+count(cars, 2020));
        boolean contains = exists(cars,"Jeep" );
        System.out.println(contains);
    }
    private static boolean exists(Car[] cars, String companyName){
        //iterate through whole array and check each car if a companyName.equals(car.company)
        //if true then true
        for(int i=0; i<cars.length; i++){
            if(companyName.equals(cars[i].company)) return true;
        }
        return false;
    }
    // name? count
    // return: int amount
    // logic: count cars produced after given year

    public static int count (Car[] carsArray, int yearGiven){
        int amount = 0;
        if(carsArray[amount].year>yearGiven) amount++;
        return amount;
    }



}
