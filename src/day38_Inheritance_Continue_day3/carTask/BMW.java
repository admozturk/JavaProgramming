package day38_Inheritance_Continue_day3.carTask;

public class BMW extends Car {

    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breakDown (){
        System.out.println(brand+" "+model+" is breaks down");
    }

    public void racing  (){
        System.out.println(brand+" "+model+" is a racing");
    }
}
/*
2. BMW:
	extra methods:
				breaksDown()
				racing()
 */