package Lab4.Ball;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball();
        System.out.print(
                "Info: " + b.toString() + '\n' +
                "Set x and y coord: ");
        Scanner in = new Scanner(System.in);
        b.setXY(in.nextDouble(), in.nextDouble());
        System.out.print(
                "New x: " + b.getX() + '\n' +
                "New y: " + b.getY() + '\n' +
                "Pls, move on x and y: ");
        b.move(in.nextDouble(), in.nextDouble());
        System.out.print("New coord: " + b.toString());
    }
}
