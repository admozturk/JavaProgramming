package day43_Abstraction_Intro.Employee;

public final class Developer extends Employee{
    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing the applications");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " is sleeping 7 hours per day");
    }

    public void unitTest (){
        System.out.println(getName()+" is unit testing");
    }
}
