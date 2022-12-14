package day15_For_Loop;

import java.util.Scanner;

public class ReverseMethod_WithScanner {
    public static void main(String[] args) {

        //Example 1. using a hard-coded string
        System.out.println("Please enter a word or sentence.");

        Scanner in=new Scanner(System.in);

        String str=in.nextLine();

        String reversed= "";

        System.out.println("Original string: "+str);

        for (int i = 0; i < str.length(); i++) {

            char c=str.charAt(i);

            reversed = c+reversed;

        }

        //Display the value of strRev

        System.out.println("Reverse of the string: "+reversed);






    }

}

