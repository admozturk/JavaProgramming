package day15_For_Loop;

public class StringMethods {
    public static void main(String[] args) {
        String str = "     ";// bu bir bosluk ama bos degil

        boolean str1 =  str.isEmpty();//bos
        System.out.println(str1);

        boolean str2 = str.isBlank();
        System.out.println(str2);//bosluk


        System.out.println("----------------------------------------");

        // EAUALS // EAUALSIGNORECASE
        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("yes".equalsIgnoreCase("YeS"));

        System.out.println("------------------------------------");

        String sentence = "My favorite programing language is java";

        boolean hasCsharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("java");
        boolean hasJava2 = sentence.contains("Java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println(hasCsharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("-------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains("Java"));

        // how to ignore case sensitivity

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("------------------------------------");

        //StartsWith And endswsith
        String a = "Wooden Spoon";

      boolean a1 = a.startsWith("Woo");
      boolean a2 = a.endsWith("Spoon");
      boolean x = a.toUpperCase().startsWith("WOODEN");
      boolean y = a.toLowerCase().endsWith("spoon");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(x);
        System.out.println(y);













    }
}
