package com.javaex.ex03;

public class MyList<T> {
	
	//필드
	private T[] oArray;
	private int coPos;
	
	//생성자
	public MyList() {
		oArray = (T[])(new Object[3]); //T의 배열로 형변환
		coPos = 0;
	}
	
	//메소드 gs
	
	//메소드일반
	public void add(T o) {
		oArray[coPos] = o;
		coPos++;
	}
	
	public T get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return coPos;
	}
	
}
