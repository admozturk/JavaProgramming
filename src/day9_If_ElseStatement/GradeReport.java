package day9_If_ElseStatement;

public class GradeReport {
    public static void main(String[] args) {

        // report the grades from A, B,C,D,E

        int score = 90;
        String grade;

        if (score>=90){
            grade = "A";
        } else if (score>=80) {
            grade = "B";
        }else if (score>=70) {
            grade = "C";
        }else if (score>=60) {
            grade = "D";
        }else grade = "E";

        System.out.println("grade is " + grade);

        System.out.println("------------------------------------");

        // SECOND WAY

        if (score > 90){
            System.out.println("A");
        }else if (score > 80){
            System.out.println("B");
        }else if (score > 70){
            System.out.println("C");
        }else if (score > 60){
            System.out.println("D");
        }else
            System.out.println("E");

    }
}
