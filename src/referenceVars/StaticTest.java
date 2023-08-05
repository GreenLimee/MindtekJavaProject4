package referenceVars;

public class StaticTest {

    public static void main(String[] args) {

        // static methods/blocks are exetuted at the very beginning of app start
        // app starts with the main method
        // ONLY static methods can call other static methods
        // non static methods can be called only by using it`s object
        // static methods are called by class name
        // non static methods can call static methods

        System.out.println("Hello from a main static method");
        StaticTest obj = new StaticTest();
        print("Hello Java");
    }

    public void printTwice(String s){
        System.out.println("-----");
        print(s);
        print(s);


    }

    public static void print(String text){
        System.out.println(text);
    }



}
