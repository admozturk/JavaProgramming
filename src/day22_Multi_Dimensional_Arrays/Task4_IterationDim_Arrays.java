package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class Task4_IterationDim_Arrays {
    public static void main(String[] args) {
        /* 13,12,11,10,9
            8,7,6,5,4
            3,2,1
                    */

        int[][] arr2D = {{1, 2, 3,}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13,}};

        for (int[] each1DArray : arr2D) {// index for each multiDim. Arrays
            for (int eachElements: each1DArray) {// index for each single arrays elements
                System.out.print(eachElements+" ");
            }

            System.out.println();
        }
        
      
    }
}
