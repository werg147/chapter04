package com.javaex.ex02;

public class ObjList {
	
	//필드
	private Object[] oArray;
	private int coPos;
	
	//생성자
	public ObjList() {
		oArray = new Object[3];
		coPos = 0;
	}
	
	//메소드 gs
	
	//메소드일반
	public void add(Object o) {
		oArray[coPos] = o;
		coPos++;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return coPos;
	}
	
}

