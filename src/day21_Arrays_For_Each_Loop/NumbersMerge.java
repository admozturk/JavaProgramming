package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class NumbersMerge {
    public static void main(String[] args) {
        // Write a program that can merge 2 arrays of integers
        /*ex:
        arr1={1,2,3,4}
        arr2={5,6}
        output = {1,2,3,4,5,6}
        */

      int [] num1 = {1,2,3,4};//4
      int [] num2 = {1,2,3,4,5,6,7,8,9,10};//6

      int [] merge = new int[num1.length+ num2.length];//10

      int i = 0; // to find index of each element

        for (int each : num1) {//1,2,3,4
            merge[i]=each;
            i++;
        }
        for (int each : num2) {//1,2,3,4,5,6,7,8,9,10
            merge[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(merge));
    }
}
