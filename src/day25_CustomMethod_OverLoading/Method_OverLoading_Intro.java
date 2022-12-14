package day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class Method_OverLoading_Intro {
    public static void main(String[] args) {

        int [] intArray = {5,6,7,-1,-2,-3};
        Arrays.sort(intArray);

        double [] doubles = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubles);

        char  [] chars ={'A', 'D', 'F', 'B', 'A'};
        Arrays.sort(chars);

        System.out.println("-------------------------------------------");

        //sum of 10 and 20
        int sum1 = sumOfNumbers(10,20);

        // sum of 10, 20, 30
        int sum2 = sumOfNumbers(10, 20, 30);

        // sum of 10, 20, 30, 40
        int sum3 = sumOfNumbers(10, 20, 30, 40);

        // sum of 18.2 and 30.7
        double sum4 = sumOfNumbers(18.2, 30.7);

        //sum of 5.5, 4.5, 6.5
        double sum5 = sumOfNumbers(4.5 , 5.5, 6.5);

        // sum of 4.5, 3.5, 2.5, 6.5
        double sum6 = sumOfNumbers(4.5 , 3.5, 2.5, 6.5);

    }

    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3){
        return sumOfNumbers(num1, num2) + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }




}
