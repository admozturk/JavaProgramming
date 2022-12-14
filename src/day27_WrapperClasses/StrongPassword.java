package day27_WrapperClasses;

public class StrongPassword {
    public static void main(String[] args) {
        String password = "Cydeo1990@";
        boolean req1 = password.length() >= 8 && !password.contains(" ");
        boolean req2 = false; // check if it has UpperCase
        boolean req3 = false;  // check if it has LowerCase
        boolean req4 = false;  // check if it has special char
        boolean req5 = false; // check if it has digit

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                req2 = true;
            } else if (Character.isLowerCase(each)) {
                req3 = true;

            } else if (Character.isDigit(each)) {
                req5 = true;

            } else { // if it has a specail char
                req4 = true;
            }

        }
        boolean isStrongPassword = req1 && req2 && req3 && req4 && req5;
        System.out.println("is it a strong password = " + isStrongPassword);


    }
    /*PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
            1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit  */


    public static boolean isStrongPassword(String password) {
        boolean req1 = password.length() >= 8 && !password.contains(" ");
        boolean req2 = false; // check if it has UpperCase
        boolean req3 = false;  // check if it has LowerCase
        boolean req4 = false;  // check if it has special char
        boolean req5 = false; // check if it has digit

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                req2 = true;
            } else if (Character.isLowerCase(each)) {
                req3 = true;

            } else if (Character.isDigit(each)) {
                req5 = true;

            } else { // if it has a specail char
                req4 = true;
            }
        }
        boolean isStrongPassword = req1 && req2 && req3 && req4 && req5;
        return isStrongPassword;

    }

}
