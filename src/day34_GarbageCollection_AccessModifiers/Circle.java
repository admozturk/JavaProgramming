package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi; // 3.14
    public static String name = "Circle";

    public static ArrayList<Integer> numbers;

    public Circle (double radius){
        this.radius = radius;
        pi = 3.14;   // initialising the static to constructor is not recommended because constructors
                    // only best with instance variables and Static runs only one time
    }

    static {
        // radius
        pi=3.14;
        name= "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }


}
