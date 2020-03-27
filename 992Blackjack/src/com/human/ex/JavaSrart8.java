package com.human.ex;

public class JavaSrart8 {
	
	public static int sum(int a, int b) {
		System.out.println("int+int");
		return a+b;
	}
	public static int sum(int a, int b, int c) {
		System.out.println("int+int+int");
		return a+b+c;
	}
	
	public static int sum(int a, double b) {
		System.out.println("int+double");
		return (int)(a+b);
	}
	
	
	public static void main(String[] args) {
		//함수 overload overide overloading overriding
		//overload 매개변수가 다르면 같은 이름의 함수를 만들 수 있다.
		//리턴값과 는 관계가 없다.
		//overide 상속 관려된 메소드 재정의
		int a=sum(10,20);
		System.out.println(a);
		double b=10.0;
		System.out.println(sum(a,b));
		//매개변수도 자동형변환이 되어 들어간다.
		
		
		
		
		
	}

}
