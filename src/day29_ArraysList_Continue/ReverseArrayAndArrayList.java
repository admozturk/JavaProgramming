package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
        // reverse Array

        int[] array = {1,2,3,4,5,6};// represents i index number of array

        int [] result = new int [array.length];// to contain all the new original array

        int j = 0;// index number of array result
        for (int i = 0; i < array.length; i++, j++) {
            result[j] = array[i];
        }
        System.out.println(Arrays.toString(result));

        System.out.println("---------------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reversedList.add(each);

        }
        System.out.println();
    }
}
