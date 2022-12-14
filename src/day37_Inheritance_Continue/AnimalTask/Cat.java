package day37_Inheritance_Continue.AnimalTask;

public class Cat extends Animal {

    // It is mandatory to call instances by using super() key for all the subclasses(child classes)
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void scratch (){
        System.out.println(name+ " is scratching");
    }

    public void meow (){
        System.out.println(name+ " is meowing");
    }




}
