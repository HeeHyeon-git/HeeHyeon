package com.human.ex.test1;

public class Tree extends Countable {
	String name;
	
	public Tree() {}
	public Tree(String name, int num) {
		super(name, num);
		this.name = name;
		
	}
	public void ripen() {
		System.out.println(super.num +"그루 " + this.name+"에 열매가 잘 익었다.");
	}
	
	@Override
	public void count() {
		System.out.println(this.name+"가 "+ super.num+ "그루 있다.");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
