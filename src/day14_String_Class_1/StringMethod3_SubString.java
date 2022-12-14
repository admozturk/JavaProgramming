package day14_String_Class_1;

public class StringMethod3_SubString {
    public static void main(String[] args) {

        //Substring(beginning index and, ending index)
        String word = "Cydeo School";

        String brand =  word.substring(0, 4+1);
        System.out.println("brand = " + brand);


        word.substring(6);
        String str1 = word.substring(6);
        System.out.println("str1 = " + str1);

        String word2 = "Java Programming language";


        String s1= word2.substring(0, word2.indexOf(" "));
        System.out.println("s1 = " + s1);

        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        System.out.println("s2 = " + s2);

        String s3 = word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println("s3 = " + s3);







    }
}
