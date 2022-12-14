package day15_For_Loop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int max = -23; //a n

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num>max){
                max=num;
            }

        }

        System.out.println("maximum number is = " + max);

    }
}
