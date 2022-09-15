package Lab4.Ball;

public class Ball {
    private double x = 0.0d;
    private double y = 0.0d;

    //////////////////////////////////
    public Ball() {}

    public Ball(double x, double y) {this.x = x; this.y = y;}
    //////////////////////////////////


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

   public void setXY(double x, double y) {
        setX(x);
        setY(y);
   }

   public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
   }
}
