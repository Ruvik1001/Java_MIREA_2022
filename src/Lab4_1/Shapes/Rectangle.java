package Lab4_1.Shapes;

public class Rectangle extends Shape {
    private double a = 0d;
    private double b = 0d;

    //////////////////////////////////
    public Rectangle() {}

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    //////////////////////////////////

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getPerimeter() {
        return 2* (a + b);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
