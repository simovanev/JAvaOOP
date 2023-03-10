package Polymorphism._02_Shapes;

public class Circle extends Shape{
    private  Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter( Math.PI*2*radius);
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI*radius*radius);
    }
}
