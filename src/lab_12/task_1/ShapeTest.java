package lab_12.task_1;

import javax.swing.*;
import java.awt.*;

public class ShapeTest extends JFrame{
    public ShapeTest(){
        setSize(1300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String a[]){
        new ShapeTest();
    }

    public void paint(Graphics graphics){
        graphics.setColor(Color.RED);
        graphics.fillRect(10, 50, 100, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(10, 50, 100, 100);
        graphics.setColor(Color.BLUE);
        graphics.fillOval(120, 50, 100, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(120, 50, 100, 100);
        graphics.setColor(Color.CYAN);
        graphics.fillRect(230, 50, 150, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(230, 50, 150, 100);
        graphics.setColor(Color.GREEN);
        graphics.fillArc(400, 50, 110, 100, 5, 150);
        graphics.setColor(Color.BLACK);
        graphics.drawArc(400, 50, 110, 100, 5, 150);
        graphics.setColor(Color.MAGENTA);
        graphics.fillRect(520, 50, 100, 150);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(520, 50, 100, 150);
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(630, 50, 150, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(630, 50, 150, 100);
        graphics.setColor(Color.PINK);
        graphics.fillOval(820, 100, 100, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(820, 100, 100, 100);
        graphics.setColor(Color.PINK);
        graphics.fillOval(810, 60, 50, 50);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(810, 60, 50, 50);
        graphics.setColor(Color.PINK);
        graphics.fillOval(880, 60, 50, 50);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(880, 60, 50, 50);
        graphics.setColor(Color.lightGray);
        graphics.fillOval(950, 50, 100, 150);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(950, 50, 100, 150);
        graphics.setColor(Color.darkGray);
        graphics.fillRect(1100, 50, 150, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(1100, 50, 150, 100);

        graphics.setColor(Color.lightGray);
        graphics.fillRect(10, 250, 100, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(10, 250, 100, 100);
        graphics.setColor(Color.black);
        graphics.fillOval(120, 250, 100, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(120, 250, 100, 100);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(230, 250, 150, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(230, 250, 150, 100);
        graphics.setColor(Color.darkGray);
        graphics.fillArc(400, 250, 110, 100, 5, 150);
        graphics.setColor(Color.BLACK);
        graphics.drawArc(400, 250, 110, 100, 5, 150);
        graphics.setColor(Color.RED);
        graphics.fillRect(520, 250, 100, 150);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(520, 250, 100, 150);
        graphics.setColor(Color.PINK);
        graphics.fillOval(630, 250, 150, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(630, 250, 150, 100);
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(820, 280, 100, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(820, 280, 100, 100);
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(810, 240, 50, 50);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(810, 240, 50, 50);
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(880, 240, 50, 50);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(880, 240, 50, 50);
        graphics.setColor(Color.BLUE);
        graphics.fillOval(950, 250, 100, 150);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(950, 250, 100, 150);
        graphics.setColor(Color.MAGENTA);
        graphics.fillRect(1100, 250, 150, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(1100, 250, 150, 100);
    }
}