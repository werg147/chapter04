package com.javaex.ex03;

public class ListApp3 {

	public static void main(String[] args) {
		// 범용 objList 사용하고,
		// 메모리에 올릴때(new) 사각형 전용으로 만들어버린다.
		
		MyList<Rectangle> rList = new MyList<Rectangle>();
		
		Rectangle r01 = new Rectangle(5,5);
		Rectangle r02 = new Rectangle(10,10);
		
		rList.add(r01);
		rList.add(r02);
		
		for(int i=0; i<rList.size(); i++) {
			((Rectangle)(rList.get(i))).draw();
		}
		
		
		// 범용 objList 사용하고,
		// 메모리에 올릴때(new) 원 전용으로 만들어버린다.
		
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(6);
		Circle c02 = new Circle(7);
		
		cList.add(c01);
		cList.add(c02);
		
		for(int i=0; i<cList.size(); i++) {
			((Circle)(cList.get(i))).draw();
		}
		
		// 범용 objList 사용하고,
		// 메모리에 올릴때(new) 삼각형 전용으로 만들어버린다.
		
		MyList<Triangle> tList = new MyList<Triangle>();
		
		Triangle t01 = new Triangle(1,2);
		Triangle t02 = new Triangle(3,4);
		
		tList.add(t01);
		tList.add(t02);
		
		

	}

}
