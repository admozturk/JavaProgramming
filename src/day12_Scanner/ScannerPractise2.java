package day12_Scanner;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class ScannerPractise2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter true or false");

        //boolean result = scan.nextBoolean(); // we can only type true or false

        System.out.println("Enter your name");

        String name = scan.next(); // you can type only 1 word. Reads the input until a space

        System.out.println("name= "+ name);
        scan.close();



    }
}
