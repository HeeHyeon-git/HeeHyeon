package com.human.ex;

import java.util.Random;

public class TypingGame {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	public String korea[] = 
		{"����","��⵵","��õ","������","�泲","���","����","����","�泲","���","����","����"};
	public String english[] = 
		{"America","Brazil","Canada","Denmark","Egypt","Finland","Germany","HongKong"};
	
	public TypingGame() {}
	public TypingGame(String setUserName) {}
	public void gameStart() {
		String userInputName = null;
		String userMenu = null;
		System.out.println("TypingGame�� �����Ͻñ� ���� ���̵�� �н����带 �Է��Ͻÿ�");
		userInputName = sc.nextLine();
		System.out.println("1.�ѱ� ����  2.���� ����  3.����");
		userMenu = sc.nextLine();
		
		switch(userMenu) {
		case "1" : 
			System.out.println("�ѱۿ����� �����մϴ�.");
			gameStartKorea();
			break;
		case "2" : 
			System.out.println("������� �����մϴ�.");
			gameStartEnglish();
			break;
		case "3" :
			System.out.println("������ �����մϴ�.");
			break;
		default :
			System.out.println("�߸��� �Է��Դϴ�.");
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
