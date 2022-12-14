package day12_Scanner;

import java.util.Scanner;

public class ScanPractise_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your full name");
        String name = input.nextLine();

        System.out.println("Enter your programming language");
        String programming = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your school name");
        String school = input.nextLine();

        input.nextLine();

        System.out.println("my name= "+name);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("school"+ school);

        input.close();

    }
}
