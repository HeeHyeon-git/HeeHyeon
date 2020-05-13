package com.human.inheritanceTest3;

public class Circle {
	public int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public void show() {
		System.out.println("반지름이 " + this.radius + "인 원이다.");
	}
	
}
