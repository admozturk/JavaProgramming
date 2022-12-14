package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class MergeStrings {
    public static void main(String[] args) {

        String [] group1 = {"Ali", "Layan","Aysenur", "Hasan", };//4
        String [] group2 = {"Maria", "Aygun","Suat", "Valery", };//4

        String [] students = new String[group1.length+ group2.length];//8


        int i = 0;// represents  index numbers for assigning to students each elements

        for (String each : group1) {//Ali", "Layan","Aysenur", "Hasan
          students[i++] =each; // post increment pass the increment value then increase it
        }                     // first index is 0 it has to pass the 0 first then increase the value

        for (String each : group2) {//Maria", "Aygun","Suat", "Valery
            students[i++]=each;

        }
        System.out.println(Arrays.toString(students));
    }
}
