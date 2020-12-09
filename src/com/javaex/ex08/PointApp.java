package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		// HashMap 사용하기
		// <키, 값> 으로 저장
		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p01 = new Point(1, 1);
		Point p02 = new Point(2, 2);
		Point p03 = new Point(3, 3);
		Point p04 = new Point(4, 4);

		pMap.put("박명수", p01);
		pMap.put("유재석", p02);
		pMap.put("정준하", p03);
		pMap.put("이효리", p04);

		System.out.println(pMap.toString());

		System.out.println(pMap.get("유재석").getX());
		System.out.println(pMap.get("박명수").getY());

		Point p05 = new Point(5, 5); // 위의 박명수값 덮어씀
		pMap.put("박명수", p05);

		System.out.println(pMap.toString());
		
		System.out.println("갯수" + pMap.size());

		// Map에서 key값은 Set으로 관리되고 있다.
		Set<String> keys = pMap.keySet();
		for(String key : keys) {
			System.out.println(pMap.get(key));
			System.out.println(pMap.get(key).getX());
		}
		
		
	}

}
