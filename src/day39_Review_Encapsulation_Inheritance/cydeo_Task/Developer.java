package day39_Review_Encapsulation_Inheritance.cydeo_Task;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void fixingBugs (){
      System.out.println(getJobTitle()+ " "+getName()+ " is fixing bugs");
  }


    @Override
    public void work() {
        System.out.println(getJobTitle()+ " "+getName()+ " is developing the application");
    }


    // no need to add to string method it will bw inherited from Employee class

}
/*
4. Create a sub class of Employee named Developer

        Override the work method

        Extra methods:
        fixingBugs()
        */
