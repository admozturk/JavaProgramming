package day39_Review_Encapsulation_Inheritance.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square1 = new Square(9);
        System.out.println(square1);

        Rectangle rectangle1 = new Rectangle(7, 7);
        System.out.println(rectangle1);

        Circle circle1 = new Circle (8);
        System.out.println(circle1);

        rectangle1.setWidth(10);
        rectangle1.setLength(6);
        System.out.println(rectangle1.getLength()+" "+rectangle1.getWidth());

        System.out.println(rectangle1.getName());

        circle1.setRadius(9.8);
        System.out.println(circle1);

        square1.setSide(35);
        System.out.println(square1);
        System.out.println(circle1.getName());


    }
}
