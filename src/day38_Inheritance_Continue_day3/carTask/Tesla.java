package day38_Inheritance_Continue_day3.carTask;

public class Tesla extends Car {
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot (){
        System.out.println(brand+" "+model+ " has autopilot mode");
    }

    public void start (){
        System.out.println("Say \"Start\" to start " + brand + " " + model);
    }

    @Override
    public void drive() {
        System.out.println(brand+ " "+model+ " is driving by co-pilot");
    }
}
/*
extra methods:
            autopilot(){}*/
