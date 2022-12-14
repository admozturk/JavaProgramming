package day30_CustomClass;
/* WHAT ATTRIBUTES AND WHAT ACTIONS OF THIS CLASS NEEDS
ATTRIBUTES ; NAME, AGE, GENDER, BREED, SIZE, COLOR
ACTIONS ;  EAT(), PLAY(), BARK().....
CUSTOM CLASS DOESN'T HAVE MAIN METHOD
*/


public class Dog {
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo (String dogName, String dogBreed, int dogAge, char dogGender, String dogsize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogsize;
        color = dogColor;
    }

    public void eat(){
        System.out.println(name+ " is eating");

    }

    public void bark(){
        System.out.println(name+ " is barking");


    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }





}
