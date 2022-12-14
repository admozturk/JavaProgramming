package day37_Inheritance_Continue.phoneTask;

public class Samsung extends Phone{
    // As we have a lot of Samsung models we will fix brand as "Samsung" we will take out from constructor
    // we will add the brand to the super key we took out because there is only one brand as an "Samsung"
    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

   public void freeze (){
       System.out.println(brand+ " : "+model+ " is freezing");
   }
}
