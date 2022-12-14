package utilities;

import java.util.Arrays;

public class Arrays_Utility {

    //prints each integer of an integer array in separate lines.
    public static void printEachElements(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }

    }


    //prints each double of a double array in separate lines.
    public static void printEachElements(double[] array) {
        for (double each : array) {
            System.out.println(each);

        }
    }


    //prints each char of a char array in separate lines.
    public static void printEachElements(char[] array) {
        for (char each : array) {
            System.out.println(each);


        }
    }


    //prints each String of a String array in separate lines.
    public static void printEachElements(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    //returns the maximum number from integer array
    public static int maxNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //returns the maximum number from double array
    public static double maxNumber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //returns the minimum number from int array
    public static int minNUmber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];

    }


    //returns the minimum number from int array
    public static double minNUmber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    //checks if the given integer is contained in the given array. returns boolean.  contains(int[], int)
    public static boolean contains(int[] array, int element) {

        boolean result = false;

        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //checks if the given integer is contained in the given array. returns boolean.  contains(double[], double)
    public static boolean contains(double[] array, double element) {

        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //checks if the given integer is contained in the given array. returns boolean.  contains(Char[], Char)
    public static boolean contains(char[] array, char element) {

        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //checks if the given integer is contained in the given array. returns boolean.  contains(String[], String)
    public static boolean contains(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }


    // adds to given element to arrays, returns a new Array int []
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    // adds to given element to arrays, returns a new Array double []
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;

    }


    // adds to given element to arrays, returns a new Array char []
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;

        }
        result[result.length - 1] = element;// element need to be assigned to the last index
        //     result[i]= element;  same as above
        return result;

    }


    // adds to given element to arrays, returns a new Array String []
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;

        }
        result[result.length - 1] = element;// element need to be assigned to the last index
        //     result[i]= element;  same as above
        return result;

    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;

        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element) {

        int count = 0;

        for (double each : array) {
            if (each == element) {
                count++;
            }

        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element) {

        int count = 0;
        for (char eachChar : array) {
            if (eachChar == element) {
                count++;

            }

        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element) {

        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }

        }
        return count;
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



    //removes the index from the array, returns the new array int []
    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length -1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        int[] result = new int[array.length -1];// 1,2
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of array is matching with the given index
                continue; // skip it
            }
            result[j++] = array[i];
        }
        return result;
    }


    //removes the index from the array, returns the new array double []
    public static double [] removeElement(double [] array, int index) {
        if (index < 0 || index > array.length -1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        double[] result = new double[array.length -1];// 1,2
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of array is matching with the given index
                continue; // skip it
            }
            result[j++] = array[i];
        }
        return result;
    }



    //removes the index from the array, returns the new array char []
    public static char [] removeElement(char [] array, int index) {
        if (index < 0 || index > array.length -1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        char[] result = new char[array.length -1];// 1,2
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of array is matching with the given index
                continue; // skip it
            }
            result[j++] = array[i];
        }
        return result;
    }



    //removes the index from the array, returns the new array String []
    public static String [] removeElement(String [] array, int index) {
        if (index < 0 || index > array.length -1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        String[] result = new String[array.length -1];// 1,2
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of array is matching with the given index
                continue; // skip it
            }
            result[j++] = array[i];
        }
        return result;
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
    public static double[] replace (double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) { // if the index is less than 0 or grader than the last index
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }


    // Replace the elements of the array at the given index with the new element.
    public static char[] replace (char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) { // if the index is less than 0 or grader than the last index
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;

        return array;

    }


    // Replace the elements of the array at the given index with the new element.
    public static String[] replace (String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) { // if the index is less than 0 or grader than the last index
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }



    // replace all the matching old values of the array with the new value
    public static int [] replaceAll (int [] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {

            if (array [i] == oldValue){
                array [i] = newValue;
            }

        }
        return array;
    }



    // replace all the matching old values of the array with the new value
    public static double [] replaceAll (double [] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {

            if (array [i] == oldValue){
                array [i] = newValue;
            }

        }
        return array;
    }



    // replace all the matching old values of the array with the new value
    public static char [] replaceAll (char [] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {

            if (array [i] == oldValue){
                array [i] = newValue;
            }

        }
        return array;
    }



    // replace all the matching old values of the array with the new value
    public static String [] replaceAll (String [] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {

            if (array [i].equals(oldValue)){
                array [i] = newValue;
            }

        }
        return array;
    }



    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (!Arrays_Utility.contains(result, each)) {
                result = Arrays_Utility.addElement(result, each);

            }
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (!Arrays_Utility.contains(result, each)) {
                result = Arrays_Utility.addElement(result, each);

            }
        }

        return result;
    }



    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (!Arrays_Utility.contains(result, each)) {
                result = Arrays_Utility.addElement(result, each);

            }
        }

        return result;
    }



    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (!Arrays_Utility.contains(result, each)) {
                result = Arrays_Utility.addElement(result, each);

            }
        }

        return result;
    }



}