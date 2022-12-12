package lab_7.task_1_2_3;

import lab_6.task_5.Movable;

public  class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
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
        System.out.println("Move Up!");
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        System.out.println("Move Down!");
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        System.out.println("Move Left!");
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        System.out.println("Move Right!");
        x += xSpeed;
    }
}