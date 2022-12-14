package day26_CustomMethodPractise;

import utilities.Arrays_Utility;

import java.util.Arrays;

public class ReverseArrays2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 4, 5};
        int[] result = reverse(arr);

        System.out.println(Arrays.toString(result));

        String[] b = {"camel"};
        String[] b2 = reverse(b);
        System.out.println(Arrays.toString(b2));
    }

    public static int[] reverse(int[] array) {
        int[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = Arrays_Utility.addElement(result, array[i]);
        }
        return result;
    }


    public static String[] reverse(String[] array) {
        String[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = Arrays_Utility.addElement(result, array[i]);
        }
        return result;
    }
}