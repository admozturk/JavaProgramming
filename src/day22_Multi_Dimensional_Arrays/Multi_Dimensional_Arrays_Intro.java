package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Intro {
    public static void main(String[] args) {
        // Multidimensional Arrays depends on the brackets it has two brackets [] []
        //An array of Arrays
        // differences between single and multidimensional arrays is:
        // Both of them are the containers
        // Single dimensional arrays is for elements whenever you have multiple data's that you need to store.
        //for example if you have 10 int or 5 different strings that you are looking to store in to a variable then you
        // can use single dimensional arrays. Example ; int [] array = {10,20,30,40,50,60}

        //In multidimensional Arrays we only use it whenever we try to store multiple arrays not multiple elements
        // multiple arrays. variable allows you to store multiple arrays
        //The N dimensional array is a container of (N-1) dimensional arrays

        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Aaron", "shy", "Breanna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};

        // Declaring the arrays that you don't know
        String[][] groups = new String[3][]; // index of arrays: 0,1,2.// this is how you can declare multidimensional array
        groups[0] = group1;                   // if you don't know the exact array you already know how many array there will be
        groups[1] = group2;                   // but you don't know how many exact array
        groups[2] = group3;


        //System.out.println(Arrays.toString(groups));// toString() is for one dimensional arrays
        System.out.println(Arrays.deepToString(groups));

        System.out.println("-----------------------------------------------");

        // Declaring the Arrays you already know
        // index of every single arrays 0  1  2     0  1  2  3    0  1   2  3   4 //  2nd brackets represent the index of elements
                    int[][] array2D = {{1, 2, 3,}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
                           //  index=        0            1            2         // 1 st brackets represents the index of arrays
        System.out.println(Arrays.deepToString(array2D));

        // how to get the first array
        System.out.println(Arrays.toString(array2D[1]));

        //how to get elements from a single array
        System.out.println(array2D[2] [3]);

        // in order to get elements in a single Array we need to use 2 loops one will get the single array other will
        // get the elements




    }
}
/*
String[] group1 = {"Jon", "Joes", "James"}
String[] group2 = {"Aaron", "shy", "Breanna"}
String[] group3 = {"Cassandra", "Tahir", "Aygun"}
 */