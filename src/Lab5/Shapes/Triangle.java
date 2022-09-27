package Lab5.Shapes;

import java.awt.Color;

public class Triangle extends Shape {

	public Triangle() {
		int a = 40 + (int)(Math.random()*1234 % 40);
		int x = (int)(Math.random()*1234 % 15);
		int y = (int)(Math.random()*1234 % 150);
		this.position = new int[] {(int)(Math.random()*1234 % 15 + 5), (int)(Math.random()*1234 % 150 + 5)};
		this.vertexesX = new int[] {position[0] + x, position[0] + x + a/2, position[0] + x + 2*a};
		this.vertexesY = new int[] {position[1] + y, position[1] + y - a/2, position[1] + y};
		
		Color[] c = { Color.BLACK, Color.BLUE, Color.GRAY, Color.PINK, color.RED };
		this.color = c[(int)(Math.random()*1234 % 5)];
	
	}

	@Override
	public int getVertexesCount() {
		return 3;
	}

}
