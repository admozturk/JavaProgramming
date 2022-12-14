package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_If_Method {
    public static void main(String[] args) {

        // removeIf
          // removeIf(): when we remove under a condition (if the elements we want to remove are unknown)


        ArrayList<Integer> list = new ArrayList<>();
        
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeIf( p ->  p < 5 ); //Lambda Expression very important check it well
        System.out.println(list);


        System.out.println("------------------------------------");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(noEven -> noEven %2==0);
        System.out.println(list2);

        System.out.println("-------------------------------------------");

        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list1.removeIf(p-> p.startsWith("J"));
        System.out.println(list1);
        
        
        
        
    }
}
