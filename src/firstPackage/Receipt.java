package firstPackage;

public class Receipt {
    public static void main(String[] args) {
        String item1 = "Iphone 13";
        String item2 = "AirPods";
        int item1Price = 999;
        int item2Price = 179;
        System.out.println("Apple Store Receipt");
        System.out.println("    ****    ");
        System.out.println("Iphone 13: " + item1Price + " dollars");
        System.out.println("AirPods: " + item2Price + " dollars");
        System.out.println("=========");
        int sum = item1Price + item2Price;
        System.out.println("Total: " + sum);


    }
}
