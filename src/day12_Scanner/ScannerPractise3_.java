package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise3_ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your ful name");
        String name = input.nextLine();


        System.out.println("Enter your GPA");
        double jpe = input.nextDouble();

        input.nextLine();

        System.out.println("enter school name");
        String school = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("jpe = " + jpe);
        System.out.println("school = " + school);

        input.close();
    }
}
