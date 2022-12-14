package day24_CustomMethods_Return;

public class ReturnMethodPractise_2 {
    public static void main(String[] args) {
        // create a function that can calculate the grades
        grade(60);

        String str = grades(70);

        /*
        check the grade
         if the grade is 'A' =====> exelent
         if the grade is 'B' =====> Great
         ........
         */
        if (str.contains("A")) {
            System.out.println("exelent");
        } else if (str.contains("B")) {
            System.out.println("Great");
        } else if (str.contains("C")) {
            System.out.println("Good");
        } else if (str.contains("D")) {
            System.out.println("Passed");
        } else {
            System.out.println("Try again 1");
        }

    }

    // using void method
    public static void grade(int score) {
        String result = "";
        if (score < 0 || score > 100) {
            result = "invalid";
        } else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";


        }
        System.out.println(result);
    }

    public static String grades(int score) {
        String results = "";
        if (score < 0 || score > 100) {
            results = "invalid";
        } else {
            results = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";


        }

        return results;

    }
}

