package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("halil",'M',36,280000);

        employee1.setAge(32);

        System.out.println(employee1);

        Employee employee2 = new Employee("Ayse",'F',31, 130000);
        employee2.setName("Aygun");

        System.out.println(employee2);

        employee2.setSalary(employee2.getSalary()+15000);
        System.out.println(employee2);



    }
}
