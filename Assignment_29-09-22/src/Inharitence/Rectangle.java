package Inharitence;

public class Rectangle extends Shape {

    private double width = 1.0;
    private double length = 1.0;

    Rectangle() {
        super();
    }

    Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    double getWidth() {
        return this.width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getLength() {
        return this.length;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        return this.width * this.length;
    }

    double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "\n--Rectangle--\nWidth = "+getWidth()+"\nLength = "+getLength()+"\nArea = "+getArea()+"\nPerimeter = "+getPerimeter();
    }

}
