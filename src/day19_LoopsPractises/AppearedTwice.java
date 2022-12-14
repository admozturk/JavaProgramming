package day19_LoopsPractises;

public class AppearedTwice {
    public static void main(String[] args) {

        //Write a program that can display all the characters that appeared twice in the string.
        // str = aaabbcccddeeeeff;

        String str = "aaabbcccddeeeeff";
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch == each) {
                    count++;

                }

            }
            if (result.contains("" + ch)) {
                continue;
            }
            if (count == 2) {
                result+=ch;

            }
        }
        System.out.println(result);
    }
}
