package operators;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is Yor name: ");
        String name = input.next();
        System.out.println("What is your age ");
        int age = input.nextInt();
        System.out.println("Hello " + name + ". Your age is " + age);

    }
}
