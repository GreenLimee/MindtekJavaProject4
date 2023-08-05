package src.mentoring;

public class Vowels {

    /*
    String str = "hello"
     */

    public static String reverseVowels(String str){

        String vowels = "auioe";
        String strVowels ="";

        for(int i=0; i<str.length(); i++){
            if(vowels.contains(str.charAt(i)+"")){
                strVowels+=str.charAt(i);

            }
        }

        for (int i=0, a=strVowels.length()-1; i<str.length(); i++){
            if(vowels.contains(str.charAt(i)+"")){
                str=str.substring(0,i)+strVowels.charAt(a)+str.substring(0,i+1);
                a--;
            }

        }
return str;

    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("audio"));
    }

}
