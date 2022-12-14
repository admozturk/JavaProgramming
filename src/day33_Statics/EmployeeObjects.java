package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name="Ahmet";
        employee1.salary=115000;

        Employee employee2 = new Employee();
        employee2.name="Ali";
        employee2.salary=117000;

        Employee employee3 = new Employee();
        employee3.name="Ayse";
        employee3.salary=119000;

        System.out.println(employee1.name+" : "+employee1.salary);
        System.out.println(employee2.name+" : "+employee1.salary);
        System.out.println(employee3.name+" : "+employee1.salary);

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);


    }
}
