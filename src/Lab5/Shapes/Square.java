package Lab5.Shapes;

import java.awt.Color;

public class Square extends Shape {

	public Square() {
		int a = 50 + (int)(Math.random()*1234 % 50);
		int x = (int)(Math.random()*1234 % 15);
		int y = (int)(Math.random()*1234 % 15);
		int alfa = (int)(Math.random()*1234 % 150);
		this.position = new int[] {(int)(Math.random()*1234 % 15 + 5), (int)(Math.random()*1234 % 150 + 5)};
		this.vertexesX = new int[] {position[0] + x, position[0] + x + a, position[0] + x + a, position[0] + x};
		this.vertexesY = new int[] {position[1] + y, position[1] + y, position[1] + y + a, position[1] + y + a};
				
		Color[] c = { Color.BLACK, Color.BLUE, Color.GRAY, Color.PINK, color.RED };
		this.color = c[(int)(Math.random()*1234 % 5)];
		
		
	}

	@Override
	public int getVertexesCount() {
		return 4;
	}

}
