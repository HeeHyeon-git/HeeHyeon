package com.human.exInterfaceTest2;

public class Student implements Human {
	
	public Student(int i) {
	
	}

	public void print() {
		System.out.println("�л��Դϴ�.");
	}

	@Override
	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�.");
	}

}
