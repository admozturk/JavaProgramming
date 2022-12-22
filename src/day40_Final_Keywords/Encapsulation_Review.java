package day40_Final_Keywords;

import day39_Review_Encapsulation_Inheritance.shape_Task.Circle;
import day39_Review_Encapsulation_Inheritance.shape_Task.Square;

import java.security.PublicKey;

public class Encapsulation_Review {

    private Circle circle;
    private Square square;

    public Circle getCircle() {
        return circle;
    }

    public Square getSquare(){return square;}

    public void setCircle(Circle circle){
        if (circle.getRadius() < 5){
            return;
        }
        this.circle = circle;

    }

    public void setSquare(Square square){
        this.square = square;
    }





}
