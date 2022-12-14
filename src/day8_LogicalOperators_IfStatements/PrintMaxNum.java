package day8_LogicalOperators_IfStatements;

public class PrintMaxNum {
    public static void main(String[] args) {

      /*
       3. Write a program that can print the maximum number between two
           numbers, if both are equal then print Equal
            Ex:
             n1= 100, n2 = 200;
             output: 200 is maximum number
       */

        int num1 = 150;
        int num2 = 200;

        boolean num1IsMax = num1>num2;
        boolean num2IsMax = num2>num1;
        boolean equal = num1==num2;

        if (num1IsMax){
            System.out.println(num1 + " is max");
        }
        if (num2IsMax){
            System.out.println(num2 + " is Max");
        }
        if (equal){
            System.out.println(" equal");
        }

    }
}
