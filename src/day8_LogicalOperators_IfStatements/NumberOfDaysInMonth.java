package day8_LogicalOperators_IfStatements;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int number = 5;
        boolean has28days = number == 2;
        boolean has30days = number == 4 || number == 6 || number == 9 ||number == 11;
        boolean has31days = !has28days && !has30days;// if the month doesn't have 28 days
                                                     // and doesn't have 3o days
        if(has28days){// if the month has 28 days
            System.out.println("28 Days");
        }
        if(has30days){ // if the month has 30 days
            System.out.println("30 days");
        }
        if(has31days){ // if the month has 31 days
            System.out.println("31 days");
        }

    }
}
/*
write a program that can print number of the days in a month
ex:
number: 1;
output: 31 days

months that have 31 days: 1,3,5,7,8,10,12
months that have 30 days: 4,6,9,11
months that have 28 days: 2

 */