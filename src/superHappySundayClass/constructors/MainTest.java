package src.superHappySundayClass.constructors;

public class MainTest {
    public static void main(String[] args) {
      //  TempConverter convert = new TempConverter(100);
        // convert.getTemp();

 //       BuildMac mac = new BuildMac("32 Gb", "10 Core", "512 Gb",
   //             "MacBook Pro 14 inches. ");
     //   mac.shipMyLaptop();


        Store walmart = new Store("walmart", "Water", 2,50, true);

        walmart.printMessage();

        Store costco = new Store("costco", "Olive oil", 2,50, true);

        costco.printMessage();


    }
}
