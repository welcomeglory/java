package com.fxmx.simple;
public class Rectangle {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		setWidth(width);
		setHeight(height);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if (width < 0) { 
			width = 0;
			return; 
		}
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if (height < 0) { 
			height = 0;
			return; 
		}
		this.height = height;
	}
	public int getArea() {
		return width * height;
	}
}



