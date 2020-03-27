package com.human.ex;
import java.util.*;

public class JavaStart11 {
	//p.9  사용자로부터 하나의 숫자를 입력받아 구구단을 출력하는 프로그램(함수)
	public static void mul(int a) {
		for(int i=1; i<10; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
	
	//p.10 간단한 메뉴 시스템(함수)
	public static void checkMenu(int a) {
		if(a==1) {
			System.out.println("1번 메뉴가 선택되었습니다." );
		}
		if(a==2) {
			System.out.println("2번 메뉴가 선택되었습니다." );
		}
		if(a==3) {
			System.out.println("3번 메뉴가 선택되었습니다." );
		}
		if(a==4) {
			System.out.println("종료되었습니다." );
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		//p.9  사용자로부터 하나의 숫자를 입력받아 구구단을 출력하는 프로그램
		System.out.println("하나의 숫자를 입력하세요");
		int input=Integer.parseInt(sc.nextLine());
		mul(input);
		

		//p.10 간단한 메뉴 시스템
		System.out.println(" 1.햄버거\n 2.치즈버거\n 3.샌드위치\n 4.종료");
		System.out.print(" 원하는 메뉴를 선택하시오 :");
		int inputMenu=Integer.parseInt(sc.nextLine());
		checkMenu(inputMenu);

			
		
		
		//p.11 무한 반복문을 사용하는 프로그램으로 메뉴를 출력하는 함수,
		//	정사각형의 넓이를 출력하는 함수, 원의 넓이를 출력하는 함수.
		//p.12 1~100의 수 중에서 짝수를 더하여 함수와 홀수를 더하는 함수 작성
		//p.17 저축
		
		
		
		
		
	}

}
