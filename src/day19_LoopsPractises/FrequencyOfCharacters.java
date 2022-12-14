package day19_LoopsPractises;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        /*write a program that can find the frequency of the characters from the given string

        ex: str = "aabcccd"
            output= a2b1c3d1
        * */
        String str = "aabcccd";
        String result = "";//a2b1c3d1


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);// each character of str
            int count = 0;

            for (int i = 0; i < str.length(); i++) {// to find the frequency of each character
                char each = str.charAt(i); //represents the each character of str
                if (ch == each) {
                    count++;
                }

            }if (result.contains(""+ch)) {
                continue;
            }
            result += ch;
            result += count;


        }
        System.out.println(result);

    }
}
