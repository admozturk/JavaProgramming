package utilities;

import day40_Final_Keywords.Protected_Access_modifier;

public class AccessModifiers_test4  extends Protected_Access_modifier {
    public static void main(String[] args) {

        // System.out.println(AccessModifiers_Test4.name1);// default is not visible outside the package
        System.out.println(AccessModifiers_test4.name2); // protected is visible outside package in sub Classes ONLY

       // AccessModifiers_test4.method1();//
        AccessModifiers_test4.method2();







    }
}
