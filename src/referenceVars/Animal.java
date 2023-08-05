package referenceVars;

public class Animal {
    // state
    String name;
    int age;
    boolean isPet;

    // constructor
    // looks like a method but without return type
    // each constructor must have a class Name
    //can accept 0 or any amount of parameters (used to initialize a state of object: assign values)
    public Animal(){

    }
    public Animal(String name, int age, boolean isPet){
        this.name = name;
        this.age = age;
        this.isPet = isPet;
    }

    // behavior
    void sounds(String sound){
        System.out.println(("Says: ")+sound);
    }
    void printAllInfo(){
        System.out.println("Animal`s name -> "+name);
        System.out.println("Animal`s age -> "+age);
        if(isPet) {
            System.out.println("Animal is a pet");
        }else{
            System.out.println("Animal is not a pet");
        }
    }







}
