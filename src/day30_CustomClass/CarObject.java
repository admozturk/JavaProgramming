package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
         Car car1 = new Car();

         car1.brand = "Mercedes";
         car1.model = "CLK35";
         car1.color = "Black";
         car1.year = 2018;
         car1.price= 25600;

         Car car2 = new Car();
         car2.setInfo("BMW","BMWS300","grey",2021,35700);

         Car car3 = new Car();
         car3.setInfo("Toyota", "Corolla","white",2021,27600);


        System.out.println(car1);
        System.out.println(car2);

        car1.drive();
        car2.start();
        car3.stop();

        // how to call a specific object using arrayList (brand,price etc..)
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));
        for (Car each : carsList) {
            System.out.println(each.brand+ " : "+each.price);
        }

       // Recall; BMW: 2005~2008  and  Toyota: 1995~1997

        carsList.removeIf(p -> p.brand.equals("BMW") && p.year >=2005 && p.year<= 2008);
        carsList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);

    }
}
