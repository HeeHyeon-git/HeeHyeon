package com.human.ex;

import java.util.*;

public class TypingGame {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	public static int totalCount = 0;
	public User [] user = new User[10];
	public int userCount = 0; 
	//로그인 되지 않으면 -1, 로그인 되면 해당 인덱스
	public int userCurrent = -1;
	public TypingGame() {
		totalCount++;
	}
	public void userAdd() {
		System.out.println("원하는 id를 입력하세요");
		String id = sc.nextLine();
		if(isID(id)) {
			System.out.println("아이디가 중복됩니다.");
			return ;
		}
		System.out.println("원하는 비밀번호를 입력하세요");
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
		System.out.println("로그아웃 되었습니다.");
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
			System.out.println("잘못된 로그인");
		}
	}
	public void displayAll() {
		System.out.println("전체 계정 :"+TypingGame.totalCount);
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
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("삭제 실패하였습니다.");
		}
}
	public void menu() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
		System.out.println("1.계정 등록 2.모든 계정 출력 3.로그인"+
							"4.로그아웃 5.계정삭제 6.종료");
		String stringInput = sc.nextLine();
		switch(stringInput) {
		case "1":
			userAdd();
			break;
		case "2":
			displayAll();
			break;
		case "3":
			System.out.println("아이디를 입력하세요");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.nextLine();
			if(login(id, pw)) {
				System.out.println("로그인 되었습니다.");
				userAccount();
			}else {
				System.out.println("로그인에 실패했습니다.");
			}
			break;
		case "4":
			logout();
			break;
		case "5":
			if(userCurrent != -1) {
				System.out.println("삭제할 비밀번호를 입력하세요 ");
				pw = sc.nextLine();
				delete(pw);
			}else {
				System.out.println("로그인 하세요");
			}
			break;
		case "6":
			System.out.println("종료되었습니다");
			flag = false;
			break;
		default :
			System.out.println("잘못된 입력입니다");
		}		
	  }
	}
	
 }
