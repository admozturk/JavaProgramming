package day37_Inheritance_Continue.phoneTask;

public class Iphone extends Phone {
    // As we have a lot of Apple models we will fix brand as "Apple" we will take out from constructor
    // we will add the brand to the super key we took out because there is only one brand as an "Apple"
    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+ " "+model+" "+" is having a face time number "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand+ " "+model+" "+" is having a face time number "+email);
    }

}
