package src.superHappySundayClass;

public class Palindrome {

    public boolean checkPalindrome (String str){

        String reversed = "";
        boolean isPalindrome = false;

        for (int i= str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversed)){
            isPalindrome = true;
        }
        return isPalindrome;






    }


}
