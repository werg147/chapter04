package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// Set --> HashSet

		Set<Integer> iSet = new HashSet<Integer>();
		
		//Integer i01 = new Integer(3);
		//Integer i02 = new Integer(5);
		
		//Integer i03 = 3;  /박싱 
		
		//추가 add()
		iSet.add(3);
		iSet.add(5);
		iSet.add(8);
		
		//toString()
		System.out.println(iSet.toString());
		
		//size()
		System.out.println("size: " + iSet.size());
		
		//출력: 기존 for문은 사용할 수 없다.
		//다른 for문 --> 향상된 for문
		
		for( Integer i : iSet ) {
			System.out.println(i.toString());
		}
		
		System.out.println("================================");
		
		for( int i : iSet) { //언박싱된다
			System.out.println(i);
		}
		
		//삭제
		iSet.remove(3);
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("================================");
		
		//중복값 추가 (중복값 저장되지않음. 재정의 필요)
		iSet.add(5);
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("================================");
		
		iSet.add(8);
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
		
		
		
	}

}
