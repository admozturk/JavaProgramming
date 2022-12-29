package day43_Abstraction_Intro.Employee;

public final class Driver extends Employee{
    public Driver(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving  12 hours");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping 10 hours");
    }

    public void drive(){
        System.out.println(getName()+" is driving to earn money");
    }
}
