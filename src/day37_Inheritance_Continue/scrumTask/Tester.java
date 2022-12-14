package day37_Inheritance_Continue.scrumTask;

public class Tester extends Employee {
    // father inherited from grandfather now child1 is taking from father
    public Tester(String name, int age, char gender, String jobtitle, int id, double salary, String companyName) {
        super(name, age, gender, jobtitle, id, salary, companyName);
    }

    public void createTicket() {
        System.out.println(jobtitle + " " + name + " is creating tickets");
    }


}