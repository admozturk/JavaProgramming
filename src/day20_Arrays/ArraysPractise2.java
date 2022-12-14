package day20_Arrays;

import java.util.Arrays;

public class ArraysPractise2 {
    public static void main(String[] args) {
        //
        char[]letters = new char[26];


        for (int i = 0,j ='A'; i < letters.length; i++, j++) { // i is the index number from 0~last index
            letters[i]=(char)j;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("----------------------------------------------");
       // Second Way
        char ch = 'A';
        for (int i = 0; i < letters.length; i++,ch++) {
            letters[i]=ch;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("-----------------------------------------");

        char[]letter = new char[26];

        char ch1 = 'z';

        for (int i =0; i<letter.length; i++,ch1--){
            letter[i]=ch1;
        }

        System.out.println(Arrays.toString(letter));

    }
}
