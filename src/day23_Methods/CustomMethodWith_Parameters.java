package day23_Methods;

public class CustomMethodWith_Parameters {
    // create a number that can chech if the number is even or odd?
    public static void main(String[] args) {
        evenOrOdd(10);
        ageOfThePerson(1986);
        printNumbers(65,30);
    }

    public static void evenOrOdd(int number){
        if (number%2==0){
            System.out.println(number+": number is even number");
        }else{
            System.out.println(number+": number is odd number");
        }



    }

    // create a function that can display the age of the person

    public static void ageOfThePerson (int birthYear){
        int age = 2022-birthYear;
        System.out.println("Your age is: "+age);

    }

    //Cretae a function that can print all the numbers beetween x and y

    public static void printNumbers (int x, int y){
        if (x<y){
            for (int i = x; i<y ; i++) {
                System.out.println(i);
            }
        } else if (y<x) {
            for (int i = y; i < x; i++) {
                System.out.println(i);

            }

        }else{
            System.out.println("invalid");
        }
    }

}
