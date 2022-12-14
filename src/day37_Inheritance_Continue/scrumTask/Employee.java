package day37_Inheritance_Continue.scrumTask;

public class Employee extends Person {
    public String jobtitle;
    public int id;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobtitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobtitle = jobtitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobtitle+" "+name+ " is working");
    }

    public String toString() {
        return "Employee{" +
                "  name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
