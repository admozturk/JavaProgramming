package day22_Multi_Dimensional_Arrays;

public class Iterating_MultiDimensional_Array {
    public static void main(String[] args) {
      int [][] arr2D = { {1, 2, 3},{4, 5, 6, 7},{8, 9, 10, 11, 12} };

        // index of every single arrays 0  1  2     0  1  2  3    0  1   2  3   4 //  2nd brackets represent the index of elements
                    int[][] array2D = {{1, 2, 3,}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
                           //  index=        0            1            2         // 1 st brackets represents the index of arrays

        for (int i = 0; i < array2D.length; i++) {// index of the single dimensional arrays

            for (int j = 0; j < array2D[i].length; j++) {// index of elements in all single dimensional arrays
                System.out.print(array2D[i][j]+" ");

            }

        }

    }
}
