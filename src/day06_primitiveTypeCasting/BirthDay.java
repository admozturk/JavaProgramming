package day06_primitiveTypeCasting;

public class BirthDay {
    public static void main(String[] args) {
        String name = "john";
        int birthday = 25;
        String birthMonth = "April";
        int birthYear = 1995;

        //System.out.println(name +" was born on " + birthMonth + "/" + birthday + "/"+birthYear +".");
        String johnsBirthday = (name +" was born on " + birthMonth + "/" + birthday + "/"+birthYear +".");
        System.out.println(johnsBirthday);

        System.out.println("-------------------------------------------------------");

        //My favorite book is "book name"
        String bookName = "The Rich dad and the Poor Dad";
        System.out.println("my favorite book is\""+ bookName +"\"");

        /*
        \n new line
        \t horizontal Tab also paragraph space
        \\ backslash
        \" double quote
        \' single quote


         */


    }
}
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)
			 use concatenation to display the birthday of the person
			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;
			 	output:
			 		John was born on April/25/1995.
 */