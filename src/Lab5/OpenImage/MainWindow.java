package Lab5.OpenImage;

import java.awt.*;

import javax.swing.*;

public class MainWindow extends JFrame {
	public MainWindow(String path) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(720, 640);
//		this.setResizable(false);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		Painter painter = new Painter();
		painter.setPath(path);
		int w, h;
		w = painter.getW();
		h = painter.getH();
		painter.setBounds(5, 5, w, h);
		getContentPane().add(painter);

		this.setVisible(true);


	}
}
