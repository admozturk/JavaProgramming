package day38_Inheritance_Continue_day3.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable (){
        System.out.println(brand+model+" is reliable");
    }

   public void start (){
       System.out.println("Twist the key to ignition start "+brand+" "+model);

   }

    @Override
    public void drive() {
        System.out.println(brand+ " "+model+ " is driving by co-pilot");
    }
}
/*
toyota:
extra methods:
           reliable()
           */
