package day40_Final_Keywords;

public class Dog extends Animals{


    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat (){
        System.out.println(getName()+" is eating dog food");
    }

   // public final void drink (){// final cannot be override
      //  System.out.println(getName()+" is drinking water");
   // }

public void bark (){
    System.out.println(getName()+" is barking");
}

}
