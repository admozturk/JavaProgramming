package day39_Review_Encapsulation_Inheritance.shape_Task;

public class Shape {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("name cannot be null");
            System.exit(1);// 1: something went wrong
        }
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) { // constructor
        this.name = name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {

        return 0;
    }

    @Override
    public String toString() { // apply to string method and add manually area and perimeter methods
        return "Shape{" +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Shape:
        variables:
        name

        Encapsulate the field

        Add a constructor to set the filed

        Methods:
        area(){}
        perimeter(){}
*/
