package Lab4_1.Shapes;

public class Square extends Shape{
        public double a = 0;

    //////////////////////////////////
    public Square() {}

    public Square(double a) {
        this.a = a;
    }
    //////////////////////////////////

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                '}';
    }
}
