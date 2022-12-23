package day41_Exeptions;

import day39_Review_Encapsulation_Inheritance.cydeo_Task.Employee;

public class Multi_Catch_Blocks {
    public static void main(String[] args) {

        Employee employee = null;

        try {
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){

            System.out.println("First Catch Block");
            e.printStackTrace();

        }catch (ArithmeticException e){

            System.out.println("Second Catch Block");
            e.printStackTrace();

        }catch (NullPointerException e){

            System.out.println("Third Catch Block");
            e.printStackTrace();

        }catch (RuntimeException e){//Runtime exception is a parent exception it must be placed after all the exceptions
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }

        System.out.println("Tested and completed");


        System.out.println("---------------------------------------------------------------------------------------");


        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }
}
