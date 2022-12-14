package day17_While_do_WhileLoops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBCAAAAAAAAAAAAAAAAAA";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {// i; indexes of str
            char eachchar = str.charAt(i);// eachChar: each character of str

            if (ch==eachchar){// if given char matching with the eachchar, then ch appeared in the string
                frequency++;
            }

        }

        System.out.println("frequency = " + frequency);


    }
}
