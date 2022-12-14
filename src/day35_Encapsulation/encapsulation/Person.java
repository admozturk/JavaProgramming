package day35_Encapsulation.encapsulation;

public class Person {
    private String name;
    private int age;

    // to get the name the given datatype must match must be the same
    // getter returns the instance variable no parameter() is needed
    // it can help us to read it
    public String getName(){
        return name;
    }


    //return type in setter must be void public void set(given value)setName,setAge
    // we can generate the setter by giving the same parameter in order the change the value of the data
    // it can help us to write it

    public void setName(String name){
        this.name = name;
    }


    public int getAge(){
        return age;
    }


    public void setAge(int age){
        if (age <= 0 || age > 150){
            System.err.println("Invalid age "+age);
            System.exit(0);
        }
        this.age = age;
    }


}
