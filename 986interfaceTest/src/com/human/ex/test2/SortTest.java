package com.human.ex.test2;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) {
		System.out.println("���� ����� �����ϼ���.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch;
		Sort sort = null;
		try {
			ch = System.in.read();
		
			if(ch == 'B' || ch =='b') {
				sort = new BubbleSort();
			}
			else if(ch == 'H' || ch == 'h') {
				sort = new HeapSort();
			}
			else if(ch == 'Q' || ch == 'q') {
				sort = new QuickSort();
			}
			else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
				return;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int [] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}
}
