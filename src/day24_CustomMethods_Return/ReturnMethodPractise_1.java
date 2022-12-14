package day24_CustomMethods_Return;

public class ReturnMethodPractise_1 {
    public static void main(String[] args) {

        // find the max number between 2 numbers 100 & 200
        int max = maxNumber(100, 200);
        // Multiply the numbers by 2
        int result = max * 2;
        System.out.println("result = " + result);


    }

    public static int maxNumber(int x, int y) {
        int result = 0;

        if (x > y) {
            result = x;
        } else {
            result = y;
        }
        return result;
    }

}
