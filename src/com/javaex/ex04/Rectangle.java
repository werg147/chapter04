package com.javaex.ex04;

public class Rectangle {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	//메소드 gs
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
	
	//메소드일반
	public void draw() {
		System.out.println("사각형(가로=" + width + ", 세로=" + height + ")을 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
}
