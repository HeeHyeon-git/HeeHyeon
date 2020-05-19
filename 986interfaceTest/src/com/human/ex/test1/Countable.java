package com.human.ex.test1;

public abstract class Countable {
	protected String name = null;
	protected int num = 0;
	
	Countable(){}
	public Countable(String name , int num){
		this.name = name;
		this.num = num;
	}
	
	abstract void count();
	public abstract void fly();
	public abstract void ripen();
}
