package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods3_BulkOperations {
    public static void main(String[] args) {

        //addALL METHOD;
           // addAll(CollectionType): adds collection of values to the arrayList

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);

        System.out.println("-----------------------------------------------------");

        // removeAll METHOD
           // removeAll(CollectionType): removes all the matching elements from the arraylist

        ArrayList<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,3,4,4,5,5,5,5,9,9,9));

        System.out.println(list1);
        list1.removeAll(Arrays.asList(3,4,5,9));
        System.out.println(list1);

        System.out.println("---------------------------------------------------------");

        //retainAll METHOD;
           // it is opposite of removeAll Method
          // retainAll(CollectionType): removes all the non-matching elements from the arraylist

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        list3.retainAll(Arrays.asList(100,200,300));
        System.out.println(list3);


        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        System.out.println("-----------------------------------------------------------------");

        // containsAll METHOD;
           //containsAll(CollectionType): checks if all the elements are contained in the arraylist

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(1,3,6,8,10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("----------------------------------------------------------");

        //  Arrays:
        //	asList(array of values) ===> returns the array as collectionType

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println("namesList = " + namesList);

        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );
        */

        System.out.println(namesList);

        System.out.println("------------------------------------------------------");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(arr));

        System.out.println(list2);

        System.out.println("-------------------------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list4 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list4 = " + list4);

    }

    public static ArrayList<Integer> convertArrayToArrayList (int [] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);

        }
        return list;
    }
}
