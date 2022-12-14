package day27_WrapperClasses;

public class ValueOf_Method {
    public static void main(String[] args) {

        // Value of Method; converts strings to wrapper classe

        String str ="1234556";

        Integer x = Integer.valueOf(str); // integer
        int y = Integer.valueOf(str);  // integer

        System.out.println(x);
        System.out.println(y);


        String s3 = "1.5";
        Double z = Double.valueOf(s3);// Double

        System.out.println(z);

        System.out.println("-----------------------------------------------------");


        char ch1 = '!';

        //isDigit()
        boolean r2 = Character.isDigit(ch1);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);

        // special char
        boolean r4= !Character.isLetterOrDigit(ch1); // if the character isn't digit and letter

        // upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("----------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if( Character.isDigit(each) ){
                sum +=  Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);




    }
}
