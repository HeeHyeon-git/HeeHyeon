package com.human.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class collectionTest {

	public static void main(String[] args) {
		//����
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		//Integer: ����, wrapper Ŭ����
		//double, cat ������ �� Ŭ����, wrapper Ŭ����
	
		//�߰�
		arrList.add(40);
		arrList.add(30);
		arrList.add(20);
		arrList.add(10);
		
		//get���� Ȯ��, �ε����� ��ã��
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("--------------------");
		
		//����, remove
//		arrList.remove(1); //�ε����� ����, Integer 30�� ����
//		for(int i :arrList) {
//			System.out.println(i);
//		}
//		System.out.println("-----------------");
//		arrList.remove((Integer)10); //������ �� 10 ����, true�� ����
//		for(int i :arrList) {
//			System.out.println(i);
//		}
//		System.out.println("-----------------");
//		
		//����
		Collections.sort(arrList);
		Iterator<Integer> iter = arrList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//�˻�: ã�� �������� ��ġ ����, Index of
		System.out.println("-------------");
		
		int index = arrList.indexOf((Integer)10);
		System.out.println(index);
		index = arrList.indexOf(20);
		System.out.println(index);
		
		System.out.println("-------------");
		
		//������ ���� ����: contain
		System.out.println(arrList.contains(20));
		System.out.println("-------------");
		
		//��ü �־ �����ϱ�.

		
	}
}
