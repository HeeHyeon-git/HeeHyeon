package com.human.ex;

import java.util.Random;

public class TypingGame {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	public String korea[] = 
		{"서울","경기도","인천","강원도","충남","충북","전남","전북","경남","경북","제주","독도"};
	public String english[] = 
		{"America","Brazil","Canada","Denmark","Egypt","Finland","Germany","HongKong"};
	
	public TypingGame() {}
	public TypingGame(String setUserName) {}
	public void gameStart() {
		String userInputName = null;
		String userMenu = null;
		System.out.println("TypingGame을 시작하시기 전에 아이디와 패스워드를 입력하시오");
		userInputName = sc.nextLine();
		System.out.println("1.한글 연습  2.영어 연습  3.종료");
		userMenu = sc.nextLine();
		
		switch(userMenu) {
		case "1" : 
			System.out.println("한글연습을 시작합니다.");
			gameStartKorea();
			break;
		case "2" : 
			System.out.println("영어연습을 시작합니다.");
			gameStartEnglish();
			break;
		case "3" :
			System.out.println("게임을 종료합니다.");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	public String gameStartEnglish() {
		Random kRandom = new Random();
		int krandNum = kRandom.nextInt(korea.length);
		
		return korea[krandNum];
	}
	
	public String gameStartKorea() {
		Random eRandom = new Random();
		int erandNum = eRandom.nextInt(korea.length);
		return english[erandNum]; 
	}
	
}
