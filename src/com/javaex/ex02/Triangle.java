package com.javaex.ex02;

public class Triangle {
	
	private int width;
	private int height;
	
	public Triangle() {}
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("삼각형(밑변=" + width + ", 높이=" + height + ")을 그렸습니다.");
	}
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	

}
