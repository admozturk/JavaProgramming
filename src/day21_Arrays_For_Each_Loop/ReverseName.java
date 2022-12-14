package day21_Arrays_For_Each_Loop;

public class ReverseName {
    public static void main(String[] args) {

        // write some names and surname and reverse them all.

        String[] names = {"Adem ozturk", "meryem ozturk", "gul yalcin", "Ercan yalcin", "guldem yalcin", "zelu yalcin"};

        for (String each : names) { //each:each names above
         String reversed= "";//  to store the reversed names

            for (int i = each.length()-1; i >=0; i--) { //inner loop revers the string
                reversed+=each.charAt(i);
            }

            System.out.println(reversed);

        }


    }
}
