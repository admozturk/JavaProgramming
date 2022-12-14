package day22_Multi_Dimensional_Arrays;

public class Task3_IterationDim_Arrays {
    public static void main(String[] args) {
     /*
           1 2 3
           4 5 6 7 8
           9 10 11 12 13 14
           */

        int[][] arr2D = {{1, 2, 3,}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14}};

        for (int i = 0; i < arr2D.length; i++) {// index of the first dim. array started from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) {// index of each element starting from last index

                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();

        }


    }
}
