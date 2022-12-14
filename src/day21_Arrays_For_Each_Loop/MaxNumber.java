package day21_Arrays_For_Each_Loop;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max){
                max=number;
            }
        }

        System.out.println(max);
    }
}
