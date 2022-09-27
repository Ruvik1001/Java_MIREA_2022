package Lab5.Shapes;

import java.awt.Color;

public abstract class Shape {
	protected Color color = Color.BLACK;
	protected int[] position = new int[]{0, 0};
	protected int[] vertexesX;
	protected int[] vertexesY;
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int[] getPosition() {
		return position;
	}
	public void setPosition(int[] position) {
		this.position = position;
	}
	
	public int[] getVertexesX() {
		return vertexesX;
	}
	public void setVertexesX(int[] vertexesX) {
		this.vertexesX = vertexesX;
	}
	public int[] getVertexesY() {
		return vertexesY;
	}
	public void setVertexesY(int[] vertexesY) {
		this.vertexesY = vertexesY;
	}
	public abstract int getVertexesCount();
}
