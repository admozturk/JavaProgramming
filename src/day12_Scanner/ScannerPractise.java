package day12_Scanner;
// wild import it imports everything from the package that's why they say wild

import java.util.Scanner;// this is syntax of import statement// use always regular import it takes less memory

public class ScannerPractise {
    public static void main(String[] args) {

       // used for getting user inputs
        // needs to be imported from java.util

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7");

        int number = scan.nextInt();
        String result = "";

        if (number >= 1 && number <= 7){
          result = (number==1)? "monday" :(number==2)? "Tuesday" :(number==3)? "wednesday" :(number==4)?"thursday"
                    :(number==5)? "friday" :(number==6)? "saturday" :"sunday";
        }else{
            result = "invalid number";
        }

        System.out.println(result);
        scan.close ();


    }
}
