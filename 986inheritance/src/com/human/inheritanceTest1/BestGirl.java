package com.human.inheritanceTest1;

public class BestGirl extends GoodGirl {

	public BestGirl(String name) {
		super(name);
	}
	public void show() {
		System.out.println(super.name + "는 자바를 무지하게 잘 안다.");
	}
	
}
