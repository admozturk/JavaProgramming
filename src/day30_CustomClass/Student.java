package day30_CustomClass;

public class Student {
    public String name;
    public char gender;
    public int age;
    public String schoolName;
    public int ID;
    public String classRoom;
    public char grade;



    public void setInfo (String name, char gender, int age, String schoolName, int ID, String classRoom, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.schoolName = schoolName;
        this.ID = ID;
        this.classRoom = classRoom;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                ", ID=" + ID +
                ", classRoom='" + classRoom + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void study (){
        System.out.println(name+" is studying everyday" );
    }

    public void sleep (){
        System.out.println(name+ " sleeps everyday at 10PM");
    }

}