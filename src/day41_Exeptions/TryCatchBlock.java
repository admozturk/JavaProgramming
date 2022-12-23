package day41_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class TryCatchBlock {
    public static void main(String[] args) {

        // HOW TO HANDLE unchecked exception

        System.out.println("Test started");

        try {
            System.out.println(9 / 0);

            System.out.println("Try Block");

        } catch (ArithmeticException e) {

            e.printStackTrace();// Displays the exception better to use for preparing the reports

            System.out.println("Catch block");

            System.out.println("Arithmetic exception was occurred");
        }

        System.out.println("Test completed");


        System.out.println("----------------------------------------------------------------");

        System.out.println("test2 Started");

        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[200]);

            System.out.println("Try Block");

        } catch (RuntimeException e) {

            System.out.println("Catch block");

            System.out.println("Run time Exception was occurred");
            System.out.println(e.getMessage());// Display the message about the exception what is the problem
        }
        System.out.println("Test2 completed");

        System.out.println("-------------------------------------------------------------------------");


        System.out.println("Test 3 started");

         try {
             System.out.println("cydeo".substring(2,0));// unchecked exception "StringIndexOutOfBoundsException"
         }catch (RuntimeException e){
             e.printStackTrace();
         }


        System.out.println("-----------------------------------------------------------------------------");

        // HOW TO HANDLE Checked exception
        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();// BEST TO MENTION AND USE THIS FOR PREPARING A FULL TEST REPORT
        }
        System.out.println("Cydeo");


        System.out.println("------------------------------------------------------------------------------");


        try {
            FileInputStream file = new FileInputStream("Path of the file");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
