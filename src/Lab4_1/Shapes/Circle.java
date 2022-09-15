package Lab4_1.Shapes;

public class Circle extends Shape{
    private double radius = 0;
    private double square = 0;

    //////////////////////////////////
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
        square = (double) (Math.PI * Math.pow(radius, 2));
    }
    //////////////////////////////////

    public void setRadius(double radius) {
        this.radius = radius;
        square = (double) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String getType() {
        return "Circle";
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
                ", square=" + square +
                '}';
    }
}
