package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class Task2_Reverse_Second_Word {
    public static void main(String[] args) {
      // this codes will work with all the indexes of the words in a sentence
        String sentence = "I Love Java";
        String[] words = sentence.split(" ");// in order to get any word from a sentence first split it
        // then take the index number of the word

        String reversedWord = "";// to store our reversed word
        for (int i = words[1].length() - 1; i >= 0; i--) { // we will use the string words and get the length of the
            reversedWord += words[1].charAt(i);                                              // second word which index number is 1

        }
        System.out.println(reversedWord);

        // how to print on the console the original with the reversed one love to evol
        //output is I love java to I evol java

        // 1.st solution; sentence=sentence.replaceFirst(words[1],reversedWord)

        words[1]=reversedWord;// Second way
        System.out.println(Arrays.toString(words));
        String result = "";
        for (String word : words) {// then we can print all the words together
           result +=word+" ";// possible to do it System.out.print(word+ " ";)
        }

        System.out.println(result);
    }

}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";
			output:
				I evoL Java
 */