package Lab2;

public class Ball {
    private float radius = (float) 0.15; //in metre
    private float pressure = (float) 0.55; //in bar

    //////////////////////////////////
    public Ball() {}

    public Ball(float radius) { this.radius = radius; }

    public Ball(float radius, float pressure) {
        this.radius = radius;
        this.pressure = pressure;
    }
    //////////////////////////////////

    public float getPressure() { return pressure; }
    public float getRadius() { return radius; }

    public void setPressure(float pressure) { this.pressure = pressure; }
    public void setRadius(float radius) { this.radius = radius; }

    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", pressure=" + pressure +
                '}';
    }
}