package day24_CustomMethods_Return;

public class Return_Statement {
    public static void main(String[] args) {

        nameOfDay(7);

    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay (int number){
        if (number < 1 || number > 7){// if the number is invalid
            System.out.println("Invalid");
           return; // Means that if the condition is true exits nameOfDay method
                  // in void we can use return only for exiting the value
        }
        if (number == 1){
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5 ) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Satuday");
        }else{
            System.out.println("Sunday");
        }
    }

}
