package day37_Inheritance_Continue;

class A{
    public A(int a){
        System.out.println("A");
    }
}

class B extends A {
    public B(){
        super(9);
        System.out.println('B');
    }

}


public class ConstructorPractise {
    public static void main(String[] args) {

      B obj =  new B();
        System.out.println(obj);


    }

}
