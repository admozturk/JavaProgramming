package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {

    String name = "James King",
            buildNumber = "11821B",
            streetName = "Jones Branch DR",
            city = "McLean",
            state = "VA",
            zipCode = "2203AB";

       // System.out.println(name + " \n" + buildNumber +"  " + streetName + "\n" + city + ", " + state + " "+ zipCode);
        String address = name + " \n" + buildNumber +"  " + streetName + "\n" + city + ", " + state + " "+ zipCode;
        System.out.println(address);





    }
}
