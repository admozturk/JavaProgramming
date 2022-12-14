package day20_Arrays;

import java.util.Arrays;

public class ArraysPractises {
    public static void main(String[] args) {
        // store those elements 10,20,30,40

        int numbers[]={10,20,30,40};
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------------");
        // create a variable that can contain 5 elements
        int [] scores = new int[5];
        scores[1]=85;
        scores[scores.length-1]=95;
        scores[3]=75;
        scores[0]=65;
        scores[2]=55;

        System.out.println(Arrays.toString(scores));

        System.out.println("---------------------------------------------");
        String [] months= {"January","february","march","april","may","june","july","august","september","october","november","december"};

       /* System.out.println(months[0]);// january
        System.out.println(months[1]);// february
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);*/

        for (int i = 0; i < months.length; i++) {// represents the index numbers of array starting from 0
            System.out.println(months[i]);

            }
        System.out.println("------------------------------------------------------");
        for (int i = months.length-1; i >=0; i--) {
            System.out.println(months[i]);

        }










    }
}
