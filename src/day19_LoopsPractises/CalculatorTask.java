package day19_LoopsPractises;

import java.util.Scanner;

public class CalculatorTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0);

        if (!(operator=='+' || operator == '-')){
            System.err.println("Invalid entry");//if the operator is in valid
            System.exit(0);// whenever you want to terminate the program use this
        }
        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        if (operator=='+'){
            System.out.println(num1+num2);
        }else{
            System.out.println(num1-num2);


        }


    }
}
