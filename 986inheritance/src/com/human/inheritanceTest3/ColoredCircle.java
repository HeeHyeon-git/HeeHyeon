package com.human.inheritanceTest3;

public class ColoredCircle extends Circle {
	public String color;
	
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	
	public void show() {
		System.out.println("반지름이 " + super.radius + "인 " + this.color + " 원이다.");
	}
	
}
