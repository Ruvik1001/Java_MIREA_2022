package Lab5.Shapes;

import java.util.ArrayList;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	ArrayList<Painter> painters = new ArrayList<Painter>();
	
	public MainWindow() {
		super("20 фигур");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1840, 720);
		getContentPane().setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		for (int i = 0; i < 20; i++) {
			painters.add(new Painter());
			painters.get(i).init();
			painters.get(i).setBounds((i * 184) % 1840, (i / 10) * 360, 184, 360);
			getContentPane().add(painters.get(i));
		}		
		this.setVisible(true);
	}
	
	
}
