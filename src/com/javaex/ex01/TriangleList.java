package com.javaex.ex01;

public class TriangleList {

	//필드
	private Triangle[] tArray;
	private int ctPos;
	
	//생성자
	public TriangleList() {
		tArray = new Triangle[4];
		ctPos = 0;
	}
	
	//메소드gs
	
	//메소드일반
	//add
	public void add(Triangle t) {
		tArray[ctPos] = t;
		ctPos++;
	}
	
	//get
	public Triangle get(int index) {
		return tArray[index];
	}
	
	//size
	public int size() {
		return ctPos;
	}
	
	
}
