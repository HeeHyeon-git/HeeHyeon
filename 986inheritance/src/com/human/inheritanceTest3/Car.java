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
		System.out.println("차 색상은 " + super.color + "이며, "
				+ "최대 속도는 " + super.speed + " 이며, 배기량은 "+ this.displacement+ " 이며, "
						+ "기어단수는  "+ this.gears+ "단 입니다.");
	}
}
