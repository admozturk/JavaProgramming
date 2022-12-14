package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class Denem13 {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B', 'C'};//3
        char[] ch2 = {'D', 'E', 'F', 'G'};//4

       char [] group = new char[ch1.length+ ch2.length];

        int i = 0;
        for (char each : ch1) {
            group[i++]=each;
        }
        for (char each1 : ch2) {
            group[i++]=each1;

        }
        System.out.println(Arrays.toString(group));
    }

}
