package com.human.exInterfaceTest2;

public abstract class Controller {
	boolean power;
	
	public Controller (boolean power) {
		this.power = power;
	}
	
	public void show() {
		if(power) {
			System.out.println(getName() + "가 켜졌습니다.");
		}else {
			System.out.println(getName() + "가 꺼졌습니다.");
		}
	}

	protected abstract String getName();
	
}
 