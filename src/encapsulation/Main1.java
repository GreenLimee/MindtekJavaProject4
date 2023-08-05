package src.encapsulation;

public class Main1 {
    public static void main(String[] args) {
        Book b1 = new Book("N Chomsky", 11, "English");
        System.out.println(b1);
        b1.author = "Noam Chomsky";
        System.out.println(b1);
    }
}
