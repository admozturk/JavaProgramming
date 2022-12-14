package day17_While_do_WhileLoops;
import java.util.Scanner;
public class WhileLoopPractise {
    public static void main(String[] args) {

      //username: Cydeo
      //Password:Cydeo123;
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter your username:");
            String u = scan.next();

            System.out.println("Enter your password:");
            String p = scan.next();

            if( u.equals("Cydeo")  && p.equals("Cydeo123") ){ // if credentials are valid

                System.out.println("Logged in");

            }else{ // if credentials are not valid
                int attempts = 3; //3, 2, 1

                while( !(u.equals("Cydeo")  && p.equals("Cydeo123")) &&  attempts > 0 ){ // while the credentials are invalid, and user has attempts to reenter

                    System.out.println("Incorrect username or password, please re-enter");
                    System.out.println("Enter your username:");
                    u = scan.next();

                    System.out.println("Enter your password:");
                    p = scan.next();
                    attempts--;
                }

                if(u.equals("Cydeo")  && p.equals("Cydeo123")){
                    System.out.println("Logged in");
                }else{
                    System.out.println("Your account is locked.");
                }

            }



    }
}
