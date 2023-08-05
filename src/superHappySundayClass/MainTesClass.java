package src.superHappySundayClass;

import java.util.Arrays;

public class MainTesClass {
    public static void main(String[] args) {

        Login login = new Login ();
        Factorial factorial = new Factorial();
        MinAndMax minAndMax = new MinAndMax();
        Palindrome palindrome = new Palindrome();
        Anagrams anagrams = new Anagrams();

        int[] arrInt = {47,92,765,1,383880};

        System.out.println(login.loginMethod("mindtek@gmail.com","SmartStudents"));
        System.out.println("Factorial ---> "+factorial.getFactorial(7));
        System.out.println("Minimum and maximum numbers ----> "+ Arrays.toString(minAndMax.getMinAndMax(arrInt)));
        System.out.println("Palindrome ----> "+palindrome.checkPalindrome("Car"));
        System.out.println("Anagram ----> "+anagrams.isAnagram("listen", "silent"));

    }
}
