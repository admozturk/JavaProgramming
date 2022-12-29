package day43_Abstraction_Intro.Employee;

public final class Teacher extends Employee{// if we want to make it unchangeable we can make it final at last
    public Teacher(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching his students");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping 8 hours per day");
    }
}
