package day8_LogicalOperators_IfStatements;

public class NameOfTheDays {
    public static void main(String[] args) {

        int day = 3;

        boolean monday = day == 1;
        boolean Tuesday= day == 2;
        boolean wednesday= day == 3;
        boolean Thursday= day == 4;
        boolean friday= day == 5;
        boolean saturday = day ==6;
        boolean sunday = day == 7;

        if (monday){
            System.out.println(day);
        }
        if (Tuesday){
            System.out.println(day);
        }
        if (wednesday){
            System.out.println(day);
        }
        if (Thursday){
            System.out.println(day);
        }
        if (friday){
            System.out.println(day);
        }
        if (saturday){
            System.out.println(day);
        }
        if (sunday){
            System.out.println(day);
        }

        System.out.println("-------------------------------------------------");

        int Day = 5;

        if (Day == 1){
            System.out.println(Day + "st day of the week is Monday.");
        }
        if (Day == 2){
            System.out.println(Day + "nd day of the week is Tuesday.");
        }
        if (Day == 3){
            System.out.println(Day + "rd day of the week is Wednesday.");
        }
        if (Day == 4){
            System.out.println(Day + "th day of the week is Thursday.");
        }
        if (Day == 5){
            System.out.println(Day + "th day of the week is Friday.");
        }
        if (Day == 6){
            System.out.println(Day + "th day of the week is Saturday.");
        }
        if (Day == 7){
            System.out.println(Day + "th day of the week is Sunday.");
        }


    }

}
/*
Write a program that can display the name of the days
  hint: 1~7
 */