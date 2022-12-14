package day26_CustomMethodPractise;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));


        System.out.println("------------------------------------");

        String[] b1 = {"camel"};
        String[] b2 = reverse(b1);
        System.out.println(Arrays.toString(b2));

        System.out.println("--------------------------------------");

        char [] a1 = {'A', 'B', 'C'};
        char [] a2 = reverse(a1);
        System.out.println(Arrays.toString(a2));

    }

    // Reverses the array, Returns new array  int []
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }


    // Reverses the array, Returns new array  double  []
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }


    // Reverses the array, Returns new array    []
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }


    // Reverses the array, Returns new array    []
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }

}

