package day15_For_Loop;

import java.util.Scanner;

public class SumOfNUmber {
    public static void main(String[] args) {

       int sum = 0;

        for (int i = 1; i < 101 ; i++) {
            sum +=i;
        }
        System.out.println(sum);

        System.out.println();
        System.out.println("-----------------------------------------------");

       /* int total= 0; // If you want to sum up 5 numbers back to back

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        total+=scan.nextInt();

        System.out.println("Enter a number");
        total+=scan.nextInt();

        System.out.println("Enter a number");
        total+=scan.nextInt();

        System.out.println("Enter a number");
        total+=scan.nextInt();

        System.out.println("Enter a number");
        total+=scan.nextInt();*/

        // if you want to get a sum from this 5 number you must always increase each time
        // instead just use for loop

        int total= 0; // If you want to sum up 5 numbers back to back

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            total+=scan.nextInt();
        }


        System.out.print(total);





    }
}
