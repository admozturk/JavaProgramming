package day15_For_Loop;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int min = 0;

        for (int i = 1; i < 101; i++) {
            min+=i;

        }

        System.out.println(min);
    }
}