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
		System.out.println("�� ���� ���� : " + User.totalCount);
		System.out.println("Id : " + userID);
		System.out.println("Score: " + "10�� ������ "+ userScore +"�� �Դϴ�.");
		System.out.println("-----------------");
	}
	
	public void menu() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String inputString = null;
		boolean flag = true;
		
		while(flag) {
		System.out.println(this.userID + "��, 1.Ÿ�ڿ���  2.���� ��ȸ  3.���� ");
		inputString = sc.nextLine();
		
		switch(inputString) {
		case "1":
			gameStart();
			break;
		case "2":
			System.out.println(this.userID + "���� ������ 10�� ������ " + this.userScore +" �Դϴ�.");
			break;
		case "3":
			System.out.println("������� �ϼ̽��ϴ�.");
			flag = false;
			break;
		default :
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	  }
	}
	public void gameStart() {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		mix();
		System.out.println("Ÿ�ڿ����� �����մϴ� (����:n)");
		for(int i = 0; i < typing.length; i++ ) {
			System.out.println(typing[i]);
			String userInput = sc.nextLine();
			if(typing[i].equals(userInput)) {
				score++;
			}
			if(userInput.equals("n")) {
				System.out.println("Ÿ�ڿ����� �����մϴ�.");
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

	

