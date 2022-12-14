package day19_LoopsPractises;

public class FindUniqueCharacters {
    public static void main(String[] args) {

        // find the character of thye given string without using index() and last()
        // index() methods  str = aabccdeef output= bdf

        String str = "aabccdeef";
        String result = "";


        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int frequency = 0;// represents the frequency of the ch
            for (int i = 0; i < str.length(); i++) {
                char eachch = str.charAt(i);
                if (eachch == ch) {
                    frequency++;
                }
            }
            if (frequency == 1) { // second way if (frequency != 1){
                                 //                   continue;
                result += ch;
            }

        }
        System.out.println(result);


    }
}
