package day9_If_ElseStatement;

public class CharacterIdentity {
    public static void main(String[] args) {
        char outPut = '@';
        if (outPut >= 58 && outPut <= 65) {
            System.out.println("Special Character");
        } else if (outPut >= 65 && outPut <= 90 || outPut >= 97 && outPut <= 122) {
            System.out.println("Alphabetic character");
        } else System.out.println("digit");

    }

}


   /* Create a class called Character Identity, and write a program that can
        identify if the given character is a digit or Alphabetic Character(A~Z
        or a~Z) or a special character
        Ex:
        ch = '@'
        output:
        Special Character
        HINT: You may wanna check out the numbers of the
        chracters on ASCII table
        */