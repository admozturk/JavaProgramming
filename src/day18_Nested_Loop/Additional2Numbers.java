package day18_Nested_Loop;

import java.util.Scanner;

public class Additional2Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


     while (true) {
         System.out.println("Enter Your first number");
         int num1 = scan.nextInt();

         System.out.println("Enter your second number");
         int num2 = scan.nextInt();

         System.out.println("Addition: " + (num1 + num2));

         System.out.println("Would you like to continue");
         String a = scan.next().toLowerCase();

         while (!(a.equals("yes") || a.equals("no"))){ // if the answer is invalid
             System.err.println("Invalid entry, Please re-enter ");
             a = scan.next().toLowerCase();
         }

         if (a.equals("no")) {
             System.out.println("see you next time");
             break;// exit the outer loop
         }

     }




    }
}
