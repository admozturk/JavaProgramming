package day13_SringClass;

import java.util.Scanner;
public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter My personel information");
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your gender");
        String gender = scan.next();
        scan.nextLine();
        System.out.println("Enter your ful name");
        String fulName = scan.nextLine();
        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong();
        System.out.println("Enter your zip number");
        int zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your school name");
        String schoolName = scan.nextLine();
        System.out.println("Enter your city name");
        String cityName = scan.nextLine();
        System.out.println("Enter your state name");
        String stateName = scan.next();
        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();
        scan.nextLine();//if we don't have in previous the same next line method it will give error
        System.out.println("Enter your street name");
        String streetName = scan.nextLine();

        System.out.println("ful Name: "+fulName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: \n\t" + buildingNumber+" "+streetName+ "\n\t"+cityName+", "+stateName+" "+zipCode);
        System.out.println("School Name: " + schoolName);





    }
}
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age ( int --> nextInt() )
			2. Enter your gender (String- One word ONLY --> next())  nextLine()
			3. Enter your full name (String- Multiple words --> nextLine())
			4. Enter your phone number (long --> nextLong())
			5. Enter your zip code (int --> nextInt())   nextLine()
			6. Enter your School name (String- Can be Multiple words --> nextLine())
			7. Enter your city name (String- Can be Multiple words--> nextLine() )
			8. Enter your state name (String- One word ONLY --> next())
			9. Enter your building number (int --> nextInt())  nextLine()
			10. Enter your Street name ( nextLine() )
		MAKE SURE USER CAN ENTER ALL THE INPUT
		Display all the inputs that user entered in following order in sperate lines:
			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode
			6. school name
 */