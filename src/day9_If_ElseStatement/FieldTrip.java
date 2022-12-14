package day9_If_ElseStatement;

public class FieldTrip {
    public static void main(String[] args) {

       int gradeNumber = 4;

       String location = "";
       int numberOfGroup = 0;
       String teacherInCharce = "";



       if (gradeNumber==1){
           location = "Apple orchard";
           numberOfGroup = 3;
           teacherInCharce = "Ms. Smith";
       } else if (gradeNumber == 2) {
           location = "zoo";
           numberOfGroup = 7;
           teacherInCharce = "Ms. Lee";
       }else if (gradeNumber == 3) {
           location = "Aquarium";
           numberOfGroup = 5;
           teacherInCharce = "Ms. Wilson";
       }else if (gradeNumber == 4) {
           location = "Movie Theater";
           numberOfGroup = 2;
           teacherInCharce = "Ms. Reyes";
       }else if (gradeNumber == 5) {
           location = "Aquarium";
           numberOfGroup = 5;
           teacherInCharce = "Ms. Wilson";
       }else if (gradeNumber == 6) {
           location = "Aquarium";
           numberOfGroup = 8;
           teacherInCharce = "Mr. Watt";
       }else System.out.println("invalid grade");


        System.out.println("location : " + location +"\nNumber of Group :"+ numberOfGroup + "\nTeacher in Charce :" + teacherInCharce);

       }



    }

/*
Create a class called FieldTrip. Your school goes on a Field trip each
year. The place you go will be based on your grade. Given a variable
gradeNumber (1-6) figure out the details of your field trip. Print the
information at the end.
Data based on grade:
grade - 1
location - Apple orchard
number of groups - 3
teacher in charge - Ms. Smith

grade - 2
location - Zoo
number of groups - 7
teacher in charge - Mr. Lee

grade - 3
location - Aquarium
number of groups - 5
teacher in charge - Ms. Wilson

grade - 4
location - Movie theater
number of groups - 2
teacher in charge - Ms. Reyes

grade - 5
location - Museum
number of groups - 5
teacher in charge - Ms. Lela

grade - 6
location - Six Flags
number of groups - 8
teacher in charge - Mr. Watt
 */