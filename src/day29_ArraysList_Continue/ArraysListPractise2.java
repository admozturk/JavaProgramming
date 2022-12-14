package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListPractise2 {
    public static void main(String[] args) {

        // Remove all others Accept given names

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll(Arrays.asList("Ahmed","David"));

        System.out.println(employees);


        System.out.println("-------------------------------------------------------------");

        // remove every single names that starts with "M"

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(p -> p.charAt(0)=='M');// we can use starts with method also
        System.out.println(list);

         // converting Arraylist Back to the array
        names = list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));















    }
}
