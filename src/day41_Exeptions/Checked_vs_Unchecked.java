package day41_Exeptions;

import day36_Inheritance.Encapsulation.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_vs_Unchecked {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        // unchecked exceptions

        int a = 10;
        int b = 0;

       // System.out.println(a/b);
      //  System.out.println("wooden spoon");


        char[] characters = {'A','B','C'};
        //                    0   1   2

       // System.out.println(characters[99]);// if you don't handle the exceptions you may not continue your work

        Student student = null;
        System.out.println(student.getName()); // Unchecked  null pointer exception // Instance called through the object name

        System.out.println("----------------------------------------------------------------------------------------");

        // Checked Exceptions

        System.out.println("Hello");
      //  Thread.sleep(3000); // this kind of exceptions must be checked in order to run your codes if not
                              // you may not even press the run button


      //  FileInputStream file = new FileInputStream("Path of the file");// this checked exception compiler can tell you
                                                              // what exception it is you can handle it through the class


        System.out.println("java".charAt(2000));// This unchecked compiler can not tell you what exception is it
                                               // it requires to analyse it what an where is the problem

        System.out.println("----------------------------------------------------------------------------------------");







    }
}
