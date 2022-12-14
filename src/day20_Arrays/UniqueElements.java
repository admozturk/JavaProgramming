package day20_Arrays;

import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] items = {"java", "java", "C#", "python", "python"};
        for (int j = 0; j < items.length; j++) {

            String elements = items[j];
            int frequency = 0;

            for (int i = 0; i < items.length; i++) { // responsable of finding the frequency
                if (items[i].equals(elements)) {
                    frequency++;
                }

            }

           if (frequency==1){
               System.out.println(elements);
           }
        }


    }
}
/*
        1. Create an array named items with the length of 5
        2. Create an array named prices with the length of 5
        3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
        4. calculate the total price of the arrays
        5. display each item name and price in separate lines

        ItemName -- Price
*/
