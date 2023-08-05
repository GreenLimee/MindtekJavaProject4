package src.referenceVars;

import java.util.Arrays;

public class TestUniversity2 {
    public static void main(String[] args) {


        University u1 = new University("Lewis", "USA", 600556, false);
        University u2 = new University("Oxford", "UK", 600556, true);
        University u3 = new University("Harvard", "USA", 600556, true);
        University u4 = new University("Istanbul", "Turkiye", 600556, true);
        University u5 = new University("Chinese State University", "China", 600556, true);
        University u6 = new University("St Petersburg University", "Russia", 600556, false);
        University u7 = new University("Depaul", "USA", 600556, false);
        University u8 = new University("Springfield", "USA", 600556, false);
        University u9 = new University("Mindtek", "Universal", 600556, false);
        University u10 = new University("Berlin State University", "Germany", 600556, true);
        University u11 = new University("Paris Liberal Arts University", "France", 600556, true);


        University[] universities = new University[]{u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11};
        //  printNames(universities);
        // printNamesFromUSA(universities);
        //  printNamesByCountry(universities);
        printzUniNamesOfTop100(universities);

        University[] unisInUsa = universityList(universities, "USA");


    }

    // Task 5: return an array of unis, that are located in given country
    private static University[] universityList(University[] universities, String country) {
        //length of array (amount)

        int amount = 0;
        for (University u : universities) if (u.country.equals(country)) amount++;
        University[] unis = new University[amount];

        int index = 0;
        for (University u : universities) if (u.country.equals(country)) unis[index] = u;
        index++;

        return unis;

    }


    private static void printzUniNamesOfTop100(University[] universities) {
        for (University u : universities) {
            if (u.isInTop100) System.out.println(u.name);
        }
    }


    private static void printNamesByCountry(University[] universities, String country) {
        for (University u : universities) {
            if (u.country.equals(country)) {
                System.out.println(u.name);
            }
        }

  /*  private static void printNamesFromUSA(University[] universities) {
        for(University u: universities){
            if(u.country.contains("USA")){
                System.out.println(u.name);
            }
        }

    }

    private static void printNames(University[] universities) {
    }
*/

    }
}
