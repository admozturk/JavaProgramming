package day17_While_do_WhileLoops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String  str = "cat cat dog dog";
         int frequecy = 0;


        for (int i = 0; i < str.length()-2; i++) {
            String eachsub = str.substring(i, i+3);

            if (eachsub.equals("cat")){
                frequecy++;
            }

        }

        System.out.println(frequecy);


    }
}
