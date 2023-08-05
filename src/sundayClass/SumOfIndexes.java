package src.sundayClass;

public class SumOfIndexes {
    public static void main(String[] args) {

        String [] strArr = {"Anna", "Anas", "Mila", "Ayjan", "Takhira", "Nicole"};

        //count sum of indexes if any string contains letter "A"

        int sum = 0;

        for (int i=0; i<strArr.length; i++){
            if (strArr[i].toLowerCase().contains("a")){
                sum+=i;
            }
        }
        System.out.println(sum);


    }
}
