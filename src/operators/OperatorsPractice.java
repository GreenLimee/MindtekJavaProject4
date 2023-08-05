package operators;

public class OperatorsPractice {
    public static void main(String[] args) {
        //create byte variable and int variable.
        byte numByte = 120;
        int numInt = numByte;
        System.out.println(numInt);

        int numInt2 = 150;
        byte numByte2 = (byte) numInt2;
        System.out.println(numByte2);
    }
}
