package day15_For_Loop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int min = 2147483647;
        for (int i = 1; i < 6; i++) {

            System.out.println("Enter a number");
            int num = scan.nextInt(); // 67,23,42,5,-10

            if (num<min){  // whenever I give a new value if the condition is true the new value
                min=num;  // will be the min number
            }

        }

        System.out.println("minumum number is = " + min);


    }
}
