package referenceVars;

public class Student {
    String fName;
    String lName;
    int age;
    String gender;

    public void displayInfo(){
        System.out.println("Student name "+fName+lName);
        System.out.println("Student age "+age);
        System.out.println("Student gender "+gender);
    }
    public void displayAge(){
        System.out.println("Student name is "+fName+" and he is "+age+" years old");
    }
}
