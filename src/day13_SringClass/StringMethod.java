package day13_SringClass;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String word = "Cydeo";// char methods indeks always start from '0'

        char thirdChar= word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        System.out.println("----------------------------------------------");
        String s1 ="Batch 25 is the best batch.";
        int totalChar=s1.length();
        System.out.println("totalChar = " + totalChar);
        char lastIndex = s1.charAt(s1.length()-1);
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("-------------------------------");
        String str = "wooden spoon";
          str=str.toUpperCase();
        System.out.println("str = " + str);

        System.out.println("---------------------------------------");
        String sentence = "today is a great day to learn java programming language";
        sentence=sentence.toUpperCase();
        System.out.println("sentence = " + sentence);







    }
}
