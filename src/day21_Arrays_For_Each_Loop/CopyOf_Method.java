package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class CopyOf_Method {
    public static void main(String[] args) {

        // copyOf(array, newLength) method copying the elements in one to another array
        // starts copying from the beginning I mean from the first element till the wanted element returns new Array

        String[] students = {"Elif", "Sinem", "Gunay", "cihad", "david", "james", "Aeron", "Daniel"};

        String[] earlyBirds = Arrays.copyOf(students, 5);// cannot copy from the middle or specific element

        System.out.println(Arrays.toString(earlyBirds));// if you give a number more than the given elements it will print null

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newNumb = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(newNumb));

        System.out.println("-------------------------------------------------------------------------------");

        // CoppyOfRange (array, beginningIndex, EndingIndex); Copies the elements of array,
        // from the beginning to ending-index(ending index excluded) returns new array

        char[] ch1 = {'a', 'c', 'b', 'd', 'e', 'f', 'g'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 5);
        System.out.println(Arrays.toString(ch2));

        int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //     index =   0   1  2  3  4  5  6  7  8  9
        int[] result = Arrays.copyOfRange(score, 3, 7 + 1);
        System.out.println(Arrays.toString(result));

        System.out.println("--------------------------");

        int[] arr1 = {1, 3, 2, 7, 9, 11};
        int[] arr2 = {1, 2, 3, 9, 11, 7};


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1 [i]+" ");

        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]+" ");

        }

        System.out.println();
    }
}
