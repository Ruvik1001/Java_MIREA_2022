package Lab3;

public class Circle {
    private float radius = 0;
    private float square = 0;

    //////////////////////////////////
    public Circle() {}

    public Circle(float radius) {
        this.radius = radius;
        square = (float) (Math.PI * Math.pow(radius, 2));
    }
    //////////////////////////////////

    public void setRadius(float radius) {
        this.radius = radius;
        square = (float) (Math.PI * Math.pow(radius, 2));
    }

    public float getRadius() {
        return radius;
    }

    public float getSquare() {
        return square;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", square=" + square +
                '}';
    }
}
