package com.human.ex;
import java.util.*;
public class JavaSrart9 {
	public static void funcAll(int a, int b) {
		System.out.println("int+int");
		System.out.println(a+b);
	}
	public static void funcAll(double a, double b) {
		System.out.println("double+double");
		System.out.println(a+b);
	}
	public static void funcAll(String a, String b) {
		System.out.println("String+String");
		System.out.println(a+b);
	}
	
	public static void circle(double a) {
		double circle=0;
		System.out.println(circle=(a*a)*3.14);
	}
	public static void square(int a, int b) {
		int square=0;
		System.out.println(square=a*b);
	}
	public static void triangle(int a, int b) {
		int triangle=0;
		System.out.println(triangle=(a*b)/2);
	}
	
	public static void main(String[] args) {
	Scanner sc=new java.util.Scanner(System.in);
	funcAll(10,20);
	funcAll(1.5,2.5);
	funcAll("안녕","하세요");
	
	//도형 넓이 구하기
	 System.out.println("어떤 도형의 넓이를 구하십니까 (1.원  2.사각형  3.삼각형)");
	 int input=Integer.parseInt(sc.nextLine());
	 if(input==1) {
		 System.out.println("반지름을 입력해주세요");
		 double radius=Double.parseDouble(sc.nextLine());
		 System.out.print("원의 넓이는 : ");
		 circle(radius);
		 
	 }else if(input==2) {
		 System.out.println("사각형의 밑변과 높이를 입력해주세요");
		 int squareWidth=Integer.parseInt(sc.nextLine());
		 int squareHeight=Integer.parseInt(sc.nextLine());
		 square(squareWidth, squareHeight);

	 }else if(input==3) {
		 System.out.println("삼각형의 밑변과 높이를 입력해주세요");
		 int triangleWidth=Integer.parseInt(sc.nextLine());
		 int triangleHeight=Integer.parseInt(sc.nextLine());
		 triangle(triangleWidth, triangleHeight); 
	 }		
		
	}

}
