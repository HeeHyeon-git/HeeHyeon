package com.human.ex;

import java.util.Scanner;
import java.util.Random;
public class JavaClass02 {

	public static void main(String[] args) {
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		int randomNumber=rd.nextInt(10);
		boolean isOk=false;
		
		//잘 정리해두기
		for(int i=1;i<11;i++) {
			System.out.println("0부터 9까지의 숫자를 입력하세요.");
			System.out.println("["+i+"번째 도전]");
			int userNumber=Integer.parseInt(sc.nextLine());
			if(randomNumber>userNumber) {
				System.out.println(userNumber+" 더 큰 수 입니다.");
			}else if(randomNumber==userNumber) {
				System.out.println(i+" 번째  정답 입니다.");
				isOk=true;
				break;
			}else {
				System.out.println(userNumber+" 더 작은 수 입니다. ");
			}
		}
		if(isOk==false) {
		System.out.println("10번 안에 맞추지 못했습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
