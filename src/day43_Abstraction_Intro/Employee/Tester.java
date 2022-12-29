package day43_Abstraction_Intro.Employee;

public final class Tester extends Employee {
    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() { // abstract method inherited from Employee (super) class
        System.out.println(getName()+ " is testing the application");
    }


    @Override
    public void sleep() { // abstract method inherited from person (super) class
        System.out.println(getName()+" sleeps 8 hours per day");
    }

    public void bugReport(){
        System.out.println(getName()+" is creating Bug report");
    }
}
