package com.huma.ex;
import java.util.*;
public class BankClass {
	
public static void bankCal() {
	int sum=0;
	int choice=0;
	Scanner sc = new Scanner(System.in);
	while (!(choice==-1)) {
		System.out.println("메뉴를 선택하세요 1.저축 2.출금 (종료는 -1)");
		choice=Integer.parseInt(sc.nextLine());
	switch (choice) {
	case 1:
		System.out.println("얼마나 저축하시겠습니까?");
		int save=Integer.parseInt(sc.nextLine());
		sum=sum+save;
		System.out.println("총 잔액은  "+ sum +" 입니다.");
		break;
	case 2: 
		System.out.println("얼마나 출금하시겠습니까?");
		int draw=Integer.parseInt(sc.nextLine());
		if(draw>sum) {
			System.out.println("잔액이 부족합니다.");
		}else {
			sum=sum=draw;
			System.out.println("총 잔액은 " +(sum-draw)+ " 입니다. ");
		}
	default:
	break;
	}
	
}
	System.out.println("프로그램을 종료합니다.");
}


	public static void main(String[] args) {
		
		bankCal();
		
//	Scanner sc = new Scanner(System.in);
//		int sum=0;
//		int choice=0;
//		while (!(choice==-1)) {
//			System.out.println("메뉴를 선택하세요 1.저축 2.출금 (종료는 -1)");
//			choice=Integer.parseInt(sc.nextLine());
//		switch (choice) {
//		case 1:
//			System.out.println("얼마나 저축하시겠습니까?");
//			int save=Integer.parseInt(sc.nextLine());
//			sum=sum+save;
//			System.out.println("총 잔액은  "+  sum +" 입니다.");
//			break;
//		case 2: 
//			System.out.println("얼마나 출금하시겠습니까?");
//			int draw=Integer.parseInt(sc.nextLine());
//			if(draw>sum) {
//				System.out.println("잔액이 부족합니다.");
//			}else {
//				System.out.println("총 잔액은 " +(sum-draw)+ " 입니다. ");
//			}
//
//		default:
//		break;
//		}
//		
//	}
//		System.out.println("프로그램을 종료합니다.");
//		
//		
//		
		
	}

}
