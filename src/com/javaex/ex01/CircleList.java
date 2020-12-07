package com.javaex.ex01;

public class CircleList {
	
	//필드
	private Circle[] cArray;
	private int ccPos;
	
	//생성자
	public CircleList() {
		cArray = new Circle[3];
		ccPos = 0;
	}
	
	//메소드gs
	
	//메소드일반
	//add
	public void add(Circle c) {
		cArray[ccPos] = c;
		ccPos++;
	}
	
	//get
	public Circle get(int index) {
		return cArray[index];
	}
	
	//size
	public int size() {
		return ccPos;
	}
	
}
