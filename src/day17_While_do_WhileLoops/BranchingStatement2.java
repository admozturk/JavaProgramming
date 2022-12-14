package day17_While_do_WhileLoops;

import javax.sound.midi.Soundbank;

public class BranchingStatement2 {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'E'; i++) {
           if (i=='C'){
               break;// exiting the loop and switch
           }
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");

        for (char i = 'A'; i < 'Z'; i++) {
            if (i=='C'){
                continue;// skiping the next one
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------------");
        // print even numbers
        for (int i = 1; i < 11; i++) {
            if (i%2 != 0){
                continue;// skip 1 3 5 7 9 in order to get even numbers I must skip the odd numbers
            }
            System.out.println(i);//2 4 6 8 10
        }

        System.out.println("--------------------------------------");

        for (int i = 1; i < 11; i++) {
            if (i%2==0){
                continue;// skip 1 3 5 7 9 in order to get odd numbers I must skip the even numbers
            }
            System.out.println(i);
        }




    }
}
