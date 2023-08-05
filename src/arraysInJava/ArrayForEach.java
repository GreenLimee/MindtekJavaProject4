package arraysInJava;

public class ArrayForEach {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5};
        //fine the total sum of numbers in arr
        int sum=0;
        for(int el:arr){
            sum+=el;
        }
        System.out.println("The sum is: "+sum);
    }
}
