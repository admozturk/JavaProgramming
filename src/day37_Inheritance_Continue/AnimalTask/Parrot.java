package day37_Inheritance_Continue.AnimalTask;

public class Parrot extends Animal{

    // subclass also they can add their own fields and methods if you want to add anything extra
    // add to inside constructor than add using this. method
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void sing (){
        System.out.println(name+ " is singing");
    }

}
