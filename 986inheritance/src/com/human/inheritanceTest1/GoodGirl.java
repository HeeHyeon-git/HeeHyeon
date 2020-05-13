package com.human.inheritanceTest1;

public class GoodGirl extends Girl{

	public GoodGirl(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println(super.name+"는 자바를 잘 안다.");
	}
	
}
    



