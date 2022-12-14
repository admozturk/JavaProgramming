package day10_NestedIfStatemet;

import java.sql.SQLOutput;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score1 = 95;
        if (score1 > 60) {
            System.out.println("passed");
        } else {
            System.out.println("Failed");
        }

        System.out.println("--------------------------------------");


        int score = 400;

        if (score >= 0 && score <= 100) { // if score is valid

            if (score >= 60) { // if student passed the exam
                System.out.println("Passed");
            } else { // if the student failed exam
                System.out.println("Failed");
            }

        } else { //if the score is not valid

            System.out.println("Invalid score");
        }

        System.out.println("----------------------------------------");
        int age = 25;
        boolean hasId = true;

        if (hasId) {// if the person has iD
            if (age >= 21) { // if the person is 21 or older
                System.out.println("Eligible to buy alcohol");
            } else // if the person is smaller then 21
                System.out.println("Not Eligible to buy alcohol");
        } else {
            System.out.println("if the person doesn't have ID");
        }

        System.out.println("---------------------------------------");
        int number = 3;

        if (number >= 1 && number <= 7) {
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        }else { // if the number is not valid
            System.out.println("Invalid Number");
        }

    }
}






