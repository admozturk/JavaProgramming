package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class Equal_Method {
    public static void main(String[] args) {
     //  equal method: equal(array1,array2) checks if to arrays are equal, returns boolean
        // Anagram
        // 2 different words but very close each other
        // heart==>earth     listen==>silent


        char [] ch1 ={'a','c','b'};
        char [] ch2 ={'b','a','c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean bl=Arrays.equals(ch1,ch2);
        System.out.println(bl);

        System.out.println("------------------------------------------");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean bln = Arrays.equals(arr1, arr2);// false// not equal
        System.out.println(bln);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean bl1 = Arrays.equals(arr1, arr2);//true // After sorting equal
        System.out.println(bl1);

        System.out.println();











    }
}
