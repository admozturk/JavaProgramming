package day16_ForLoop_StringManipulation;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "aabbcc";

        String result = "";

        for (int i = 0; i < str.length(); i++) {// i represents the all index number of str
            String ch = "" + str.charAt(i);//represents each character of str

            if (!result.contains(ch)) { // if the charater is not contained in th result
                result += ch;// the character will be added to the result
            }
            }

        System.out.println("result = " + result);
        }
    }
