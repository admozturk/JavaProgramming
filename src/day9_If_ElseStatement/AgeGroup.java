package day9_If_ElseStatement;

public class AgeGroup {
    public static void main(String[] args) {

        byte person = 58;

        if (person >= 1 && person<= 2){
            System.out.println("Infant");
        }
        else if (person >= 3 && person<= 5 ) {
            System.out.println("Toddler");
        }else if (person >= 6 && person<= 9 ) {
            System.out.println("Kid");
        }else if (person >= 10 && person<= 12 ) {
            System.out.println("Pre-teen");
        }else if (person >= 13 && person<= 17 ) {
            System.out.println("Teenager");
        }else if (person >= 18 && person<= 20 ) {
            System.out.println("Young adult");
        }else if (person >= 21 && person<= 39 ) {
            System.out.println("Adult");
        }else if (person >= 40 && person<= 49 ) {
            System.out.println("young-Middle Aged Adult");
        }else if (person >= 50 && person<= 54 ) {
            System.out.println("Middle Aged Adult");
        }else if (person >= 55 && person<= 64 ) {
            System.out.println("Very Young senior Citizen");
        }else if (person >= 65 && person<= 74 ) {
            System.out.println("Young senior Citizen");
        }else if (person >= 75 && person<= 84 ) {
            System.out.println("Senior Citizen");
        }else if (person >= 85) {
            System.out.println("Old senior Citizen");
        }else System.out.println("Ol Artik Bu kadar Yasadigin Yeter");


    }
}
/*

Create a class called AgeGroups, and write a program that can define
the age groups of a person
age groups are:
infant (1 - 2)
Toddler (3 - 5),
Kid (6 - 9),
Pre-Teen (10 - 12),
Teenager (13 - 17),
Young Adult (18 - 20),
Adult (21 - 39),
Young Middle-Aged Adult
(40 - 49),
Middle-Aged Adult (50 -
54),
Very Young Senior Citizen
(55 - 64),
Young Senior Citizen (65
- 74),
Senior Citizen (75 - 84),
Old Senior Citizen (85+)
 */