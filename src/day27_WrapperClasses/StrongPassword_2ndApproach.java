package day27_WrapperClasses;

public class StrongPassword_2ndApproach {
    public static void main(String[] args) {

        String password = "WoodenSppon123!";
        int countUpperCase= 0;
        int countLowerCase= 0;
        int countDigits= 0;
        int countSpeacialChar=0;

        for (int i = 0; i < password.length(); i++) {
           char each = password.charAt(i);

           if (Character.isUpperCase(each)){
               countUpperCase++;
           } else if (Character.isLowerCase(each)) {
               countLowerCase++;

           } else if (Character.isDigit(each)) {
               countDigits++;

           }else{
               countSpeacialChar++;
           }

        }
        /*System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpeacialChar = " + countSpeacialChar);*/

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigit = countDigits > 0;
        boolean hasSpecialChar = countSpeacialChar > 0;

        boolean StrongPasword = password.length() >= 8 && ! password.contains(" ") && hasSpecialChar && hasUpperCase && hasLowerCase &&hasDigit;
        System.out.println("Strong Pasword = " + StrongPasword);

    }
}
