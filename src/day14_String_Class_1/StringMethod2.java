package day14_String_Class_1;

public class StringMethod2 {
    public static void main(String[] args) {

        String str =  "java is fun, I love learning java";
       String str2 = str.replace("java", "Python") ;

        System.out.println("str2 = " + str2);


        String email =  "johnSmith@yahoo.com";
        String newEmail = email.replace("yahoo", "gmail" );
        System.out.println("newEmail = " + newEmail);

        String sentence = "java java   Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", "");
        System.out.println("sentence2 = " + sentence2);
              sentence2 = sentence2.replace("  ", "");
        System.out.println("sentence2 = " + sentence2);


        System.out.println("-----------------------------");

        String s1 = "Dog Dog Dog Dog Dog Dog";

        s1= s1.replace("Dog", "Cat");

        System.out.println("s1 = " + s1);

        System.out.println("----------------------------------");

        String s2 = "C# is fun, C# is coll";
       s2=  s2.replace(" C#", " java"); // executes the 2nd one because condition comes with space before it
        System.out.println("s2 = " + s2);

        System.out.println("------------------------------------");

        String s3 = "Java";

        s3 = s3.replace("a","e");
        System.out.println("s3 = " + s3);

        System.out.println("-------------------------------");

        // replace first method it checks from left to right

        String result = "Java Java Java";
        result = result.replaceFirst("Java","Python");
        System.out.println("result = " + result);


        String result2 = "C# is fun, C# is coll";
        result2= result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3= result3.replaceFirst("a","o");
        System.out.println("result3 = " + result3);

        String result4 = "Java";
        result4 = result4.replaceFirst("va","vo");
        System.out.println("result4 = " + result4);

















    }
}
