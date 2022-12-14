package day30_CustomClass;

import java.util.ArrayList;

public class StudentsObject {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Ahmed",'M',19,"Cydeo",2560,"CLS18",'B');

        Student student2 = new Student();
        student2.setInfo("Hulya",'F',23,"Techpro", 2335,"CLS56",'A');

        Student student3 = new Student();
        student3.setInfo("Elminur", 'F',26,"Cydeo",2445,"CLS43",'C');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M',28,"Wise Quarter",2131,"CLS53",'A');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 26 ,"Cydeo", 9871, "CLS234",'D');



        Student [] students = {student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------------------------------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if (student.grade == 'A'){
                earlyBirds.add(student);
            }else {
               angryBirds.add(student);
            }

        }
        System.out.println(earlyBirds);

    }
}
