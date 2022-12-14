package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class Task1_Reverse_Sentence {
    public static void main(String[] args) {

        String str = "Today is a good day to learn Java";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        String reversed = "";// we create this at the end we will store the reversed order
        // in order to reverse the sentence we must iterate from the last word to the first
        // it that case which loop should we use?  For each loop the iteration order is fixed. if iteration started from
        // begining to end we can't change it. Therefor we should use for loop

        for (int i = words.length - 1; i >= 0; i--) { // start from the last index to index 0
            reversed += words[i] + " "; // by using the concatination we can store each revesed words to the String reversed
        }
        System.out.println(reversed);


    }
}
/*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";
			output:
				Java learn to day good a is Today
 */