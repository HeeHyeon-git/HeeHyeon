package com.human.ex;

import java.util.*;

public class TypingGame {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	public static int totalCount = 0;
	public User [] user = new User[10];
	public int userCount = 0; 
	//�α��� ���� ������ -1, �α��� �Ǹ� �ش� �ε���
	public int userCurrent = -1;
	public TypingGame() {
		totalCount++;
	}
	public void userAdd() {
		System.out.println("���ϴ� id�� �Է��ϼ���");
		String id = sc.nextLine();
		if(isID(id)) {
			System.out.println("���̵� �ߺ��˴ϴ�.");
			return ;
		}
		System.out.println("���ϴ� ��й�ȣ�� �Է��ϼ���");
		String pw = sc.nextLine();
		user[userCount++] = new User(id,pw);
	}
	private boolean isID(String id) {
		boolean returnValue = false;
		for(int i = 0; i<userCount; i++) {
			if(user[i].userID.equals(id)) {
				returnValue = true;
			};
		}		
		return returnValue;
	}
	public void logout() {
		userCurrent = -1;
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	public boolean login(String id, String pw) {
		boolean returnValue = false;
		for(int i = 0; i < userCount; i++) {
			if(user[i].isLogin(id, pw)) {
				returnValue = true;
				userCurrent = i;
				break;
			};
		}
		return returnValue;
	}
	public void userAccount() {
		if(userCurrent != -1) {
			user[userCurrent].menu();
		}else {
			System.out.println("�߸��� �α���");
		}
	}
	public void displayAll() {
		System.out.println("��ü ���� :"+TypingGame.totalCount);
		for(int i = 0; i<userCount; i++) {
			user[i].userDisplay();
		}
	}
	public void delete(String pw) {
		delete(user[userCurrent].userID,pw);
	}
	public void delete(String id, String pw) {
		boolean flag = false;
		for(int i = 0; i < userCount; i++ ) {
			if(user[i].isLogin(id, pw)) {
			userCurrent = i;
			flag = true;
			break;
		};
	}
		if(flag) {
			for (int i = userCurrent; i+1< userCount; i++) {
				user[i] = user[i+1];
			}
			User.totalCount--;
			userCount--;
			userCurrent=-1;
			System.out.println("�����Ǿ����ϴ�.");
		}else {
			System.out.println("���� �����Ͽ����ϴ�.");
		}
}
	public void menu() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
		System.out.println("1.���� ��� 2.��� ���� ��� 3.�α���"+
							"4.�α׾ƿ� 5.�������� 6.����");
		String stringInput = sc.nextLine();
		switch(stringInput) {
		case "1":
			userAdd();
			break;
		case "2":
			displayAll();
			break;
		case "3":
			System.out.println("���̵� �Է��ϼ���");
			String id = sc.nextLine();
			System.out.println("��й�ȣ�� �Է��ϼ���");
			String pw = sc.nextLine();
			if(login(id, pw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				userAccount();
			}else {
				System.out.println("�α��ο� �����߽��ϴ�.");
			}
			break;
		case "4":
			logout();
			break;
		case "5":
			if(userCurrent != -1) {
				System.out.println("������ ��й�ȣ�� �Է��ϼ��� ");
				pw = sc.nextLine();
				delete(pw);
			}else {
				System.out.println("�α��� �ϼ���");
			}
			break;
		case "6":
			System.out.println("����Ǿ����ϴ�");
			flag = false;
			break;
		default :
			System.out.println("�߸��� �Է��Դϴ�");
		}		
	  }
	}
	
 }
