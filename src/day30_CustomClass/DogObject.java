package day30_CustomClass;

import java.util.ArrayList;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.name ="Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size= "Small";
        dog1.color= "White";

        Dog dog2 = new Dog();

        dog2.name ="ACE";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender = 'M';
        dog2.size= "Large";
        dog2.color= "White & Black";

        Dog dog3 = new Dog ();
        dog3.setInfo("Jack","German Shepard",2, 'M',"Large","Black");

        Dog dog4 = new Dog();
        dog4.setInfo("Josh","pit-Bull",5,'M',"Medium","Brown");

        Dog dog5= new Dog();
        dog5.setInfo("Suzzy","Doberman",8,'F',"big","Brown & Grey");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);


        dog1.eat();
        dog2.bark();

        System.out.println("-----------------------------------------------------------------------------");

        // add all the male or email dogs in the arrays list belove count how many male and female
        // 1st solution apply loops
        // second no loop
        Dog [] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs =new ArrayList<>();
        ArrayList<Dog> maleDogs =new ArrayList<>();




    }

}
