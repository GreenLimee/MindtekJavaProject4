package src.sundayClass;

public class MinAndMax {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int min = Math.min(c, Math.min(a,b));
        int max = Math.max(c, Math.max(a,b));
    }
}
