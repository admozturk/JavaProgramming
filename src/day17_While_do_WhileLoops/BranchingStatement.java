package day17_While_do_WhileLoops;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.print(i+" ");//A B C D E F
         if (i=='F'){
             break;// exit the loop
         }
        }

        System.out.println();
        System.out.println("-----------------------------------");

        Scanner scan = new Scanner(System.in);

     // Brake statement exiting the loop and switch
      while (true){
          System.out.println("Enter a number");
          int num = scan.nextInt();
          if (num<0){
              break;
          }
      }




    }
}
