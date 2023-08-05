package src.superHappySundayClass.constructors;

public class BuildMac {
    //This class has to have 4 fields:
    /*
    cpu in String
    gpu in String
    unified memory in String
    macModel in String;
     */

    //Create a constructor with all of the fields and initislize them
    //Create one method with void return type, call this method shipLaptop();
    //this method prints out "Your Macbook Pro 14 inches with 32 GB CPU, 10 CORE GPU, 512 unifiedMemory is ready to pick up

    public String cpu;
    public String gpu;
    public String unifiedMemory;
    public String macModel;

    public BuildMac(String cpu, String gpu, String unifiedMemory, String macModel) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.unifiedMemory = unifiedMemory;
        this.macModel = macModel;
    }
    public void shipMyLaptop(){
        System.out.println("Your "+macModel+" with "+cpu+" GB CPU  "+gpu+" GPU "+ unifiedMemory+" GB Unified Memory is being shipped");
    }
}





