package day07_Operators;

public class ModulusAssignment {
    public static void main(String[] args) {
        double num3 =100;
        // %=

        num3 %= 3;
        System.out.println("num3 = " + num3);

        int amount = 127; // cents

        int quarters = amount/25;
        int cents = amount%25;
        System.out.println("cents = " + cents);
        System.out.println("quarters = " + quarters);

        System.out.println("---------------------------------");

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("------------------------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y);


        System.out.println("------------------------");

        int balance = 3500;
        balance %=153;

        System.out.println("balance = " + balance);




    }
}
