package day28_arrayList;

import java.util.ArrayList;

public class ArraysList_Intro {
    public static void main(String[] args) {

       /* Data Structure:
        Array: size is fixed, supports both primitives & non primitives
        Collection: size is dynamic, does not support primitives



        ArrayList: part of the collection. internally uses the array
        Allows us to store OBJECTS
        Presented in "Java.util" Class
        Size is automatically adjusted (we can add and remove any elements)
        doesn't support Primitives. instead we use wrapper classes

        IMPORT STATEMENT IS;
        Import java.util.ArrayList;

        Creating ArrayList;

        ArrayList<DataType> name = new ArrayList <dataType>();
*/

        ArrayList <Integer> numbers = new ArrayList<Integer>();
//               Obligatory                         Optional(not necessary to use it represents the first one)


        ArrayList <String> names = new ArrayList<>();

        System.out.println(numbers);
        System.out.println(names);


    }
}
