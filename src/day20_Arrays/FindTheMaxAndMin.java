package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int []numbers = new int [10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter a number");
            numbers[i] = scan.nextInt(); // each user entered input will be assigned to the indexes of array numbers

        }
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max= numbers[i];
            }
            if (numbers[i]< min){
                min=numbers[i];
            }

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("max num: "+max);
        System.out.println("min num: "+min);

    }
}
/*
3. Write a program that asks user to enter a number 10 times:
        1. store all user entered numbers in an array
        2. find the max number
        3. find the min number*/
