package day17_While_do_WhileLoops;

public class FrequencyOfWordWhile {
    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")){
        str = str.replaceFirst("Java","");
        frequency++;
        }

        System.out.println(frequency);

        System.out.println("----------------------------------------");

        String word = "cat cat cat cat cat cat dog dog dog cat cat";
        word=word.toLowerCase();

        int countCat = 0;

        while (word.contains("cat")){
           word = word.replaceFirst("cat","");
            countCat++;
        }

        System.out.println(countCat);



    }
}
