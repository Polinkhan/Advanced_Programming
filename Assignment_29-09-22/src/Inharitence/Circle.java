package Inharitence;

public class Circle extends Shape {

    private double radius = 1.0;

    Circle() {
        super();
    }

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.1416 * this.radius * this.radius;
    }

    double getPerimeter() {
        return 2 * 3.1416 * this.radius;
    }

    @Override
    public String toString() {
        return "\n--Circle--\nRadius = "+getRadius()+"\nArea = "+getArea()+"\nPerimeter = "+getPerimeter();
    }

}
