package Lab4_1.ShapeUML;

import Lab4_1.ShapeUML.Shape;

public class Square extends Rectangle {

    //////////////////////////////////
    public Square() {}

    public Square(double side) {
        this.width = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    //////////////////////////////////

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.width = side;
    }

    public void setWidth(double side) {
        this.setSide(side);
    }

    public void setLength(double side) {
        this.setSide(side);
    }


    @Override
    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
