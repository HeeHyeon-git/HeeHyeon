package com.human.exInterfaceTest2;

public abstract class Controller {
	boolean power;
	
	public Controller (boolean power) {
		this.power = power;
	}
	
	public void show() {
		if(power) {
			System.out.println(getName() + "�� �������ϴ�.");
		}else {
			System.out.println(getName() + "�� �������ϴ�.");
		}
	}

	protected abstract String getName();
	
}
 