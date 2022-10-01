package Lab6.Movable;

public class MovablePoint implements Movable {
    int x = 0;
    int y = 0;
    int xSpeed = 0;
    int ySpeed = 0;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        xSpeed = 0;
        ySpeed++;
    }

    @Override
    public void moveDown() {
        xSpeed = 0;
        ySpeed--;
    }

    @Override
    public void moveLeft() {
        ySpeed = 0;
        xSpeed--;
    }

    @Override
    public void moveRight() {
        ySpeed = 0;
        xSpeed++;
    }
}
