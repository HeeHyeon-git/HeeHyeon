package com.human.ex.test1;

public class Tree extends Countable {
	String name;
	
	public Tree() {}
	public Tree(String name, int num) {
		super(name, num);
		this.name = name;
		
	}
	public void ripen() {
		System.out.println(super.num +"�׷� " + this.name+"�� ���Ű� �� �;���.");
	}
	
	@Override
	public void count() {
		System.out.println(this.name+"�� "+ super.num+ "�׷� �ִ�.");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
