package Polymorphism._02_Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;

    }

    protected   abstract void calculatePerimeter();

    protected abstract void calculateArea();
}
