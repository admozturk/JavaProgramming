package day28_arrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        System.out.println(list);

       /* int num = 1;
        list.remove(num);*/

        Integer num = 200;
        boolean bl = list.remove(num);

        System.out.println(list);
        System.out.println(bl);

        System.out.println("-----------------------------------------------");

        //CLEAR METHOD;
          // clear(): remove all the elements of the arraylist, size will be 0

        System.out.println(list.size());

        list.clear(); // removes everything
        System.out.println(list);

        System.out.println("-------------------------------------------------");

        // INDEXOF AND LASTINDEXOF METHOD

       // indexOf(Data): returns the first matching element's index number, returns int
       // lastIndexOf(Data): returns the last matching element's index number, returns int

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

       int firstIndex = characters.indexOf('A'); // 0
       int lastIndex = characters.lastIndexOf('A'); // 6

        System.out.println(firstIndex);
        System.out.println(lastIndex);

        System.out.println("---------------------------------------------------------");

        //CONTAINS METHOD;
          // contains(Data): returns true if the element is contained in the arraylist, otherwise returns false

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("---------------------------------------------------------");

        //EQUAL METHOD
          //equals(ArrayList): returns true if two arraylists are equal (same elements in same order), otherwise
        // returns false

        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);

        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2));

        System.out.println("-------------------------------------------------------");

        // isEMPTY METHOD
          // Returns "true" if the list contains no elements. Checks If The Size Is "0"
          // As long as the arrayList contains any elements it returns "false"

        boolean bl1 =list1.isEmpty(); // false because it contains element
        System.out.println(bl1);

        list1.clear();
        boolean bl2 =list1.isEmpty(); // returns true no elements inside
        System.out.println(bl2);

        System.out.println("---------------------------------------------------");

        //


        ArrayList<Integer> numbers = new ArrayList<>();



















    }
}
