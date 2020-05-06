package com.human.ex;

public class User {
	private String userName = null;
	private int userScore = 0;
	
	public User() {}
	public User(String userName, int userScore) {
		this.userName = userName;
		this.userScore = userScore;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserScore() {
		return userScore;
	}
	public void setUserScore(int userScore) {
		this.userScore = userScore;
	}
	
}
