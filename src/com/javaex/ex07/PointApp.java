package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		System.out.println("중복 Point 입력테스트 ================================");
		Set<Point> pSet = new HashSet<Point>();

		Point p01 = new Point(1, 1);
		Point p02 = new Point(2, 2);
		Point p03 = new Point(3, 3);
		Point p04 = new Point(1, 1);

		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04); // 중복체크안됨.

		System.out.println(pSet.toString());
		System.out.println(pSet.size());

		// hashCode() equals() 이용 중복체크
		Set<Point2> pSet2 = new HashSet<Point2>();
		Point2 p21 = new Point2(1, 1);
		Point2 p22 = new Point2(2, 2);
		Point2 p23 = new Point2(3, 3);
		Point2 p24 = new Point2(1, 1);

		pSet2.add(p21);
		pSet2.add(p22);
		pSet2.add(p23);
		pSet2.add(p24); // 중복체크됨.

		System.out.println(pSet2.toString());

		System.out.println("========================================================");

		Set<Point3> pSet3 = new HashSet<Point3>();
		//해시코드가 같을때, y값이 같으면 중복

		Point3 p31 = new Point3(1, 1);
		Point3 p32 = new Point3(2, 2);
		Point3 p33 = new Point3(3, 3);
		Point3 p34 = new Point3(5, 1);

		pSet3.add(p31);
		pSet3.add(p32);
		pSet3.add(p33);
		pSet3.add(p34);

		System.out.println(pSet3.toString());
	}

}
