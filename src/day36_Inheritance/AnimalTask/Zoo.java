package day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "White");
        dog.eat();
        dog.eat();
        dog.bark();
        dog.sleep();
        dog.drink();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'F', 3, "small", "brown");
        cat.eat();
        cat.meow();
        cat.sleep();
        cat.drink();
        cat.scratch();

        System.out.println(cat);


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "small","Black");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);

    }
}
