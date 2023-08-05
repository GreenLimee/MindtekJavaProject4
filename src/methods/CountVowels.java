package methods;

public class CountVowels {
    public static void main(String[] args) {
        CountVowels obj = new CountVowels();
        String s = "Nataly";
        System.out.println("The amount of vowels in "+s+" is "+obj.countVowels(s));
    }

public int countVowels(String  text){
     int count = 0;
     for (int i=0; i<text.length(); i++){
         char ch = text.charAt(i);
         if (ch=='e'||ch=='y'||ch=='u'||ch=='i'||ch=='o'||ch=='a') count=count+1;
     } return count;
    }
}