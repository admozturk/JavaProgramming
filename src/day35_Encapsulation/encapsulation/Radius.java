package day35_Encapsulation.encapsulation;

public class Radius {
    private double radius;
    public static double pi;



    public Radius(double radius) {
        this.radius = radius;
    }

    static {
        pi=3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            return;
        }
        this.radius = radius;
    }

    public double calcArea() {
        return radius * radius * pi;
    }

    public double calcPerimeter() {
        return 2 * radius * pi;
    }


    public String toString() {
        return "Radius{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", Calculate Area=" + calcArea() +
                ", Calculate Perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
2. Create a class named Circle

private variables:
        radius

public variable:
        pi

        Encapsulate all the private fields

        1. radius of the circle can not be zero or negative

        Add a constructor that can set the radius of circle when circle object is created

        Methods:
        calcArea()
        calcPerimeter()
        toString()*/
