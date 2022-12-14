package day07_Operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {

        int a = 5;
        ++a;// increase the value by 1 the result is 6
        --a;// decrease the value by 1 the result is 5
        System.out.println("a = " + a);

        System.out.println("-------------------------------------------");

        int b = 100;
        System.out.println(++b);// pre increment; increases the value by 1 result is 101

        int c = 100;
        System.out.println(c++);// post increment; first passes the value than increases the value by 1
        System.out.println(c); //101

        System.out.println("=================================================");

        int x = 200;

        System.out.println(--x);// pre decrement: decreases the value by 1 immediately

        int y =200;
        System.out.println(y--); // post decrement; first passes the current value then decreases the value by 1
        System.out.println(y);

        System.out.println("==================================================");

        int z = 45;

        System.out.println(++z);// 46  z= 46
        System.out.println(z++);//46   z= 47 it is done the calculation
        System.out.println(z);

        int gy = 55;

        System.out.println(gy--);// 54 gy; 54
        System.out.println(gy--);// 54 gy; 53
        System.out.println(gy);






    }
}
