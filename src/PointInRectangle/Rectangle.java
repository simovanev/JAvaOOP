package PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public  boolean contains(Point point) {
        boolean horizontal = bottomLeft.getX() <= point.getX() &&
                topRight.getX() >= point.getX();
        boolean vertical = bottomLeft.getY() <= point.getY() &&
                topRight.getY() >= point.getY();

        return horizontal && vertical;
    }
}
