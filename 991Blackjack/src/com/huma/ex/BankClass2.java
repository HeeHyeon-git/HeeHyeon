package com.huma.ex;
import java.util.*;
public class BankClass2 {

public static int sum=0;
public static String choice="";
public static int save;
public static int draw;
public static Scanner sc = new Scanner(System.in);

public static void bankCal() { 
	while(!choice.equals("-1")) {
	System.out.println("업무를 선택하세요 1.저축   2.출금  (종료는 -1) ");
	choice=sc.nextLine();	
	switch (choice) {
	case "1":
		System.out.println("얼마나 입금하시겠습니까?");
		save=Integer.parseInt(sc.nextLine());
		sum=sum+save;
		System.out.println(save+ "을(를) 입금하셨습니다. ");
		System.out.println("총 잔액은 "+ sum + " 입니다.");
		break;
	case "2":
		System.out.println("얼마나 출금하시겠습니까?");
		draw=Integer.parseInt(sc.nextLine());
		if(draw>sum) {
			System.out.println("잔액이 부족합니다.");
		}else {
			System.out.println(draw + "을(를) 출금하셨습니다.");
			sum= sum-draw;
			System.out.println("총 잔액은  "+ sum + "입니다.");
		}
	default:
		break;
		}
	
	}
	System.out.println("프로그램이 종료됩니다.");
}

	public static void main(String[] args) {
				
	bankCal();
		
		
	}

}
