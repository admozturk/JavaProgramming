package day39_Review_Encapsulation_Inheritance.cydeo_Task;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("Adem",36,'M',123456,"Java Developer", 135000);

        Tester tester = new Tester("Farhat", 29,'M',1234,"STED",120000);

        Teacher teacher = new Teacher("Ayse", 32, 'F', 3, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("----------------------------------------------------------");

        developer.setAge(38);
        System.out.println(developer.getAge());
        System.out.println(developer);
        developer.work();

        System.out.println("---------------------------------------------------------");

        tester.setSalary(20000);
        System.out.println(tester.getSalary());
        tester.work();
        tester.sleep();
        tester.createTicket();

        System.out.println("----------------------------------------------------------");

        teacher.setName("Jale");
        System.out.println(teacher.getName());
        teacher.drink();
        teacher.work();

        System.out.println("-------------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();
        student.study();



    }
}
