package day06_primitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(10 + 20);
        System.out.println( 20 - 10);
        System.out.println( 10 * 15);
        System.out.println( 20 / 4);

        System.out.println(100 / 3); // you will get an integer value because both of them int numbers
        System.out.println(100.0 / 3); // if you use 1 decimal and 1 int you will get decimal number

        int a = 100;
        double b = a/6d;
        System.out.println(b);

        double c = a/6.0; // to find the decimal put .0
        double d = a/6d; // to find the decimal another way add (d)
        double e = (double) a/6; // or you may cast int to double manually
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);







    }
}
/*addition
- : subtraction
* : multiplication
/ : division
% : remainder




 */