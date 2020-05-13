package com.human.inheritanceTest3;

public class Smartphone extends TelePhone {
	private String game = null;
	
	public Smartphone() {};
	public Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
	}
	
	public void playGame() {
		System.out.println(super.owner + "가 " + this.getGame() + " 게임을 하는 중이다.");
	}
	
	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	
}
