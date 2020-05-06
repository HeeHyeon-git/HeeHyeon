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
		System.out.println("총 계정 수는 : " + User.totalCount);
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
		
		System.out.println(this.userID +": 1.한글타자 연습 2.영어타자 연습 3.종료 ");
		inputMenu = sc.nextLine();
		
		switch(inputMenu) {
		case "1":
			System.out.println("한글타자 연습을 시작합니다.");
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
