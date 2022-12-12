package lab_12.task_3;

import javax.swing.*;
import java.awt.*;

public class animationLoad extends JFrame {
    Image image1;
    Image image2;
    Image image3;
    JFrame fr = new JFrame("Image loading program Using awt");
    demoAnimation demoanimation = new demoAnimation(null,null,null  );
    FileDialog fd = new FileDialog(fr, "Open", FileDialog.LOAD);
    public animationLoad(){
        setSize(500, 500);
        setLocation(200, 200);
        setBackground(Color.lightGray);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        image1 = toolkit.getImage("D:\\JavaFirstMirea\\src\\main\\java\\lab_12\\task_3\\monkey.png");
        image2 = toolkit.getImage("D:\\JavaFirstMirea\\src\\main\\java\\lab_12\\task_3\\monkey2.png");
        image3 = toolkit.getImage("D:\\JavaFirstMirea\\src\\main\\java\\lab_12\\task_3\\monkey3.png");
        demoanimation.setSize(1000,1000);
        demoanimation.setImage(image1,image2,image3);
        demoanimation.repaint();
        add(demoanimation);
    }

    public static void main(String[] args) {
        new animationLoad().show();
    }
}
