package day27_WrapperClasses;

import com.sun.jdi.IntegerValue;

public class WrapperClasses_Intro {
    public static void main(String[] args) {

        //The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
        // Wrapper class names Always starts with Uppercase
        // PPrimitive Type	         Wrapper class
        //  boolean	                  Boolean
        //  char	                  Character
        //  byte	                  Byte
        //  short  	                  Short
        //  int	                      Integer
        //  long                   	  Long
        //  float	                  Float
        //  double	                  Double

        int num1 = 200; // int to Integer

        Integer n1 = num1; // whenever you convert primitive to object we call==> Autoboxing

        int num2 = n1; // whenever you convert objects to primitives we call==> unboxing

        // Autoboxing & unboxing

        byte b = 10;

        Byte byteObject = b;  // Autoboxing primitive to object
        byte bytevalue = byteObject;   //unboxing object to primitive(data Type)

        short s = 20;

        Short shortObject = s;
        short shortValue = shortObject;

        long l = 2345;

        Long longObject = l;
        long longValue = longObject;

        char c = 'a';

        Character charObject = c;
        char charValue = charObject;

        boolean bl = true;

        Boolean booleanObject = bl;
        boolean booleanValue = booleanObject;

        System.out.println("Byte Object= "+byteObject);
        System.out.println("Short Object= "+shortObject);
        System.out.println("long Object = " + longObject);
        System.out.println("CharvObject = " + charObject);
        System.out.println("boolean Object = " + booleanObject);

        System.out.println("-----------------------------------");
        System.out.println("byte value = " + bytevalue);
        System.out.println("short Value = " + shortValue);
        System.out.println("longValue = " + longValue);
        System.out.println("char Value = " + charValue);
        System.out.println("boolean Value = " + booleanValue);

        System.out.println("--------------------------------------");

        Integer integerValue = 100;
        long longValue1 = integerValue; // As long as in it is within the range we can change any primitives
        Byte b1 = 25;
        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("-------------------------------------------------------------");

        int num3 = 400;
       // Long l2 = num3; // it will never allow you can only do it by the same datatype as itself (int to int byte to byte)
        Integer num4 = num3;// autoboxing


        System.out.println("------------------------------------");

        Integer z = 900;
        Integer y =z;

        System.out.println("---------------------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};


    }

}
