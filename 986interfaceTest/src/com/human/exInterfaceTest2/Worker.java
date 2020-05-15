package com.human.exInterfaceTest2;

public class Worker implements Human {

	public void print() {
		System.out.println("인간입니다.");
	}
	
	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
		
	}

	
}
