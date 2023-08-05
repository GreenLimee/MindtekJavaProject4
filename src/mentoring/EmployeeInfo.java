package mentoring;

import java.util.Locale;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
        1.Create a class with a main method
        2.Create below String variable
           String info ="David,SDET,Chicago";
        3. Applying String methods to info variable print output below:
        DAVID
        SDET
        CHICAGO
         */
        String info ="David,SDET,Chicago";

        int indexOfComa = info.indexOf(","); //3
        String firstName=info.substring(0,indexOfComa).toUpperCase();
        System.out.println(firstName);

        int indexOfSecondComa=info.indexOf(",",indexOfComa);
        String position = info.substring(indexOfComa+1,indexOfSecondComa).toUpperCase();
        System.out.println(position);

        String city = info.substring(indexOfSecondComa+1).toUpperCase();
        System.out.println(city);

    }
}
