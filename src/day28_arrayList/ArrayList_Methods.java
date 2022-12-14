package day28_arrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        // ADD METHOD

        ArrayList<Integer> numbers = new ArrayList<>(); // this is an arraylist object

        //add(Data): adds the data after the last index of the ArrayList
          // add(index, Data): inserts the data at the given index

        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4
        numbers.add(60); // 5

        numbers.add(2,25); // It will insert the new element in index 2 index 2 will be shifted to index 3
        numbers.add(5,45); // it is just inserting the given index and the index which is exist before will
                                         // continue with index 6
        System.out.println(numbers);

        // SIZE METHOD;
         // Counts how many elements that we have in the ArrayList
        // Size; returns the total numbers of elements

        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1; // This is how to find the last index
        System.out.println("last Index = " + lastIndex);

        System.out.println("-------------------------------------------------------");

        // GET METHOD;
         //get (index); Returns the element at the given index

        int num = numbers.get(3); // we used wrapper class
        System.out.println("num= "+num);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------------------------");

        //SET METHOD;
           // set(index, new element) Replaces the element at the given index with the new elements

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"java Script");
        list.set(3,"C##");
        System.out.println(list);

        System.out.println("--------------------------------------------------------");

        // REMOVE METHOD;
          // Everytime we call it is going to decrease the size of arraylist by 1
         //  remove(int index): removes the element at the given index
        //  remove(Object): removes the given object from arraylist, returns boolean

        ArrayList<String> employees = new ArrayList<>();

        employees.add("suat");
        employees.add("aygun");
        employees.add("olga");
        employees.add("neira");
        employees.add("ali");
        employees.add("hulya");
        employees.add("kalayon");

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);

        //Remove by object

        boolean r1 = employees.remove("hulya");
        System.out.println(r1);

        boolean r2 = employees.remove("ali");
        System.out.println(r2);







    }
}
