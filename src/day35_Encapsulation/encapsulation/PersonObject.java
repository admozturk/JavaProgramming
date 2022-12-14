package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        Person p1 = new Person();
       p1.setName("Daniel");
       p1.setAge(90);

      // only way to print it trough the get method

        System.out.println(p1.getName()+" : "+p1.getAge());


    }
}
