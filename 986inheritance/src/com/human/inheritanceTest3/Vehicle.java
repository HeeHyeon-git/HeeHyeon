package com.human.inheritanceTest3;

public class Vehicle {
	public String color = null;
	public int speed = 0;
	
	public Vehicle() {}
	public Vehicle(String color , int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public void show() {
		System.out.println("�� ������ " + color + "�̸�, �ִ� �ӵ��� " + speed + "�Դϴ�.");
	}
}
