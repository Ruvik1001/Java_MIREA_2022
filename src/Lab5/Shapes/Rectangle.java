package Lab5.Shapes;

import java.awt.Color;

public class Rectangle extends Shape {

	public Rectangle() {
		int a = 10 + (int)(Math.random()*1234 % 70);
		int x = (int)(Math.random()*1234 % 15);
		int y = (int)(Math.random()*1234 % 15);
		this.position = new int[] {(int)(Math.random()*1234 % 15 + 5), (int)(Math.random()*1234 % 150 + 5)};
		this.vertexesX = new int[] {position[0] + x, position[0] + x + 2 * a, position[0] + x + 2 * a, position[0] + x };
		this.vertexesY = new int[] {position[1] + y, position[1] + y, position[1] + y + a, position[1] + y + a};
		
		Color[] c = { Color.BLACK, Color.BLUE, Color.GRAY, Color.PINK, color.RED };
		this.color = c[(int)(Math.random()*1234 % 5)];
		
	}

	@Override
	public int getVertexesCount() {
		return 4;
	}

}
