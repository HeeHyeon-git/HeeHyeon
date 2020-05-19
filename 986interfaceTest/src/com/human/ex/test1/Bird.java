package com.human.ex.test1;

public class Bird extends Countable {
	String name;
	
	public Bird() {}
	public Bird(String name, int num) {
		super(name,num);
		this.name = name;
	}
	
	public void count() {
		System.out.println(this.name+"�� "+ super.num +"���� �ִ�.");
	}
	public void fly() {
		System.out.println(super.num+"���� "+this.name+"�� ���ư���.");
	}
	@Override
	public void ripen() {
		// TODO Auto-generated method stub
		
	}

}
