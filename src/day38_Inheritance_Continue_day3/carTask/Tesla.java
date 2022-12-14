package day38_Inheritance_Continue_day3.carTask;

public class Tesla extends Car {
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot (){
        System.out.println(brand+" "+model+ " has autopilot mode");
    }

}
/*
extra methods:
            autopilot(){}*/
