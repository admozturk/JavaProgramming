package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        char []chars = {'A','B','A','A','A','C','C','D','D'};
        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j];
            int frequency = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i]==ch){
                    frequency++;
                }

            }

            if (frequency==2){
                System.out.println(ch);
            }
        }







    }
}
