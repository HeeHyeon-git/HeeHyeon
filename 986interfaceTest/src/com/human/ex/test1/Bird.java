package com.human.ex.test1;

public class Bird extends Countable {
	String name;
	
	public Bird() {}
	public Bird(String name, int num) {
		super(name,num);
		this.name = name;
	}
	
	public void count() {
		System.out.println(this.name+"가 "+ super.num +"마리 있다.");
	}
	public void fly() {
		System.out.println(super.num+"마리 "+this.name+"가 날아간다.");
	}
	@Override
	public void ripen() {
		// TODO Auto-generated method stub
		
	}

}
