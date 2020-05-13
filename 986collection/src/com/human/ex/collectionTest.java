package com.human.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class collectionTest {

	public static void main(String[] args) {
		//선언
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		//Integer: 정수, wrapper 클래스
		//double, cat 넣으면 그 클래스, wrapper 클래스
	
		//추가
		arrList.add(40);
		arrList.add(30);
		arrList.add(20);
		arrList.add(10);
		
		//get으로 확인, 인덱스로 값찾기
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("--------------------");
		
		//삭제, remove
//		arrList.remove(1); //인덱스로 삭제, Integer 30이 리턴
//		for(int i :arrList) {
//			System.out.println(i);
//		}
//		System.out.println("-----------------");
//		arrList.remove((Integer)10); //데이터 값 10 삭제, true가 리턴
//		for(int i :arrList) {
//			System.out.println(i);
//		}
//		System.out.println("-----------------");
//		
		//정렬
		Collections.sort(arrList);
		Iterator<Integer> iter = arrList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//검색: 찾는 데이터의 위치 리턴, Index of
		System.out.println("-------------");
		
		int index = arrList.indexOf((Integer)10);
		System.out.println(index);
		index = arrList.indexOf(20);
		System.out.println(index);
		
		System.out.println("-------------");
		
		//데이터 존재 유무: contain
		System.out.println(arrList.contains(20));
		System.out.println("-------------");
		
		//객체 넣어서 구현하기.

		
	}
}
