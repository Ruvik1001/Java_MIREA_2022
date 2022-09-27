package Lab5.OpenImage;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Painter extends JComponent {
	private String path;
	private BufferedImage img;
	public void setPath(String path) {
		this.path = path;
		try {
			img = ImageIO.read(new File(path));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public int getH() {
		return img.getHeight();
	}

	public int getW() {
		return img.getWidth();
	}

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);

	}
}
