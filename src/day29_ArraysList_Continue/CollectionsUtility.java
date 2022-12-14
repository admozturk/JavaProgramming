package day29_ArraysList_Continue;

import javax.xml.stream.events.Characters;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        //Sort Method

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("--------------------------------------");

        ArrayList<Character> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList('A','B','C','D','E'));

        System.out.println(list2);

        // reverse method

        Collections.reverse(list2);

        System.out.println(list2);

        System.out.println("------------------------------------------");

        // swap method

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        Collections.swap(list3,4,1);  //changes positions of the elements in arraylist
        System.out.println(list3);


        System.out.println("--------------------------------------------------------");

        // max and min Method

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        int max = Collections.max(list4);
        int min = Collections.min(list4);

        System.out.println("max = " + max);
        System.out.println("min = " + min);


        System.out.println("-----------------------------------------------------");

        // replaceAll method
            // replace all the values that matches att the same time

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list5,10,1000);
        System.out.println("list5 = " + list5);


        System.out.println("------------------------------------------------------------");

        // frequency method;
          // It is going to return to frequency of element from the collection type that you want to pass
         // if you want to know an amount of an element you just pass the which one you want to learn by frequency method
        
       int frequency =  Collections.frequency(list5,1000);
        System.out.println("frequency = " + frequency);

        System.out.println("-------------------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));

        
        int countJava = Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words,"Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
        
        


        







    }
}
