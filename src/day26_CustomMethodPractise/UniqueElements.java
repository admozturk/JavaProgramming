package day26_CustomMethodPractise;

import utilities.Arrays_Utility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9};
        int[] unique = uniqueElement(array);
        System.out.println(Arrays.toString(unique));


        System.out.println("-------------------------------------");

        double[] array1 = {2.3, 2.3, 4.5, 6.6, 7.8, 7.8, 20.5, 20.5};
        double[] unique1 = uniqueElement(array1);
        System.out.println(Arrays.toString(unique1));


        System.out.println("-------------------------------------");

        char[] array2 = {'A', 'A', 'B', 'B', 'C', 'C', 'D', 'F', 'F', 'X'};
        char[] unique2 = uniqueElement(array2);
        System.out.println(Arrays.toString(unique2));


        System.out.println("-------------------------------------");
        String [] array3 = {"Hasan", "Hasan","Osman", "Osman", "Adem", "Ali", "Ali"};
        String [] unique3 = uniqueElement(array3);
        System.out.println(Arrays.toString(unique3));


    }


    // returns the unique elements of the array as a new array int []
    public static int[] uniqueElement(int[] array) {
        int[] result = {}; //new int [0]

        for (int each : array) {
            if (Arrays_Utility.frequencyOfElement(array, each) == 1) {// if the frequency is one,the element is unique
                result = Arrays_Utility.addElement(result, each);
            }

        }
        return result;

    }


    // returns the unique elements of the array as a new array double []
    public static double[] uniqueElement(double[] array) {
        double[] result = {}; //new int [0]

        for (double each : array) {
            if (Arrays_Utility.frequencyOfElement(array, each) == 1) {
                result = Arrays_Utility.addElement(result, each);
            }

        }
        return result;

    }


    // returns the unique elements of the array as a new array char []
    public static char[] uniqueElement(char[] array) {

        char[] result = {};// char value 0

        for (char each : array) {
            if (Arrays_Utility.frequencyOfElement(array, each) == 1) {
                result = Arrays_Utility.addElement(result, each);
            }


        }
        return result;
    }


    // returns the unique elements of the array as a new array String []
    public static String [] uniqueElement (String [] array){
        String [] result = {};
        for (String each : array) {
            if (Arrays_Utility.frequencyOfElement(array,each)==1){
                result= Arrays_Utility.addElement(result,each);
            }

        }
        return result;
    }

}