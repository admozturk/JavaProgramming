package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        // toCharArray(): returns a char array
        //    "abc".toCharArray()=====>'a','b','c';

        // find the each characters of this string

        String str = "java";

        char[]ch= str.toCharArray();
        System.out.println(Arrays.toString(ch));

        for (char each : ch){
            System.out.println(each);
        }


    }
}
