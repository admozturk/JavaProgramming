package day16_ForLoop_StringManipulation;

public class Unique {
    public static void main(String[] args) {

        String str = "aaabcccdd";
        //            0123456

        String result = "";

        for (int i = 0; i< str.length() ;i++) {// i= index of numbers of str (starting from 0)
            char ch = str.charAt(i);// each character of str
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result += ch;
            }
        }

        System.out.println(result + " is unique");



        /*char ch = 'b';

        if (str.indexOf(ch)==str.lastIndexOf(ch)){ //if the first index of numbers and the last index of
                                                   // characters are the same then it is unique
            result += ch;

        }// this way is long i need to aplly for every characters instead of this we use for loop
*/









    }
}
