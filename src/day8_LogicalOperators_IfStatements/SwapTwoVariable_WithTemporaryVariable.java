package day8_LogicalOperators_IfStatements;

public class SwapTwoVariable_WithTemporaryVariable {
    public static void main(String[] args) {
         int a = 10;
         int b = 15;

         int c = b;
         b = a;
         a = c;


        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
