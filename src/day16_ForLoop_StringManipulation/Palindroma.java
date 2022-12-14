package day16_ForLoop_StringManipulation;

public class Palindroma {
    public static void main(String[] args) {
        String word = "Level";

        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(reversed);

        boolean ispalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("ispalindrome = " + ispalindrome);







    }
}
