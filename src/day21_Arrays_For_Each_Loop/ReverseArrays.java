package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {

        // reverse all the numbers output is: 70,60,50,40,30......

        int [] numbers = {10,20,30,40};
//              index =    0  1  2  3
        int[] reversed = new int[numbers.length];

       /* reversed[0]=numbers[3];
        reversed[1]=numbers[2];
        reversed[2]=numbers[1];
        reversed[3]=numbers[0];*/

        //System.out.println(Arrays.toString(reversed));// to make sure that the array has enough capacity to contain
                                                      // all the elements of first array

        for (int i = numbers.length - 1, j = 0; i >= 0; i--,j++) {
            reversed[j]=numbers[i];
            
        }

        System.out.println(Arrays.toString(reversed));
    }
}
