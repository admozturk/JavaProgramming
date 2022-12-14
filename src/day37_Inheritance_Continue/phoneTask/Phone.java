package day37_Inheritance_Continue.phoneTask;

public class Phone {
    // 5 instance variables
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    // 1 static variable
    public static boolean hasBattery = true;

    // 1 constructor only this one will not be inherited by the subclasses
    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    // 3 Instance Methods
    public void text (long phoneNumber){
        System.out.println(brand+" : "+model+" is texting "+phoneNumber);
    }

    public void call (long phoneNumber){
        System.out.println(brand+" : "+model+" is Calling "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }


}
/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */