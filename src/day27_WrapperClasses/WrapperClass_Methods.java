package day27_WrapperClasses;

public class WrapperClass_Methods {
    public static void main(String[] args) {

       // Parse Method:  Converts string to Primitives

        String str = "12345";

        int num = Integer.parseInt(str); // int
        System.out.println(num+1);

        System.out.println("----------------------------------");

        String str1 = "100.34";
       double num2 =  Double.parseDouble(str1);
        System.out.println(num2 + 2.5);

        System.out.println("------------------------------------");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max= "+max);
        System.out.println("Min= "+min);

        System.out.println("-------------------------------------");

        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;
        System.out.println("max1= "+max1);
        System.out.println("Min1= "+min1);


        System.out.println("---------------------------------------");

        String s1 = "true";

        boolean r1 = Boolean.parseBoolean(s1); // as long as it is not true il will be false by default
        System.out.println(r1);





    }
}
