package src.superHappySundayClass;

public class StrBuilderPr {
    public static void main(String[] args) {
        // create a method which takes one String parameter;
        //it checks the String, if it is palindrome or not
        //if it is palindrome, return true, otherwise return false;

        //use StringBuilder. ---> reverse(), toString();

        System.out.println(palindrome("Java"));

    }
        public static boolean palindrome (String str){
            StringBuilder builder = new StringBuilder(str);
            StringBuffer buffer = new StringBuffer("Java");

            String reversed = builder.reverse().toString();

            if(str.equalsIgnoreCase(reversed)){
             return true;
            }
            return false;
    }
}
