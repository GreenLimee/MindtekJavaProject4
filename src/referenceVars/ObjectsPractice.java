package referenceVars;

public class ObjectsPractice {
    public static void main(String[] args) {
        // pattern: Type objName = new Type();
        Animal a1 = new Animal();
        a1.name = "cat-Leo";
        a1.age = 2;
        a1.isPet = true;
        a1.printAllInfo();

        System.out.println("-----------");
        Animal a2 = new Animal("Dog Max", 5, true);
        a2.printAllInfo();




    }
}
