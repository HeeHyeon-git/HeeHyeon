package com.human.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionTest2 {

	public static void main(String[] args) {
		//��ü�� map�� ����غ���.
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("���",30);
		hm.put("��",10);
		hm.put("���",40);
		hm.put("����",50);
		
		System.out.println(hm.keySet());
		System.out.println("---------------");
		
		for(String key : hm.keySet()) {
			System.out.println(key);
		}
		System.out.println("---------------");
	
		hm.remove("���"); //�� ����
		
		Iterator<String> keys = hm.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format
					("key:%s value:%d", key, hm.get(key)));
		}
		System.out.println("----------------");
		
		hm.replace("�̽�",200);//�� ����
		for(String key : hm.keySet()) {
			System.out.println(String.format
					("key:%s value:%d", key, hm.get(key)));
		}
		System.out.println("������" + hm.size());

	}

}
