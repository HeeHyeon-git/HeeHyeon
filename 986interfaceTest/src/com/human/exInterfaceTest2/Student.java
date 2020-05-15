package com.human.exInterfaceTest2;

public class Student implements Human {
	
	public Student(int i) {
	
	}

	public void print() {
		System.out.println("학생입니다.");
	}

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}

}
