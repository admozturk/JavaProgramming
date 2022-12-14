package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiersTest2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        // System.out.println(AccessModifiers.defaultData); //  private is not visible outside its package


        AccessModifiers.method1();
     //   AccessModifiers.method2(); // not visible outside its own package
     //   AccessModifiers.method3();//neither outside its own class neither own package

    }
}
