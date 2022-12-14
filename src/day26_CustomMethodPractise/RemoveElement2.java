package day26_CustomMethodPractise;

import utilities.Arrays_Utility;

import java.util.Arrays;

public class RemoveElement2 {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElement(numbers, 1); //{100, 300, 400, 500, 600}

        //  numbers = removeElement(numbers, 1); //[100, 400, 500, 600]

        System.out.println(Arrays.toString(numbers));
    }

    //removes the index from the array, returns the new array int []
    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index Number: " + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {// i: array's index number
            if (i != index) {
                result = Arrays_Utility.addElement(result, array[i]);
            }
        }

        return result;
    }


    //removes the index from the array, returns the new array double []
    public static double[] removeElement(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index Number: " + index);
            System.exit(0);
        }

        double[] result = {};

        for (int i = 0; i < array.length; i++) {// i: array's index number
            if (i != index) {
                result = Arrays_Utility.addElement(result, array[i]);
            }
        }

        return result;
    }

}
