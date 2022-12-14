package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 8;

        switch (number) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break; // exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break; //exits the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Monday");
            default:// only gets executed if none of the case block are matching
                    // it must be at the end we don't need to give break after default
                System.out.println("invalid number");


        }


    }
}
