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
	funcAll("�ȳ�","�ϼ���");
	
	//���� ���� ���ϱ�
	 System.out.println("� ������ ���̸� ���Ͻʴϱ� (1.��  2.�簢��  3.�ﰢ��)");
	 int input=Integer.parseInt(sc.nextLine());
	 if(input==1) {
		 System.out.println("�������� �Է����ּ���");
		 double radius=Double.parseDouble(sc.nextLine());
		 System.out.print("���� ���̴� : ");
		 circle(radius);
		 
	 }else if(input==2) {
		 System.out.println("�簢���� �غ��� ���̸� �Է����ּ���");
		 int squareWidth=Integer.parseInt(sc.nextLine());
		 int squareHeight=Integer.parseInt(sc.nextLine());
		 square(squareWidth, squareHeight);

	 }else if(input==3) {
		 System.out.println("�ﰢ���� �غ��� ���̸� �Է����ּ���");
		 int triangleWidth=Integer.parseInt(sc.nextLine());
		 int triangleHeight=Integer.parseInt(sc.nextLine());
		 triangle(triangleWidth, triangleHeight); 
	 }		
		
	}

}
