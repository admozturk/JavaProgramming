package day31_Constructors.scrumTask;

public class Developer {
    public String name;
    public int employeeID;
    public String JobTitle;
    public double salary;


    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary= $" + salary +
                '}';
    }

    public void coding() {
        System.out.println(name+ "is coding");
    }


   public void unitTesting(){
       System.out.println(name+ "doing unit test");
   }


    public void fixingBug() {
        System.out.println(name+ "is fixing bugs");
    }

}
    /*create a class called Developer
        Attributes:
        name, employeeID, JobTitle, Salary

        Add A constructor that can set all the fileds

        Actions:
        coding(), unitTesting(), fixingBug(), toString()*/
