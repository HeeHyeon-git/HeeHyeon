package com.human.ex;

import java.util.Arrays;

public class JavaStart2 {
	
//	문제1. 프로그램 초창기 만든 삼각형 세 개를 화면에 출력하는 함수  
//	선언부 이름을 각각  다음과 같이 만들고 triangle1(), triangle2(), triangle3() 각 함수를 호출해서 화면에 삼각형이 출력되도록 만들어 보자.
	public static void triangle1() { 
		System.out.println("    *\n");
		System.out.println("   ***\n");
		System.out.println("  *****\n");
		System.out.println(" *******\n");
		System.out.println("**********\n");
	}
	
	public static void triangle2() { 
		System.out.println("  *\n");
		System.out.println("  ***\n");
		System.out.println("  *****\n");
		System.out.println("  *******\n");
		System.out.println("  *********\n");
	}
	
	public static void triangle3() { 
		System.out.println("    *\n");
		System.out.println("   **\n");
		System.out.println("  ***\n");
		System.out.println(" ****\n");
		System.out.println("*****\n");
	}
//	문제2. 이전에 만든 코드를 기본으로 다음 함수들을 만들어 보자.명함을 만드는 함수를 만들고 호출에서 명함 내용을 출력해 보자.
	public static void nameCard() { 
		System.out.println("이름   : 고다온");
		System.out.println("이메일: godips1006@naver.com ");
	}
	
	
//	문제3. 배열을 매개변수로 합하여 배열내용의 합을 리턴해주는 함수를 만들어 보자.
	public static int sumArr(int arr[]){
		int sumArr=0;
		for(int i=0; i<=arr.length ;i++) {
			sumArr=sumArr+arr[i];
		}		
		return sumArr;
	}
	
//	문제4. 달력을 만드는 함수를 만들어보자 달력을 출력하는 함수를 만들어보자.
	public static void calendar(){ 
		int START_DAY=3;
		int DAYS_OF_MONTH=31;
		int day,date=0;
	
		System.out.println("==========================================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		System.out.println("==========================================================");
		for(day=0; day<START_DAY;day++) {
			System.out.print("\t");
		}
		for(date=1; date<=DAYS_OF_MONTH;date++) {
			if(day==7) {
				day=0;
				System.out.print("\n");
			}
			day++;
			System.out.print(date+"\t");
		}
		System.out.print("\n==========================================================");
	
	}
	
	public static void main(String[] args) {
	//문제 1.
		triangle1();
		triangle2();
		triangle3();
		
	//문제 2.
		nameCard();
		
	//문제 3.	
		int arr[]= {1,2,3,4};
		System.out.println(sumArr(arr));
		
	//문제 4.
		calendar();	
	}
}


