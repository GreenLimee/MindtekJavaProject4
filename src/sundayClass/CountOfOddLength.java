package src.sundayClass;

public class CountOfOddLength {
    public static void main(String[] args) {
        String[] animals = {"Wolf", "Dog", "Cat", "Sheep", "Mouse", "Chicken", "Rooster", "Goose", "Monkey"};
        // count sum of indexes only if string length is odd number

        int sum=0;
        for(int i=0; i<animals.length; i++){
            if(animals[i].length()%2==1){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
