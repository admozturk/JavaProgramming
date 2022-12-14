package day8_LogicalOperators_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

        System.out.println(true == !false);//true
        System.out.println(!true !=false);//

        int score = 85;

        boolean a = score>=90 && score<=100; //false (85 is not greater than 90, but it is less than 100)
        boolean b = score >=80 && score<=89; // true
        //boolean b= score >=80 && !a; if score is A, but score is grater than 80
        boolean c = score >= 70 && score <= 79; //false
        //boolean c= !a && !b && score >= 70 &&
        boolean d = score >= 60 && score <= 69; //false
        boolean e = score >= 0 && score <= 59; //false
        // boolean e = !a && !b && !c && !d;

        if(a) {//if the student made a condition
            System.out.println("Excellent");
        }
        if(b){// if the student made b condition
            System.out.println("Great");
        }
        if(c){ // if the student made c condition
            System.out.println("Good");
        }
        if(d){ // if the student made d condition
            System.out.println("passed");
        }
        if(e){ // if the student made e condition
            System.out.println("Failed");
        }





    }
}
/*
90~ 100 ==> excellent
80~ 89 ==> great
70~ 79 ==> good
60 ~69 ==> passed
0~ 59 ==> failed
 */