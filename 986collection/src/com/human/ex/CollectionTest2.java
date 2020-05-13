package com.human.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionTest2 {

	public static void main(String[] args) {
		//객체로 map을 사용해보자.
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("삼십",30);
		hm.put("십",10);
		hm.put("사십",40);
		hm.put("오십",50);
		
		System.out.println(hm.keySet());
		System.out.println("---------------");
		
		for(String key : hm.keySet()) {
			System.out.println(key);
		}
		System.out.println("---------------");
	
		hm.remove("사십"); //값 제거
		
		Iterator<String> keys = hm.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format
					("key:%s value:%d", key, hm.get(key)));
		}
		System.out.println("----------------");
		
		hm.replace("이십",200);//값 변경
		for(String key : hm.keySet()) {
			System.out.println(String.format
					("key:%s value:%d", key, hm.get(key)));
		}
		System.out.println("사이즈" + hm.size());

	}

}
