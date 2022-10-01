package Lab5.Gifka;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MainWindow extends JFrame {
    Painter painter;

        public MainWindow() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(null);

        painter = new Painter();

        for (int i = 0; i < 367; i++)
            painter.setPath("D:\\java\\Java_MIREA_2022\\src\\Lab5\\Gifka\\res\\frame_" + addLeft(i) + "_delay-0.04s.png");

        int w, h;
        w = painter.getW();
        h = painter.getH();
        setSize(w + 25, h + 50);
        painter.setBounds(5, 5, w, h);
        getContentPane().add(painter);

        setVisible(true);
    }

    private String addLeft(int num) {
        String s = String.format("%d", num);
        while (s.length() < 3)
            s = "0" + s;
        return s;
    }

    public void update(int ms) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(ms);
        painter.repaint();
    }
}
