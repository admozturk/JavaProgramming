package day27_WrapperClasses;

import java.util.Arrays;

public class Replace_Method {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        numbers = replace(numbers, 3, 45);

        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------");

        String[] str = {"Kemal", "Ayse", "salih", "Adem", "Kiraz"};
        str = replace(str, 3, "Suzan");
        System.out.println(Arrays.toString(str));

        System.out.println("---------------------------------");

        char[] ch = {'A', 'B', 'C', 'D'};
        ch = replace(ch, 2, 'c');
        System.out.println(Arrays.toString(ch));


    }

   /* 1. Replace Task:
      1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
            Ex:
    arr = {1,2,3,4,5};
    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

	1.2 Create the same functions for double arrays, char arrays, and String arrays*/

    // Replace the elements of the array at the given index with the new element.
    public static int[] replace(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }


    // Replace the elements of the array at the given index with the new element.
    public static double[] replace(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) { // if the index is less than 0 or grader than the last index
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }


    // Replace the elements of the array at the given index with the new element.
    public static char[] replace(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) { // if the index is less than 0 or grader than the last index
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;

        return array;

    }


    // Replace the elements of the array at the given index with the new element.
    public static String[] replace(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) { // if the index is less than 0 or grader than the last index
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }
}