package com.human.ex;
import java.util.*;
public class JavaStart {
	//1. 메소드의 지역변수는 메소드가 실행되면 stack에 올라간다.
	//2. 메소드간 지역변수는 공유되지 않는다.
	//3. 메소드가 종료되면 메모리에서 사라진다.
	//4. 코드블럭의 지역변수는 코드블럭이 종료되면 사라진다.
	
	//문제 1. 사칙연산을 실행하는 min, mul, div 함수를 만들어서 사용해보자.
	public static int sum(int a, int b) { 
		int sum=0;
		sum=a+b;
		return sum;
	}
	public static int min(int a, int b) {
		int min=0;
		min=a-b;
		return min;
	}
	public static int mul(int a, int b) {
			
		int mul=0;
		mul=a*b;
		return mul;
	}	
	public static int div(int a, int b) {
		int div=0;
		div=a/b;
		return div;
	}	
		//리턴 밑에는 sum=sum+1 같은 코드 올 수 없음 
		//실행 종료된 것이기 때문에
	
	//문제 2. 매개변수와 리턴 값이 없는 함수를 이용해서 "안녕하세요" 이라는 내용을  
	//		함수 hello를 만들고 프로그램 시작을 의미하는 메인함수에서 헬로 함수를출력하는 여러번 호출하여
	//		"안녕하세요"를 출력하는 프로그램을 만들어 사용해 보자.

	public static void hello() {
		System.out.println("안녕하세요");
	}	
	
	//문제 3. 두 수 사이의 합을 구하는 함수를 만들어 사용해보자.
	public static int gap(int a, int b) {
		int sum=0;
		if(a>b) {
			int temp;
			temp=a;
			a=b;
			b=temp;
		}//b가 항상 큰 수가 됨. a를 b로 교환했으닌까.
		for(int i=a; i<=b; i++) {//초기화 값 안쓰면 바로 조건으로 감.
			sum=sum+i;
		}
		return sum;
	}	
	
	
	public static void main(String[] args) {
	//문제 1.
		int a=sum(1,2);
		int b=a+sum(2,2);
		System.out.println(a+b);
	
		a=0;b=0;
		a=min(3,1);
		b=min(10,5);
		System.out.println(a+ "," +b);
		
		a=0;b=0;
		a=mul(1,4);
		b=mul(2,2);
		System.out.println(a+ "," +b);
		
		System.out.println(mul(1,2));
		
		
		a=0;b=0;
		a=div(4,2);
		b=div(6,2);
		System.out.println(a+ "," +b);
		
	//문제 2.
		hello();
		hello();
		hello();
		for(int i=0;i<3;i++) {
			hello();
		}
		
	//문제 3.
		a=10; b=12;
		//간단하게 아래와 같이 수식 가능.
		System.out.println(gap(a,b));
		System.out.println(gap(5,12));
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
