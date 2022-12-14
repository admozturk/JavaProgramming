package day24_CustomMethods_Return;

public class ReturnMethod_Intro {
    public static void main(String[] args) {
        String str = "java";

        String result = reverseWords(str);

        System.out.println(result);

        if (str.equalsIgnoreCase(result)){
            System.out.println(str+": is palindrome");
        }else{
            System.out.println(str+": is not palindrome");
        }

    }

    public static String reverseWords(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
       return reverse;
    }


}
