package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class ArraysUtility_Intro {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        //System.out.println(nums); // we can not print arrays like this

        System.out.println(Arrays.toString(nums));//println+Arrays.java.util.to string(variable name)
        // we must call explicitly to print arrays

        System.out.println(nums[1]);// 2 // we can print elements of arrays like this
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        // SORT METHOD
        // Sorts the Array in ascending order

        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));// not before the sorting

        System.out.println("min number: " + scores[0]);
        System.out.println("max number: " + scores[scores.length - 1]);

        System.out.println("------------------------------------------");

        String[] names = {"Gunay", "Ahmet", "Zuhal", "Anna", "Maria", "Sinema"};// prints according to ascii table
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("-------------------------------------------");

        String[] words = {"Anna", "ANNA"};// Prioritize the ascii table characters
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));



    }

}
