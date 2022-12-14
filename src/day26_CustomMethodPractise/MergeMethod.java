package day26_CustomMethodPractise;

import utilities.Arrays_Utility;

import java.util.Arrays;

public class MergeMethod {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {7,8,9,10};
        int [] arr3 = merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------------------------");

        String [] a1 = {"A", "B", "C"};
        String [] a2 = {"D", "E", "F"};

        String [] a3 = merge(a1,a2);
        System.out.println(Arrays.toString(a3));

    }

    // Merge the given two arrays return the new Arrays int []
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            result = Arrays_Utility.addElement(result, each);

        }
        for (int each : arr2) {
            result = Arrays_Utility.addElement(result, each);

        }

        return result;
    }


    // Merge the given two arrays return the new Arrays double []
    public static double[] merge(double[] arr1, double[] arr2) {
        double [] result = {};
        for (double each : arr1) {
            result = Arrays_Utility.addElement(result, each);

        }
        for (double each : arr2) {
            result = Arrays_Utility.addElement(result, each);

        }

        return result;
    }


    // Merge the given two arrays return the new Arrays char []
    public static char[] merge(char[] arr1, char[] arr2) {
        char [] result = {};
        for (char each : arr1) {
            result = Arrays_Utility.addElement(result, each);

        }
        for (char each : arr2) {
            result = Arrays_Utility.addElement(result, each);

        }

        return result;
    }


    // Merge the given two arrays return the new Arrays String []
    public static String[] merge(String[] arr1, String[] arr2) {
        String [] result = {};
        for (String each : arr1) {
            result = Arrays_Utility.addElement(result, each);

        }
        for (String each : arr2) {
            result = Arrays_Utility.addElement(result, each);

        }

        return result;
    }


}
