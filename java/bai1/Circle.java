package bai1;

import java.util.InputMismatchException;

public class Circle {
    private double radius =1;

    public Circle() {
    }

    public Circle(double radius) {
        if(radius<0){
            throw new RuntimeException(" Error");
        } else {
            this.radius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return (radius*2)*Math.PI;
    }
    public void setRadius(double radius) {
        if(radius<0){
            throw new RuntimeException(" Error");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
