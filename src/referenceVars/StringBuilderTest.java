package referenceVars;

public class StringBuilderTest {
    public static void main(String[] args) {
        String animal1 = new String("Zebra");
        String animal2 = new String("Zebra");

        System.out.println("=="+(animal1=animal2));
        System.out.println(animal1.equals(animal2));
        //immutable class: clas that never changes, not modifiable

        StringBuilder text = new StringBuilder("table");
        System.out.println();

    }
}
