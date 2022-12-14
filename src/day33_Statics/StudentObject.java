package day33_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

       Student student1 = new Student("Ahmet");
        System.out.println(student1);

        Student student2 = new Student("Aygun",'F');
        System.out.println(student2);

        Student student3 = new Student("Nigara",11);
        System.out.println(student3);

        Student student4 = new Student("Mert",122,'A');
        System.out.println(student4);

        Student student5 = new Student("Cihad",'M',28);
        System.out.println(student5);

        Student student6 = new Student("Suhaib",'M',26,123);
        System.out.println(student6);

        Student student7 = new Student("Ali",'M',31,231,'B');
        System.out.println(student7);

        System.out.println(student1 == student2); // false

        Student [] students = {student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));




    }
}
