package firstPackage;

import java.util.Arrays;

public class GetFirstNames {
    public static void main(String[] args) {
        /*1. Create a class with main method
2. Create array of Strings: String[] employees={"Steven King", "Neena Kochhar", "Alexander Hunold", "David Austin"};
3. Using for loop print only first names of employees.

Output:
Steven
Neena
Alexander
David
         */

        String[] employees={"Steven King", "Neena Kochhar", "Alexander Hunold", "David Austin"};

        for(int i=0; i<employees.length; i++){
        String firstName = employees[i].substring(0, employees[i].indexOf(" "));
            System.out.println(firstName);
        }










    }
}
