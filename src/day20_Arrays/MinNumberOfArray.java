package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {145,8,65,56,15,30};
        int min = numbers[0];// it will start comparison with the first element//145

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){//the smallest one in the array will be assigned as min
               min=numbers[i];
            }

        }
        System.out.println(min);



    }
}
