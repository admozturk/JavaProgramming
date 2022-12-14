package day18_Nested_Loop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // userName:Cydeo
        // passWord : WoodenSpoon

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your Username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            for (int i = 1; i < 4; i++) {
                System.out.println("Incorrect User name");

                System.out.println("Enter your Username");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();

                if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){
                    System.out.println("Your account is locked , Please contact support team");
                    break;
                }



            }
        }







    }


}
