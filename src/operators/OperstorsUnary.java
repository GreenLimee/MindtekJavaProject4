package operators;

public class OperstorsUnary {
    public static void main(String[] args) {

        // pre
        int a = 10;
        System.out.println(a++);  // two operations: print and then increment
        System.out.println("Value of a: " + a);

        // pro
        int b = 20;
        System.out.println(--b);  // two operations: first increment and then print

        // Modulus; % remainder
        int a1 = 100;
        System.out.println(a1%3);
        System.out.println(a1%5);
        System.out.println(a1%9);


    }
}
