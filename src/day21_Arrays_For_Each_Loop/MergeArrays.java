package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        // Write a program that can merge 2 arrays of integers
        /*ex:
        arr1={1,2,3,4}
        arr2={5,6}
        output = {1,2,3,4,5,6}
        */

        char[] ch1 = {'A', 'B', 'C'};//3
        char[] ch2 = {'D', 'E', 'F', 'G'};//4

        char[] letters = new char[ch1.length + ch2.length];//7
        int i = 0;

        for (char ch : ch1) {
            letters[i]= ch;
            i++;
        }

        for (char ch : ch2) {
            letters[i]= ch;
            i++;
        }

        System.out.println(Arrays.toString(letters));
    }
}
