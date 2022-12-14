package day8_LogicalOperators_IfStatements;

public class IfStatementsIntro {
    public static void main(String[] args) {

        int number = 300;

        System.out.println("even number");
        System.out.println("odd number");

        boolean evenNumber = number%2 == 0;
        boolean oddNumber = number%2 !=0;

        if (evenNumber){ //even number
            System.out.println(number+" is even number");
        }
        if (!evenNumber){// odd number
            System.out.println(number+ "is odd number");

            }

        System.out.println("----------------------------------------------");

        int n = 200;

        // positive output

        if(n>0){//if n is greater than 0, then it;s positive
            System.out.println(n+ " is pisitive");
        }

        // negative
        if(n<0){ // if n is less than 0 then it's negative
            System.out.println(n+ " is negative");
        }
        // zero
        if(n==0){
            System.out.println(n+ " is zero");
        }




    }

}
