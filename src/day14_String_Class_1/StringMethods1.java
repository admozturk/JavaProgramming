package day14_String_Class_1;

public class StringMethods1 {
    public static void main(String[] args) {
       String str1 = "      batch 25      ";
       //str1.trim();// still give you the white spaces(unused spaces)
        str1 = str1.trim(); // we need to sign it back
        System.out.println(str1);


        // INDEX NUMBER COMPILER CHECKS EVERY CHARACTER FROM LEFT TO RIGHT

        String str2 = "Cydeo School";
        //str2.indexOf("h");// still give you the same one we need to sign it back
         int n1 =str2.indexOf("h");
        System.out.println("n1= " +n1);

         //str2.indexOf("o");// must sign it back to a new variable
        int n2 = str2.indexOf("o");
        System.out.println("n2:"+n2);

        int n3 = str2.indexOf("ool"); // compiler will execute always by starting on left
        System.out.println("n3: " + n3);

        int n4 = str2.indexOf("ol");
        System.out.println("n4: " + n4);

        System.out.println("-----------------------------------------");

        String str3 = "java Programming Language";
        int in1 = str3.indexOf("a");

        System.out.println("in1: " + in1);
        
        int in2 = str3.indexOf("va")+1;// use only if next to it
        System.out.println("in2 = " + in2);
        
        int in3 = str3.indexOf("amm");
        System.out.println("in3 = " + in3);
        
        int in4 = str3.indexOf("an");
        System.out.println("in4 = " + in4);
        
        int in5 = str3.indexOf("g");
        System.out.println("in5 = " + in5);

        int in6 = str3.indexOf("g ");
        System.out.println("in6 = " + in6);

        System.out.println("---------------------------------");

        // last index method checks the number from right to left

        String word = " Cydeo School";

        int nmb1= word.lastIndexOf("l");
        System.out.println("nmb1 = " + nmb1);


        String s = "Java Nova Cava Wawa Orange";

        int firtsA = s.indexOf("a");
        System.out.println("firtsA = " + firtsA);

        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        //int fourtA = s.indexOf("ava W");
        //int fourtA = s.lastIndexOf("av");
        int fourtA = s.indexOf("ca")+1;// use only if next to it
        System.out.println("fourtA = " + fourtA);

        int fiftA = s.lastIndexOf("a W");
        System.out.println("fiftA = " + fiftA);

        int sixtA = s.lastIndexOf("aw");
        System.out.println("sixtA = " + sixtA);

        int seventhA = s.lastIndexOf("a ");
        System.out.println("seventhA = " + seventhA);












        
        

        






    }
}
