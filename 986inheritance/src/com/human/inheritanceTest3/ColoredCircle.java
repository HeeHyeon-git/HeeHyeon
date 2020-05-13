package com.human.inheritanceTest3;

public class ColoredCircle extends Circle {
	public String color;
	
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	
	public void show() {
		System.out.println("�������� " + super.radius + "�� " + this.color + " ���̴�.");
	}
	
}
