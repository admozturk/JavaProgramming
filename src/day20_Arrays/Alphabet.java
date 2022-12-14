package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        // create a variable that contains 26 elements
        char[] alphabet = new char[26];// store the characters starting Z~A

        // we can assign by
//               i   ch
       /* alphabet[0]='Z'; //90
        alphabet[1]='Y'; //89
        alphabet[2]='X'; //88
        System.out.println(alphabet[0]);// prints just an element of Array
        System.out.println(Arrays.toString(alphabet)); //prints all Arrays
        */
        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++,ch--) {
            alphabet[i]=ch;

        }
        System.out.println(Arrays.toString(alphabet)); //prints all Arrays


        System.out.println("----------------------------------------------");

        //second way
        char[] alphabetl = new char[26];// store the characters starting z~a

        for (char i= 0, j= 'z';i < alphabetl.length; i++,j--) {
            alphabetl[i]=j;

        }
        System.out.println(Arrays.toString(alphabetl)); //prints all Arrays









    }
}
