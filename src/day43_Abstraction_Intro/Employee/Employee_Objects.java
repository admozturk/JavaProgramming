package day43_Abstraction_Intro.Employee;

public class Employee_Objects {
    public static void main(String[] args) {

        //Person person = new Person("Josh", 35, 'M'); // because it is abstract we can't use it in here
        //Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00);

        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        System.out.println("---------------------------------------------------------------------------");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        System.out.println("---------------------------------------------------------------------------");

        tester.work();
        tester.bugReport();
        tester.sleep();
        tester.eat();

        System.out.println("---------------------------------------------------------------------------");

        developer.unitTest();

        System.out.println("---------------------------------------------------------------------------");

        driver.drive();

        System.out.println("---------------------------------------------------------------------------");

        teacher.eat();

        System.out.println("---------------------------------------------------------------------------");

        developer.setAge(30);
        System.out.println(developer);
        teacher.setSalary(30000);
        System.out.println(teacher);
        driver.setJobTitle("Bus driver");
        System.out.println(driver);


    }
}
