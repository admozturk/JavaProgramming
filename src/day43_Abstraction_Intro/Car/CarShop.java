package day43_Abstraction_Intro.Car;

public class CarShop {
    public static void main(String[] args) {

       Honda honda = new Honda("Accord","blue",2002,30000);
       Audi audi = new Audi("A345","black",2009,29000);
       Tesla tesla = new Tesla("model5","white",2020,50000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("white");
        audi.setColor("grey");
        tesla.setColor("yellow");

        honda.setPrice(28000);
        audi.setPrice(35000);
        tesla.setPrice(55000);

        System.out.println("-------------------------------------------------------------------");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);










    }
}
