package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        // write a program that can check if str1 & str2 are built ou the same character

        String str1 = "acdb";
        char [] ch1 = str1.toCharArray();
        String str2 = "dcba";
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

      /*  System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));*/

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("Anagram: "+anagram);








    }
}
