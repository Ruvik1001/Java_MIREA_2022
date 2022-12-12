package lab_12.task_3;

import java.awt.*;

public class demoAnimation extends Canvas {
    Image img;
    Image img2;
    Image img3;
    public demoAnimation(Image img,Image img2,Image img3)
    {
        this.img = img;
        this.img2 = img2;
        this.img3 = img3;
    }
    public void paint(Graphics g)
    {
        if (img != null)
        {
            g.drawImage(img, 400, 100, Color.BLACK, this);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            g.drawImage(img2, 400, 100, Color.BLACK, this);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            g.drawImage(img3, 400, 100, Color.BLACK, this);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            repaint();
        }
    }


    public void setImage(Image img, Image img2, Image img3)
    {
        this.img = img;
        this.img2 = img2;
        this.img3 = img3;
    }
}
