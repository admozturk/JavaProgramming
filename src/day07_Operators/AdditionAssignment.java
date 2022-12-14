package day07_Operators;

public class AdditionAssignment {
    public static void main(String[] args) {

     // addition assignment (+=)

    int x = 100;

        System.out.println("x = " + x);//100

       // x = x + 200;
       // System.out.println("x = " + x);
        // normally the formula the one that above but the shortcut we say additional assignment (+=)
        x += 200;
        System.out.println("x = " + x);

        System.out.println("===================================");

        String str = "wooden ";
        str += "spoon";

        System.out.println("str = " + str);

        System.out.println("-----------------------------");

        double num1 = 2.5;
        num1 += 5.5;

        System.out.println("num1 = " + num1);

        System.out.println("--------------------------------");

        double availableBalance = 1000.50;
        // deposit $300
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);


        
    }

}
