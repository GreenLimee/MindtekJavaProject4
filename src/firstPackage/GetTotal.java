package firstPackage;

public class GetTotal {
    public static void main(String[] args) {

        int[] numbers = {4, 3, 6, 5, 9, 10};
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                result += numbers[i];
            }
        }
        System.out.println(result);

       }
    }
