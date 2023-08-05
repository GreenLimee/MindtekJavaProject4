package arraysInJava;

public class ArrayTask2 {
    public static void main(String[] args) {
        String[] countries = new String[]{"USA", "Canada", "France", "China", "Ukraine", "Turkey",
                "Japan", "Australia", "Morocco", "Egypt", "Portugal", "Brazil", "Argentina", "Chile", "Uganda"};
        int index = 0;
        int length = countries.length - 1;

        for (index = 0;  index < length; index++) {
            System.out.println(countries[index]);
    }
        //print each country in reverse

        for (int a = length; a>=0; a--){
            System.out.println(countries[a]);
        }





    }
}
