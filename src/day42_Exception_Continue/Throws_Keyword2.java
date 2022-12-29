package day42_Exception_Continue;

public class Throws_Keyword2 {
    public static void main(String[] args) {

    // this is an un checked exception un checked exceptions can only be handled by try catch
    // try catch is the best solution to handle an exception
        System.out.println("Test started");

        try {
            System.out.println(8/0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Test completed");



    }
}
