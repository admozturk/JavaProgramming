package day20_Arrays;

import java.util.Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        //Data structure:We use data stractures for containing 1 container for all others
        // to use the data efficiently store date in organized manner

        // Arrays are regular variables
        // it allows you to store multiple data at ones, holds multiple values of same data type 10 strings 20 integers etc...
        // the size is fixed you will not be able to increase or decrease later it is unchangeable
        // Arrays supports primitives and non primitives
        // Each element's in Arrays has index numbers

        //there are to ways of declaring arrays
        // String [] myGroups; brackets in between data type and variable
        //String myGroups[];just after the variable but,before the semicolon

        // initializing Arrays=
        //if we don't know the exact data
//        DataType [] variableName = new data type[length]

        // if we don't know the exact data
        // DataType [] variableName = {data1,data2,.....}


         /*default values
                non primitives: null
                primitives: byte, short, int, long: 0
                float,double: 0.0
                boolean:false*/


        // create a variable that's capable enough to contain at the same time

        //String myGroup[];
        String[] myGroup = new String[5];//[null, null, null, null, null]
        System.out.println(Arrays.toString(myGroup)); //class name; Arrays package: java.util
        myGroup[0] = "Adem";
        myGroup[1] = "Meyro";   // size of arrays is fixed to 5 no more we can give
        myGroup[2] = "Hacer";   // Also the value is unchangeable
        myGroup[3] = "Ercan";
        myGroup[4] = "guldem";

        int[] myGroups = new int[7];//[0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(myGroups));

        System.out.println("----------------------------------------");

        String[] days = {"Monday", "Tuesday", "wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index    0         1          2            3         4         5          6
        System.out.println(Arrays.toString(days));

        int number = 7;
        if (number < 1 || number > 7) {
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[number - 1]);

        System.out.println("-------------------------------------------");

        String[] months = {"January", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        System.out.println(Arrays.toString(months));
        int num = 11;
        if (num < 1 || num > 12) {
            System.out.println("invalid entry");
            System.exit(0);
        }
        System.out.println(months[num - 1]);


    }
}
