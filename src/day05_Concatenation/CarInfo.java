package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        int year = 2008;
        String make = "Mercedes";
        String model = "Benz";
        int miles = 96500;
        String color = "Grey";
        String price = "$11.500";

        //System.out.println(year +" " + make +" " +model +", "+ miles +", "+ color +", "+ price);
        String myCar = year +" " + make +" " +model +", "+ miles +", "+ color +", "+ price;
        System.out.println(myCar);

    }
}
