package com.human.inheritanceTest3;

public class Phone {
	protected String owner = null;
	
	Phone(){}
	Phone(String owner){
		this.owner = owner;
	}
	
	public void talk() {
		System.out.println(this.owner + "�� ��ȭ���̴�.");
	}
	public void autoAnswering() {
		
	}
	public void playGame() {
		
	}
	

}
