package day21_Arrays_For_Each_Loop;

public class InitialsOfName {
    public static void main(String[] args) {

        // Print each name and surname initials // output A.o, m.o etc....

        String[] names = {"Adem ozturk", "meryem ozturk", "gul yalcin", "Ercan yalcin", "guldem yalcin", "zelu yalcin"};

        for (String each : names) {
            String initial = each.charAt(0) + "." +
                    each.charAt(each.indexOf(" ") + 1);//char at 0 first letter of the name
                                                       //index of " " +1 firts letter after the space
            System.out.println(initial);

        }
    }
}
