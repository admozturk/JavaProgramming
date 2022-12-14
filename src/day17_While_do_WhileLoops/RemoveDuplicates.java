package day17_While_do_WhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str ="AABBCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

           char ch = str.charAt(i);
            if (result.contains(""+ch)){
                continue;
            }
           result +=ch;
        }
        System.out.println(result);

        System.out.println("-----------------------------------------");

        String str1 ="AABBCCDD";
        String result1 = "";

        for (int i = 0; i < str1.length(); i++) {

           String ch1 = ""+str1.charAt(i);
            if (result1.contains(ch1)){
                continue;
            }
            result1 +=ch1;
        }
        System.out.println(result1);





    }
}
