package day9_If_ElseStatement;

public class NameOfDay {
    public static void main(String[] args) {
        // Find the name of the days 1~7
        int n = 3;
        if (n == 1) {
            System.out.println("MOnday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else System.out.println("Sunday");


        System.out.println("------------------------------------------");
        // Second way
        int n1 = 4;
        String day;

        if (n1 == 1) {
            day= "Monday";
        }else if (n1 == 2) {
            day = "Tuesday";
        }else if (n1 == 3) {
            day = "Wednesday";
        }else if (n1 == 4) {
            day = "Thursday";
        }else if (n1 == 5) {
            day = "Friday";
        }else if (n1 == 6) {
            day = "Saturday";
        }else {
            day = "Sunday";
        }
        System.out.println("day = " + day);

    }
}
