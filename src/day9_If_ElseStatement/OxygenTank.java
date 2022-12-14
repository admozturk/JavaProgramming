package day9_If_ElseStatement;

public class OxygenTank {
    public static void main(String[] args) {
     /*
4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank
has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%
                USE ONE PRINT STATEMENT ONLY
 */
        int number = 52;

        if (number>=90){
            System.out.println("your Tank is ful");
        } else if (number>=80) {
            System.out.println("still ok");
        } else if (number>=70) {
            System.out.println("don't go too far");
        } else if (number>=60) {
            System.out.println("Start to head back");
        }else System.out.println("be careful now you are at %50");


        System.out.println("--------------------------------------------");
        //SECOND WAY

            int number1 = 80;
            String result = "";

            if(number1 >= 90){
                result =  "Your tank is full";
            }else if(number1 >= 80){
                result = "Still okay";
            }else if(number1 >= 80){
                result = "Don't go too far";
            }else if(number1 >= 80){
                result = "Start to head back";
            }else{
                result = "Be careful now you at 50%";
            }
            System.out.println("result = " + result);
    }
}
