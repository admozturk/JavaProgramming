package day07_Operators;

public class SubtractionAssignment {
    public static void main(String[] args) {
        double availableBalance = 1300.5;
        availableBalance -= 500;

        System.out.println("availableBalance = " + availableBalance); // 1300.5-500

        //withdraw $200 then deposit $400

        availableBalance -= 200;

        System.out.println("availableBalance = " + availableBalance);



        availableBalance += 400;
        System.out.println("availableBalance = " + availableBalance);



    }
}
