package day17_While_do_WhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();

        System.out.println("enter the second number");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator");
        char ch = scan.next().charAt(0);
        // +, -,

        while (!(ch=='+'||ch=='-')){
            System.err.println("invalid operator please re-enter");
            ch = scan.next().charAt(0);
        }

        if (ch=='+'){
            System.out.println(num1+num2);
        }else{
            System.out.println(num1-num2);
        }

scan.close();
    }
}
