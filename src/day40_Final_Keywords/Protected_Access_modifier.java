package day40_Final_Keywords;

public class Protected_Access_modifier {
    static String name1 = "Cydeo ";// default access modifier can be only inherited to the classes in the same package

    protected static String name2 = "Wooden spoon";//protected


    static void method1() {

    }// default methods also cannot be inherited outside the package

    protected static void method2() {

    }
}
