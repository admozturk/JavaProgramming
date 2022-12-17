package day39_Review_Encapsulation_Inheritance.cydeo_Task;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }


    public void createTicket (){
        System.out.println(getJobTitle()+" "+getName()+ " is creating a ticket");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " "+getName()+ " is testing");
    }


    // no need to add to string method it will bw inherited from Employee class


}
/*
3. Create a subclass of Employee named Tester

        Override the work method

        Extra methods:
        createTicket()
        */
