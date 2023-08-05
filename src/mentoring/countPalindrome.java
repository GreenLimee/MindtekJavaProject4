package mentoring;

public class countPalindrome {
    public static void main(String[] args) {
        String[] word = {"Radar", "Level", "Noon", "Pop", "City", "Civic", "Long"};

        //Count how many palindrome words does this array of Strings contains.
        //Output: Array has 5 palindrome words.

        //Use Nested for loop and if-else statement.
        //Use count ++;
        int count = 0;

        for (int i = 0; i < word.length; i++) {
            String reverse = "";
            String index = word[i];
            for (int a = index.length() - 1; a >= 0; a--) {
                reverse += index.charAt(a);
            }
            if (index.equalsIgnoreCase(reverse)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
