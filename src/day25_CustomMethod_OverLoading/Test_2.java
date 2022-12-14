package day25_CustomMethod_OverLoading;

import utilities.Arrays_Utility;

public class Test_2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        Arrays_Utility.printEachElements(arr1);


        System.out.println("--------------------------------");
        double[] arr2 = {1.5, 2.5, 3.5, 4.5, 5.5};
        Arrays_Utility.printEachElements(arr2);


        System.out.println("--------------------------------");
        char[] arr3 = {'A', 'B', 'C', 'D'};
        Arrays_Utility.printEachElements(arr3);


        System.out.println("--------------------------------");
        String[] names = {"David", "Elvira", "Ali", "Igor"};
        Arrays_Utility.printEachElements(names);


        System.out.println("---------------------------------");
        int[] n1 = {10, 2, 3, 4, 5, 6};
        int max1 = Arrays_Utility.maxNumber(n1);
        System.out.println("max1 = " + max1);


        System.out.println("----------------------------------");
        double[] n2 = {2.3, 4.5, 6.6, 7.8, 20.5};
        double max2 = Arrays_Utility.maxNumber(n2);
        System.out.println("max2 = " + max2);


        System.out.println("-------------------------------------");
        int[] num1 = {12, 2, 3, 4, 5, 36};
        int min1 = Arrays_Utility.minNUmber(num1);
        System.out.println("min1 = " + min1);


        System.out.println("-------------------------------------");
        double[] num2 = {12.4, 2.5, 3.6, 4.8, 5.0, 36.9};
        double min2 = Arrays_Utility.minNUmber(num2);
        System.out.println("min2 = " + min2);


        System.out.println("---------------------------------------");

        int[] cont1 = {1, 2, 3, 4, 5};
        boolean result1 = Arrays_Utility.contains(cont1, 5);
        System.out.println("result1 = " + result1);


        System.out.println("---------------------------------------");

        double[] cont2 = {2.3, 4.5, 6.6, 7.8, 20.5};
        boolean result2 = Arrays_Utility.contains(cont2, 5);
        System.out.println("result2 = " + result2);


        System.out.println("---------------------------------------");
        char[] cont3 = {'A', 'B', 'C', 'D', 'F', 'X'};
        boolean result3 = Arrays_Utility.contains(cont3, 'X');
        System.out.println("result3 = " + result3);


        System.out.println("-----------------------------------------");
        String[] studentNames = {"David", "Elvira", "Ali", "Igor", "Mehmet"};
        boolean cont4 = Arrays_Utility.contains(studentNames,"Memo");
        System.out.println("cont4 = " + cont4);
        


    }
}
