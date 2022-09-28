package Inharitence;

public class Square extends Rectangle {

    Square() {
        super();
    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    double getSide() {
        return getLength();
    }

    void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "\n--Square--\nSide = "+getSide()+"\nWidth = "+getWidth()+"\nLength = "+getLength()+"\nArea = "+getArea()+"\nPerimeter = "+getPerimeter();
    }
}
