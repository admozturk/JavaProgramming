package day42_Exception_Continue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Disadvantage_Of_Throws_Keyboard2 {

    public static void main(String[] args) throws Exception {

        // it is possible to call throw Exception because it is the parent od all exceptions but, it is not recommended
        // so better the use the given exception that your compiler gives

        method1();
        method2();
        method3();
        method4();

        String str = null;
        try {
            System.out.println(str.charAt(0));
        } catch (Exception e) {
            e.printStackTrace();// gives you the full description of given exception
        }

    }


    public static void method1() throws InterruptedException {
       // new FileInputStream("");
        Thread.sleep(3000);
    }


    public static void method2() throws InterruptedException{
        method1();
    }


    public static void method3() throws InterruptedException {
       method2();
       Thread.sleep(2000);
    }



    public static void method4() throws InterruptedException {
        method3();
    }




}
