package day37_Inheritance_Continue.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 12","6.7 inch",1000,"Black");
        System.out.println(iphone);
        iphone.call(911);
        iphone.text(756435642);
        iphone.faceTime(3454);
        iphone.faceTime("admozturk@gmail.com");
        System.out.println(iphone.hasBattery);

       Samsung samsung = new Samsung("Glaxy S-10","6.7 inch",800,"White");
        System.out.println(samsung);
        samsung.call(654);
        samsung.text(654567455);
        samsung.freeze();
        System.out.println(samsung.hasBattery);


        Nokia nokia = new Nokia("Brick","5 inches",150,"Grey");
        System.out.println(nokia);
        nokia.call(+90);
        nokia.text(34576896);
        nokia.selfDefense();
        System.out.println(nokia.hasBattery);





    }
}
