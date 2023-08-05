package src.sundayClass;

public class NamesSeparated {
    public static void main(String[] args) {
        String[] fullNames = {"Patel Harsh", "John Doe", "Steven Kings", "Donald Trump"};

        for(int i=0; i<fullNames.length; i++){
            String firstName = fullNames[i].substring(0,fullNames[i].indexOf(" "));
            String lastName = fullNames[i].substring(fullNames[i].indexOf(" ")+1);
            System.out.println("The first name is "+ firstName+" and last name is "+lastName);
        }
    }
}
