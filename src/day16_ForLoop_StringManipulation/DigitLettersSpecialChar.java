package day16_ForLoop_StringManipulation;

public class DigitLettersSpecialChar {

    public static void main(String[] args) {

     String str ="ABCDECydeoWoodenSpoon1234567890) (*&^%$#@!";

        String digit = ""; //12345
        String letters = ""; // CydeoWoodenSpoon
        String specialChars = ""; //!@#$%


        for (int i = 0; i < str.length(); i++) {//i: index numbers of str (0 ~ last index)

            char ch = str.charAt(i);// ch:each character that we have in str

            if (ch>='0' && ch <='9'){//if the character is between '0' to '9' then it's digit
                digit += ch;

            } else if (ch >='A' && ch <= 'Z') {// if the character is between 'A' to 'Z' then it's letter
                letters += ch;

            } else if (ch >='a' && ch <='z') {// if the character is between 'a' to 'z' then it's letter
                letters += ch;

            }else{// if the character is neither digit nor letter, then it's special character
                if (ch != ' ');// if the special character is not a space
                specialChars += ch;
            }

        }
        System.out.println("digit = " + digit);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);








    }
}
