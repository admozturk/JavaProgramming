package day37_Inheritance_Continue.phoneTask;

public class Nokia extends Phone{
    // As we have a lot of Nokia models we will fix brand as "Nokia" we will take out from constructor
    // we will add the brand to the super key we took out because there is only one brand as a "Nokia"
    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense (){
        System.out.println(brand+ " : "+model+ " has self defense tool ");
    }
}
