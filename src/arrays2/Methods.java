package arrays2;

public class Methods {

    public int add (int num1, int num2){
        int total = num1+num2;
        return total;
    }

    public static void main(String [] args){
        //Objects
        Methods myMethod = new Methods();
        System.out.println(myMethod.add(2,3));

        System.out.println(myMethod.multiply(3,2,7));
    }

    public int multiply (int num1, int num2, int num3){
        int total= num1*num2*num3;
        return total;
    }



}
