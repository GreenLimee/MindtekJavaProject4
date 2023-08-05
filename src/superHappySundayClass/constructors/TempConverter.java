package src.superHappySundayClass.constructors;

public class TempConverter {

    public int f;

    //Create a class TempConverter;
    //This class needs to have one instance variable int f;
    //This class has to have one constructor with one parameter and initialize variable;
    //This class also has one method with return type VOID which will convert from F---->C and
    //Print out message Your entered temp in Celsius will be temp;

    //int c = (f-32)*5/9;

    public TempConverter (int f){
        this.f = f;
    }

    public void getTemp(){
        int c = (f-32)*5/9;
        System.out.println("Your entered temperature in Celsius will be "+c);

    }

}
