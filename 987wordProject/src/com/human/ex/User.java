package com.human.ex;

public class User {
	public static int totalCount = 0;
	public String userID = null;
	public String userPW = null;
	public int userScore = 0;
	
	public User() {
		totalCount++;
	}
	public User(String userID, String userPW) {
		this();
		this.userID = userID;
		this.userPW = userPW;
	}

	public boolean isLogin(String userID, String userPW) {
		boolean returnValue = false;
		
		if(this.userID.equals(userID)&&this.userPW.equals(userPW)) {
			returnValue = true;
		}
		return returnValue;
	}
	
	public void userDisplay() {
		System.out.println("--------------");
		System.out.println("�� ���� ���� : " + User.totalCount);
		System.out.println("Id : " + userID);
		System.out.println("Score: " + userScore);
		System.out.println("-----------------");
	}
	
	public void score(int userScore) {
		this.userScore = this.userScore + userScore;
	}
	
	public void menu() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String inputMenu = null;
		
		System.out.println(this.userID +": 1.�ѱ�Ÿ�� ���� 2.����Ÿ�� ���� 3.���� ");
		inputMenu = sc.nextLine();
		
		switch(inputMenu) {
		case "1":
			System.out.println("�ѱ�Ÿ�� ������ �����մϴ�.");
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
