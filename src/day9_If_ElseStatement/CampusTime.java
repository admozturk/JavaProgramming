package day9_If_ElseStatement;

public class CampusTime {
    public static void main(String[] args) {
        int time = 24;

        if (time >= 8 && time <= 23) {
            System.out.println("the campus is open");
        } else System.out.println("closed");


        System.out.println("---------------------------");
        int num = 13;

        String result = "";

        if (num >= 8 && num <= 23) {
            result = "open";
        } else System.out.println("closed");

        System.out.println("result = " + result);


    }
}
/*
Create a class called CampusTime, an integer variable named time is
given with a number between 1~24 has been initialized, write a program
that can find out if the campus is open or not. Campus is open from 8
am(8) to 11 pm (23) If user enters a time within the open time they
should see message: “open” but if the time entered is outside of
operating hours they should see: “ closed ”

 */