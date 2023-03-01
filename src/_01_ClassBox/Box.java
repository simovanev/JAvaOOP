package _01_ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
            this.length = length;
        }


        public void setWidth ( double width){
            if (width <= 0) {
                throw new IllegalArgumentException("Width cannot be zero or negative.");
            }
            this.width = width;
        }

        public void setHeight ( double height){
            if (height <= 0) {
                throw new IllegalArgumentException("Height cannot be zero or negative.");
            }
            this.height = height;
        }

        public double calculateSurfaceArea(){
        return calculateLateralSurfaceArea()+2*length*width;
        }
        public double calculateLateralSurfaceArea (){
        return 2*length*height+2*width*height;
        }
        public  double calculateVolume (){
        return length*width*height;
        }
}

