package src.superHappySundayClass;

public class CommonLetters {
    public static void main(String[] args) {
        String[] values={"sun","fun","cut"};  //→ returns "u"

        for(char el :values[0].toCharArray()) {


            for (char el1 : values[1].toCharArray()) {


                for (char el2 : values[2].toCharArray()) {
                    if (el==el1 && el1==el2) System.out.println("common letter " +el );
                }
            }
        }
    }
}
