package day8_LogicalOperators_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligibleOrNot = age>= 18 && citizen =="USA";
        System.out.println(name + " is Eligible Or Not = " + isEligibleOrNot);
        System.out.println("--------------------------------------------------");

        String name2 = "josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >=700 && age >= 21 && income >=6000;

        System.out.println(name + " is Eligible for loan = " + isEligible2);


        System.out.println("---------------------------------------");

        String name3 = "shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age>=18 && (gender =='M' || gender == 'F');
        System.out.println(name3 + " is Eligible to register = " + isEligible3);
        System.out.println("------------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println(name + "is Eligible to apply for US Citizenship = " + isEligible4);

        System.out.println("----------------------------------------------------------");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >=3.5 || familyIncome<=60000;
        System.out.println(student + " is eligible for scholarship = " + isEligible5);
        System.out.println("--------------------------------------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------");

        int score = 85;
        boolean passed = score >=60;
        boolean failed = !passed;

        System.out.println("failed = " + passed);
        System.out.println("failed = " + failed);








    }
}
