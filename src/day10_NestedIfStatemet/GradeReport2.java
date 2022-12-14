package day10_NestedIfStatemet;

public class GradeReport2 {

    public static void main(String[] args) {
         /*
       90~100 excellent
       80`89 great
       70~79 good
       60~69 passed
       0~50 Failed
         */

        int score = 105;
/*
        if (score>= 0 && score <= 100) { // if the score is valid
            // 5 possibilities A,B,C,D,E
            if (score >=90){
                System.out.println("excellent");
            } else if (score >=80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score>=60) {
                System.out.println("Passed");
            }else System.out.println("Failed");


        }else{ // if the score is not valid
            System.out.println("Invalid score");

        }*/


        String result = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "good"
                : (score >= 60) ? "Passed" : "Failed" : "invalid score";

        System.out.println(result);
    }
}
