package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class Deneme12 {
    public static void main(String[] args) {
        //  write a program that can check if str1 & str2 are built ou the same character
        String str = "abcdefg";
        String str1 = "gfedcba";
        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();
        String result = "";

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        for (char each : ch1) {
            result += each + " ";

        }
        for (char each1 : ch2) {
            result += each1 + " ";

        }
        System.out.println(result);

        System.out.println("-----------------------------------------");
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90, 100, 300, 400};
        double sum = 0;

        for (int eachNumber : numbers) {
            sum += eachNumber;

        }

        System.out.println("Average of the numbers is: " + sum / numbers.length);

        System.out.println("-------------------------------------");

        String name = "Adem ozturk";
        name = name.replace(" ", "").toLowerCase();

        char[] namech = name.toCharArray();
        System.out.println(Arrays.toString(namech));

        char[] yeni = Arrays.copyOfRange(namech, 3, 6);
        System.out.println(Arrays.toString(yeni));

        char initialMy[] = Arrays.copyOf(namech, 6 + 1);
        System.out.println(Arrays.toString(initialMy));

        for (int i = 0; i < initialMy.length; i++) {
            System.out.print(initialMy[i] + " ");

        }
        System.out.println();

        for (int i = initialMy.length - 1; i >= 0; i--) {
            System.out.print(initialMy[i] + " ");

        }
        System.out.println();

        System.out.println("-----------------------------------");

        String[] isim = {"Adem Ozturk", "Meryem Ozturk", "Gul Yalcin","Ercan Yalcin"};

        // isimlerin bas harferini duzden ve daha sonrada tersten yazdirin
        for (String s : isim) {
           String basSon =s.charAt(0)+" "+s.charAt(s.indexOf(" ")+1)+", ";
            System.out.print(basSon);
        }
        System.out.println();
        for (int i = isim.length - 1; i >= 0; i--) {
           String yepyeni = isim [i].charAt(0)+" "+ isim[i].charAt(isim[i].indexOf(" ")+1);
            System.out.print(yepyeni+", ");

        }

        }



}




