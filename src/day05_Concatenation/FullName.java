package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Adem";
        String lastName = "Ozturk";
        int age = 45;
        String jobTitle = "sted";
        String companyName = "cydeo";
        double salary = 100000.58;




        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is "+ firstName +"  "+ lastName);
        System.out.println("full name of the person is " + fullName);

        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName+" and "+ fullName + "'s salary is " + salary );


    }

}
