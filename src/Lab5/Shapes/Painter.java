package Lab5.Shapes;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JComponent;

public class Painter extends JComponent {
	private ArrayList<Shape> s = new ArrayList<Shape>();
	
	public void init() {
		int index = (int)(Math.random() * 1234 % 3);
		Shape[] t = new Shape[]{new Square(), new Triangle(), new Rectangle()}; 
		s.add(t[index]);			
	
	}
	
	public void paint(Graphics g) {
		for (Shape t : s ) {
			g.setColor(t.getColor());
			g.fillPolygon(t.getVertexesX(), t.vertexesY, t.getVertexesCount());
		}
	}
	

}
