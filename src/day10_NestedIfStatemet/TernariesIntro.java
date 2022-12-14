package day10_NestedIfStatemet;

public class TernariesIntro {
    public static void main(String[] args) {

        // SHORTCUT OF IF STATEMENT
        // FOR IF: " ? " FOR ELSE IF " :()? " FOR ELSE " : " MUST BE ALL VARIABLES THE SAME
        // IF ALL DATA TYPES ARE STRING OK IF ONE INT AND THE OTHER STRING WE CAN'T APPLY TERNARY


        // find the number below if it is even or odd number
        int n = 100;
        if (n%2==0){
            System.out.println("even");
        }else
            System.out.println("odd");

        System.out.println("------------------------------------------");


        String result1 = (n%2==0)? "even" : "odd";
        System.out.println(result1);


        System.out.println("======================================================");

        int number = 100;

        /*
        if(number>0){
            System.out.println("Positive");
        }else if(number <0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
          */
        String result3 = (number > 0 )? "Positive" :(number < 0)? "Negative" : "Zero";

        System.out.println(result3);


    }
}
