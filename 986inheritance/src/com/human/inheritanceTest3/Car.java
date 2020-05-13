package com.human.inheritanceTest3;

public class Car extends Vehicle {
	public int displacement = 0;
	public int gears = 0;
	
	public Car() {}
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
		
	}
	@Override
	public void show() {
		System.out.println("�� ������ " + super.color + "�̸�, "
				+ "�ִ� �ӵ��� " + super.speed + " �̸�, ��ⷮ�� "+ this.displacement+ " �̸�, "
						+ "���ܼ���  "+ this.gears+ "�� �Դϴ�.");
	}
}
