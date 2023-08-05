package src.superHappySundayClass.constructors;

public class Store {
    //This class has to have 6 fields
    /*
    storeName in String;
    productName in Sting;
    quantity in int;
    price in double;
    hasDiscount in boolean;
    discountPercent in int
     */

    //Create a constructor with 5 fields: storeName, productName,
    // quantity, price, hasDiscount
    // The field discountPercent has to be initialized in the constructor by giving value;
    // Example: this.discountPercent = 15;

    public String storeName;
    public String productName;
    public int quantity;
    public double price;
    public boolean hasDiscount;
    public int discountPercent;

    public Store(String storeName, String productName, int quantity, double price, boolean hasDiscount) {
        this.storeName = storeName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.hasDiscount = hasDiscount;
        this.discountPercent = 15;
    }

    public double getDiscountPrice(){
        double result = price*0.85;
        return result;
    }

    public double getSubtotal(){
        double total = 0;
        if(hasDiscount){
            total = getDiscountPrice()*quantity;
        }else{
            total = price*quantity;
        }
        return total;
    }
    public void printMessage(){
        if(hasDiscount){
            System.out.println("You have choose "+productName+" and your total is $"+ getSubtotal());
            System.out.println("Your savings is $: "+(price-getDiscountPrice())*quantity);
        }else{
            System.out.println("You choose "+productName+"and your total is "+getSubtotal());
        }
        System.out.println("Thank you for shopping in "+storeName);
    }
}
