package day25_CustomMethod_OverLoading;

import utilities.String_Utility;

public class Test {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        String_Utility.printEachChar(str);

        System.out.println("---------------------------------------");


        String s1 = "Wooden Spoon";
        String reverse = String_Utility.reverse(s1);
        System.out.println(reverse);

        System.out.println("--------------------------------------");


        String word = "Civi";
        boolean palindrome = String_Utility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("--------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String each : names) {
            if (String_Utility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println("count = " + count);


        System.out.println("-----------------------------------------");

        String nonDuplicated= "aaaaaaabbbbbbbbccccccccccddddddd";
        String nondublicate = String_Utility.removeDublicates(nonDuplicated);
        System.out.println("nondublicate = " + nondublicate);






    }

}
