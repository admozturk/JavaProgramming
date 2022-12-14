package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        //age: 38 years
        byte x= 38;
        // weight: 160 pounds
        /*byte weight = 160; If I use this like in the code it will give error
        because it is out of the byte's range */

        short weight = 160;  // It will accept it because it's in the short's range

        //salary: 100000$
        //short salary = 100000; this number is out of short's range

        int salary = 100000; // int is preferred data type for integer numbers

        long asset = 3_333_333_333L; /*everytime we use the long data we must add 'l' letter for
        making the compiler to recognize it as a long data type if we don't add 'l' the compiler
        will recognize it as an 'int' data type*/

        //tax: 0.26
        float tax= 0.26f; /*everytime we use decimal numbers with float we must add 'f' letter
        at the end of the given value if not it will recognize it as a double data type*/

        double taxes= 1.223; //this time no problem when we use decimal numbers we use mostly double


    }
}
