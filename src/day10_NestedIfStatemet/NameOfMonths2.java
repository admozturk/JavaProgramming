package day10_NestedIfStatemet;

public class NameOfMonths2 {
    public static void main(String[] args) {
        int number = 11;
        String result = "" ; // temporary

        if(number>= 1 && number <= 12){ //if the number is valid (1~12)

            if(number == 1){
                result = "January";
            }else if(number == 2){
                result = "February";
            }else if(number == 3){
                result ="March";
            }else if(number == 4){
                result ="April";
            }else if(number == 5){
                result ="May";
            }else if(number == 6){
                result ="June";
            }else if(number == 7){
                result ="July";
            }else if(number == 8){
                result ="August";
            }else if(number == 9){
                result ="September";
            }else if(number == 10){
                result ="October";
            }else if(number == 11){
                result ="November";
            }else{
                result = "December";
            }

        }else{ //if the number is not valid
            result = "Invalid Number";

            System.out.println("--------------------------------------------------------");

        }
        String result1 =(number == 1)? "january" :(number == 2)? "february" :(number == 3)? "march" :(number == 4)? "april"
                :(number == 5)? "may" :(number == 6)? "june" :(number == 7)? "july" :(number == 8)? "august"
                :(number == 9)? "september" :(number == 10)? "october" :(number == 11)? "november" :(number == 12)? "december"
                : "invalid number";
        System.out.println(result1);


        System.out.println("----------------------------------");

        // using parenthesis is not necessary to use in ternaries
        // but, it is strongly recommended to use



    }
}