package Lab4_1.ShapeUML;

import Lab4_1.ShapeUML.Shape;

public class Circle extends Shape {
    protected double radius = 0d;
    private double square   = 0d;

    //////////////////////////////////
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
        square = (double) (Math.PI * Math.pow(radius, 2));
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    //////////////////////////////////

    public void setRadius(double radius) {
        this.radius = radius;
        square = (double) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return square;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
