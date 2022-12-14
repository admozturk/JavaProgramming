package day23_Methods;

public class CustomMethods_Practise {
    // create a function that can print hello world 5 times

    // create a function that can print hello cydeo 5 times
    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5Times();
        evenNumbers();
    }

    public static void helloWorld5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("hello world!");

        }


    }

    public static void helloCydeo5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("hello Cydeo!");

        }

    }

    public static void evenNumbers (){
        for (int i = 2; i <=10; i+=2) {
            System.out.println(i);

        }
    }

}
