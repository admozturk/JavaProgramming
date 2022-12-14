package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique_Character {
    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

        String[] arr = str.split("");// conversion of string to the array list

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr)); // conversion of string to the array list
        System.out.println("list = " + list);

        String unique = "";// to store the each unique elements
        for (String each : list) {
           int frequency = Collections.frequency(list,each);
           if (frequency == 1){
               unique+=each+" ";
           }

        }

        System.out.println("unique = " + unique);


    }
}
