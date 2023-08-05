package referenceVars;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.age = 27;
        st1.fName = "Jake";
        st1.lName = "Smith";

        st1.displayInfo();
        st1.displayAge();

        Student st2 = new Student();
        st2.displayInfo();

        System.out.println(st1);
        System.out.println(st2);



    }
}
