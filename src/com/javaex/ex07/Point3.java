package com.javaex.ex07;

public class Point3 {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point3() {
	}

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 gs

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 일반메소드
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + x;
		result = prime * result + y;
		System.out.println(x + "," + y + "\t" + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //if문 내용이 한줄이면 괄호 생략가능..{}
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point3 other = (Point3) obj;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
