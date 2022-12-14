package day24_CustomMethods_Return;

public class BreakfastTask {
    public static void main(String[] args) {

        initials("Hello", "World");

        System.out.println("----------------------------------------");

        domain("ademozturk@gmail.com");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        // domain (emails[0]);
        // domain (emails[1]);     // Long way instead we can use for each loop
        // domain (emails[2]);
        // domain (emails[3]);
        for (String email : emails) {
            domain(email);
        }

        System.out.println("--------------------------------------");

        nameOftheMonths(4);

        System.out.println("--------------------------------------");

        nameOfDay(3);

        System.out.println("---------------------------------------");

        daysInMonth(12);
    }

    //1. Create a method that can display the initials of the person (Initials (String firstName, String lastName))

    public static void initials(String firstName, String lastName) {
        // first way
       /*firstName= firstName.toUpperCase();
       lastName=lastName.toUpperCase();

      System.out.println(""+firstName.charAt(0)+"."+lastName.charAt(0));*/

        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("initilas: " + initials);


    }

    //2. Create a method that can display the domain of the email

    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain: " + domain);


    }

    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOftheMonths(int number) {

        String name;
        if (number >= 1 && number <= 12) {

            name = (number == 1) ? "jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "jun" : (number == 7) ? "Jully" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Now" : "Dec";

        } else {
            name = "invalid";
        }
        System.out.println("Month :" + name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number) {
        String day = "";
        if (number >= 1 && number <= 7) {
            if (number == 1) {
                day = "Monday";
            }
            if (number == 2) {
                day = "Tuesday";
            }
            if (number == 3) {
                day = "Wednesday";
            }
            if (number == 4) {
                day = "Thursday";
            }
            if (number == 5) {
                day = "Friday";
            }
            if (number == 6) {
                day = "Saturday";
            }
            if (number == 7) {
                day = "Sunday";
            }

        } else {
            day = "invalid";
        }

        System.out.println("Days of the week: " + day);
    }


    //5. Create a method that can print how many days a month has

    public static void daysInMonth(int number) {
        String result = "";
        if (number >=1 && number <=12){// 2 4 6 9 11 : 30 days  //1,3,5,7,8,10,12;  31 days
            switch (number){
                case 2:
                    result= "28 days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result="30 days";
                    break;
                default:
                    result = "31 days";
            }
        }else {
            result= "invalid";
        }

        System.out.println("Days of the months: "+result);
    }

    /*
    6.  age groups are:
     infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
     Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
     Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
     Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
     Senior Citizen (75 - 84),
     Old Senior Citizen (85+)
 */
    public static void ageGroups(int age) {


    }


}
