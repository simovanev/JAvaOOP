package Polymorphism._02_Shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * (height + width));
    }

    @Override
    public void calculateArea() {
        setArea(height * width);
    }
}
