package Lab5.Gifka;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Painter extends JComponent {
    private String path;
    private ArrayList<BufferedImage> img = new ArrayList<BufferedImage>();
    private int i = 0;

    public void setPath(String path) {
        this.path = path;
        try {
            img.add(ImageIO.read(new File(path)));
        } catch (IOException e) {
            System.out.print("\n\n" + path + "\n\n");
            throw new RuntimeException(e);
        }
        System.out.println(img.size());
    }
    public int getH() {
        return img.get(0).getHeight();
    }

    public int getW() {
        return img.get(0).getWidth();
    }

    public void paint(Graphics g) {
        g.drawImage(img.get(i%img.size()),0, 0, null);
        i++;
    }


}
