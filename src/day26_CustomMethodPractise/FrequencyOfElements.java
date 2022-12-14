package day26_CustomMethodPractise;

import utilities.Arrays_Utility;

public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 1, 1, 3, 4, 5, 7, 8, 9, 10, 13,};
        int numbers = frequencyOfElement(arr1, 1);
        System.out.println("numbers = " + numbers);


        System.out.println("----------------------------------------");

        double[] arr2 = {1.2, 1.2, 1.2, 1.3, 1.4, 1.5, 1.6};
        int numbers1 = frequencyOfElement(arr2, 1.2);
        System.out.println("numbers1 = " + numbers1);


        System.out.println("----------------------------------------");
        char[] arr3 = {'A', 'B', 'C', 'D', 'F', 'X','X'};
        int chr = frequencyOfElement(arr3,'X');
        System.out.println("chr = " + chr);


        System.out.println("----------------------------------------");
        String [] names = {"David", "Elvira", "Ali", "Igor", "Mehmet", "Ali", "Ali"};
        int namesHowMany = frequencyOfElement(names,"Ali");
        System.out.println("namesHowMany = " + namesHowMany);
        



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


}
