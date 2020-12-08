package com.javaex.ex04;

import java.util.ArrayList; //컨트롤+쉬프트+o
import java.util.LinkedList;

public class ListApp {
	
	public static void main(String[] args) {
		
		//ArrayList 사용 + Rectangle
		
		ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		
		Rectangle r01 = new Rectangle(3,3);
		Rectangle r02 = new Rectangle(4,4);
		
		//add()
		rList.add(r01);
		rList.add(r02);
		
		//get()
		Rectangle r = rList.get(0);
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		r.draw();
		System.out.println(r.toString());
		
		//size()
		System.out.println(rList.size());
		
		Rectangle r03 = new Rectangle(100,100);
		rList.add(0, r03);
		
		//전체출력 get(), size()이용
		for(int i=0; i<rList.size(); i++) {
			(rList.get(i)).draw();
		}
		
		System.out.println("============================================");
		
		//삭제 remove()
		rList.remove(0); //0번째
		
		for(int i=0; i<rList.size(); i++) {
			(rList.get(i)).draw();
		}
		
		System.out.println("============================================");
		rList.remove(r02);
		
		//전체출력 get(), size()이용
		for(int i=0; i<rList.size(); i++) {
			(rList.get(i)).draw();
		}
		
		/////////////////////////////////////////////////////////////////
		//원
		System.out.println("원==========================================");
		//ArrayList<Circle> cList = new ArrayList<Circle>();
		LinkedList<Circle> cList = new LinkedList<Circle>();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(4);
		
		cList.add(c01);
		cList.add(c02);
		//cList.add(r01); 사각형사용x
		
		for(int i=0; i<cList.size(); i++) {
			(cList.get(i)).draw();
		}
	
		
		
		
		
	}

}
