package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        // split(value): splits all the elements, return string array
        // "I love learning java programming language".split(" ")==> {"I", "love","learning"...}


        String str = "wooden spoon";
        String[] word = str.split(" ");
        System.out.println(Arrays.toString(word));


        System.out.println("------------------------------------");

        String email = "woodenspoon@gmail.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String[] sentences =s.split("\\. ");

        System.out.println(Arrays.toString(sentences));


    }
}
