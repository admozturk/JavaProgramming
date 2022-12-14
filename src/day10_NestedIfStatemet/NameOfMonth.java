package day10_NestedIfStatemet;

public class NameOfMonth {
    public static void main(String[] args) {

       int number = 11;

       String result = ""; // temporary value


       if (number >= 1 && number <=12){ // if the number is valid (1~12)
           if(number == 1 ){
               result = "jenuary";
           } else if (number == 2 ) {
             result = "february";
           }else if (number == 3 ) {
               result = "march";
           }else if (number == 4 ) {
               result = "April";
           }else if (number == 5 ) {
               result = "may";
           }else if (number == 6) {
               result = "June";
           }else if (number == 7 ) {
               result = "July";
           }else if (number == 8 ) {
               result = "August";
           }else if (number == 9 ) {
               result = "september";
           }else if (number == 10 ) {
               result = "october";
           }else if (number == 11 ) {
               result = "november";
           }else result = "december";

       }else // if the number is not valid
           System.out.println("Invalid Number");

        System.out.println(result);


    }
}
