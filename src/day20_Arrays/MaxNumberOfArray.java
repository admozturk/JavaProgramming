package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int[] numbers= {10, 5, 4, 20, 1, 0};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){//checks on by one until finds the grater number and assigns the max
                max=numbers[i];// assigning grater number to max

            }

        }
        System.out.println(max);

    }
}
