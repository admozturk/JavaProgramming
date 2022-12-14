package day16_ForLoop_StringManipulation;

public class Reverse {

    public static void main(String[] args) {

       String str = "Wooden Spoon";
       // index:     01234567891011

        String result = " ";//Contain the reversed version of str
                            // noops nedoow

        for (int i = str.length()-1; i>=0; i--) {
            result +=str.charAt(i);
        }

       /* result +=str.charAt(11);
        result +=str.charAt(10);
        result +=str.charAt(9);
        result +=str.charAt(8);
        result +=str.charAt(7);
        result +=str.charAt(6);
        result +=str.charAt(5);
        result +=str.charAt(4);
        result +=str.charAt(3);
        result +=str.charAt(2);
        result +=str.charAt(1);
        result +=str.charAt(0);
*/
        System.out.println(result);





    }


}
// write a program that can reverse the string

