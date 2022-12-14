package day32_Conscructor_Overloading;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Adem");
        Employee employee2 = new Employee("Yuliya",'F');
        Employee employee3 = new Employee("Olga",'F',"SDET");
        Employee employee4 = new Employee("Ahmed",'M',"SDET",120000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
