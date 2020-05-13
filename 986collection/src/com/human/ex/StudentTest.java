package com.human.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		//������ �л����� �����ϴ� ���α׷��� ������
		//�л� ��ü�� ���� ����, ����, ���� ������ ������ �л� ��ü�� ����� 
		//����, ����, ���� �� ������ ������� �л� ����Ʈ ����
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new Student("lee", 90, 90, 90));
		stuList.add(new Student("kim", 80, 40, 70));
		stuList.add(new Student("oh", 60, 80, 60));
		stuList.add(new Student("choi", 100, 95, 98));
		stuList.add(new Student("seo", 50, 40, 60));
		
		Collections.sort(stuList, new Comparator <Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {
				int returnValue = 0;
				if(arg0.korean > arg1.korean) {
					returnValue = -1;
				}else if(arg0.korean < arg1.korean) {
					returnValue = 1;
				}
				return  returnValue;
			}
		});
		
		System.out.println("korean Score");
		for(Student s : stuList) {
			System.out.println(s);
		}
		
		Collections.sort(stuList, new Comparator <Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				int returnValue = 0;
				if(o1.english > o2.english) {
					returnValue = -1;
				}else if(o1.english < o2.english) {
					returnValue = 1;
				}
				return returnValue;
			}
		});
		
		System.out.println("english Score");
		for(Student s : stuList) {
			System.out.println(s);
		}
		
		Collections.sort(stuList, new Comparator <Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {
				int returnValue = 0;
				if(arg0.math > arg1.math) {
					returnValue = -1;
				}else if(arg0.math < arg1.math) {
					returnValue = 1;
				}
				return returnValue;
			}
		});
		
		System.out.println("math Score");
		for(Student s : stuList) {
			System.out.println(s);
		}
		
		Collections.sort(stuList, new Comparator <Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int returnValue = 0;
				if(o1.average() > o2.average()) {
					returnValue = -1;
				}else if(o1.average() < o2.average()) {
					returnValue = 1;
				}
				return returnValue;
			}
			
		});
		
		System.out.println("average");
		for(Student s : stuList) {
			System.out.println(s);
		}
	
}

}
