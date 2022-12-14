package day07_Operators;

import jdk.swing.interop.SwingInterOpUtils;

public class RelationalOperators {
    public static void main(String[] args) {
         // >, >=   <, <=

        // greater than = (>)

        boolean result1 = 20>40; //false
        boolean result2 = 300>200; // true

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        System.out.println("--------------------------");

        //Greater than or equal (>=)

        boolean result3 = 300>=150;
        System.out.println("result3 = " + result3);

        boolean result4 = 100>=100;// greater-than or equal
        System.out.println("result4 = " + result4);

        boolean result5 = 200>=500;
        System.out.println("result5 = " + result5); // if the first number isn't greater than the second one the result
                                                    // will be false
        // credit score of 720

        int creditScore = 745;
        boolean isEligibleForLoan= creditScore>=720;// if the credit score is 720 or greater
                                                    // then it's eligible for the loan

        System.out.println("---------------------------------------------------------------");

        //LESS THAN (<)

        boolean result6= 100<200; // true
        System.out.println("result6 = " + result6);

        boolean result7 = 200<100;  // false

        System.out.println("result7 = " + result7);

        // LESS THAN OR EQUAL (<=) if the first number less than or equal

        int score = 59;
        boolean hasFailed = score<=59;
        System.out.println("hasFailed = " + hasFailed); // 59 is equal to 59

        score= 75;
        boolean hasFailed1= score<=59;
        System.out.println("hasFailed1 = " + hasFailed1);

        //*** This 4 operators above we can only apply for numerical primitives when we compare the numbers

        System.out.println("--------------------------------------------------------");

        // EQUAL OPERATOR (==)

        int x = 100;
        int y = 200;

        boolean equal = x==y; // false

        System.out.println("equal = "+ equal);

        boolean result8 = "muhtar" == "good gy";
        System.out.println("result8 = " + result8);

        boolean result9 = "a" == "A";
        System.out.println("result9 = " + result9);

        boolean result10 = "Adem" == "Adem";
        System.out.println("result10 = " + result10);

        //*** if two values are completely same and same types we say they are equal
        System.out.println("-----------------------------------------------------");

        // NOT EQUAL (!=) If two values are not equal to each other

        boolean result11 = 100!=200; // it;s true because 100 doesn't equal to 200
        System.out.println("result11 = " + result11);

        boolean result12 = "java"!= "break"; //true
        System.out.println("result12 = " + result12);

        boolean result13 = 300!=300; // it's false because they are equal
        System.out.println("result13 ="+ result13);












































    }

}
