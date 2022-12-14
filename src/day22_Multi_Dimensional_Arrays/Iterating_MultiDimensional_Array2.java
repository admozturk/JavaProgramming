package day22_Multi_Dimensional_Arrays;

public class Iterating_MultiDimensional_Array2 {
    public static void main(String[] args) {

        /* 9 10 11 12 13 14
           4 5 6 7 8
           1 2 3
           */

        int [][] arr2D= {{1,2,3,},{4,5,6,7,8},{9,10,11,12,13,14}};

        for (int i = arr2D.length - 1; i >= 0; i--) {// i: is index number 1 dim. Arrays starting from
                                                    // last index 0
            for (int j = 0; j < arr2D[i].length; j++) {// j: is index number of elements starting from 0 last index

                System.out.print(arr2D[i][j]+" ");
            }

            System.out.println();
        }

    }
}
