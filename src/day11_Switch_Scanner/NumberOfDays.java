package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2000;
        int number = 9;
        String result = "";
        // we can use pre-condition
        if (number >= 1 && number <= 12) {

            switch (number) {
                case 2: // we can use ternary
                    result = (year % 4 == 0) ? "29 days" : "28 days";
                    break;
                case 4:
                case 6:  // we applied or '||' logic for these we can't use or logic normally
                case 9:  // it is boolean but in this way it is possible
                case 11:
                    result = "30 days";
                    break;
                default: //1,3,5,7,8,10,12
                    result = "31 days";

            }


        } else {
            result = "invalid";
        }

        System.out.println(result);

    }
}
/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12
			If(1~12){
			}else{
				Invalid
			}
 */