package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method");

        // main method runs after the static



    }
    // runs first before everything and each block only runs one time no more.
    static {
        System.out.println("static Block");
    }
    static {
        System.out.println("static Block1");
    }
    static {
        System.out.println("static Block2");
    }
}
