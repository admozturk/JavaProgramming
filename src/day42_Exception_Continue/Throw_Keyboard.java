package day42_Exception_Continue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_Keyboard {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        /*if (age < 0){
            System.err.println("Invalid age"+age);
            System.exit(0);
        }*/
        // instead of doing the mission above
        if (age < 0 ){
            throw new InputMismatchException("Age cannot be less than 0"+age);
        }
        if (age > 21){
            System.out.println("You are eligible");
        }else {
            throw new RuntimeException("You must be at least 21 years old");
        }



    }
}
