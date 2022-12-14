package day10_NestedIfStatemet;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 2;
        String location = "";
        int groupNumber = 0;
        String teacher = "";


        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple Orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "zoo";
                groupNumber = 7;
                teacher = "Ms. wilson";
            } else if (grade == 3) {
                location = "aquarium";
                groupNumber = 3;
                teacher = "Ms. Smith";
            } else if (grade == 4) {
                location = "movie theather";
                groupNumber = 2;
                teacher = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Sport center";
                groupNumber = 11;
                teacher = "Ms. Belly";
            } else {
                location = "Swimming pool";
                groupNumber = 6;
                teacher = "Ms. Josh";
            }
        } else {
            System.out.println("invalid grade");
        }

        System.out.println("grade = " + grade + "\nlocation is " +location + "\nGroup number is"+groupNumber+
                "\nThe teacher name is " +teacher);

    }
}
