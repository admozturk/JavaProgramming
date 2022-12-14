package day18_Nested_Loop;

import java.util.Scanner;

public class NestedLoopsPractise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      while (true){
        System.out.println("Enter a number");
        int number = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            if (number % 2 == 0) {
                System.out.println("is even number");
            } else {
                System.out.println("is odd number");
            }
            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();


            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("please re enter, would you like to enter another number?");
                a = scan.next().toLowerCase();
            }
            System.out.println();
                if (a.equals("no")) ;
                {
                    break;
                }


            }


        }








    }
}
