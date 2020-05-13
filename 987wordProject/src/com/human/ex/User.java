package com.human.ex;

import java.util.*;

public class User {
	public static Random rd = new Random();
	public static int totalCount = 0;
	public String userID = null;
	public String userPW = null;
	public int userScore = 0;
	
	String typing [] = {"Cat","Puppy","Turtle","fish","Fox","Dog","Kitten","Cow","Duck","Zebra"};

	
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
		System.out.println("Score: " + "10점 만점에 "+ userScore +"점 입니다.");
		System.out.println("-----------------");
	}
	
	public void menu() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String inputString = null;
		boolean flag = true;
		
		while(flag) {
		System.out.println(this.userID + "님, 1.타자연습  2.점수 조회  3.종료 ");
		inputString = sc.nextLine();
		
		switch(inputString) {
		case "1":
			gameStart();
			break;
		case "2":
			System.out.println(this.userID + "님의 점수는 10점 만점에 " + this.userScore +" 입니다.");
			break;
		case "3":
			System.out.println("사용종료 하셨습니다.");
			flag = false;
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
	  }
	}
	public void gameStart() {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		mix();
		System.out.println("타자연습을 시작합니다 (종료:n)");
		for(int i = 0; i < typing.length; i++ ) {
			System.out.println(typing[i]);
			String userInput = sc.nextLine();
			if(typing[i].equals(userInput)) {
				score++;
			}
			if(userInput.equals("n")) {
				System.out.println("타자연습을 종료합니다.");
				break;
			}
		}
		this.userScore = this.userScore + score;
	}
	public void mix() {
		int rand;
		String temp;
		for(int i=0; i<100; i++) {
			rand = rd.nextInt(typing.length);
			temp = typing[0];
			typing[0] = typing[rand];
			typing[rand] = temp;
		}
		
	}
	
}

	

