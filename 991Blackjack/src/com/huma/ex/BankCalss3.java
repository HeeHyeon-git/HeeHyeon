package com.huma.ex;

import java.util.Scanner;

public class BankCalss3 {
	
	public static int sum=0;
	public static String choice="";
	public static int save;
	public static int draw;
	public static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("������ �����ϼ��� 1.����   2.���  (����� -1) ");
		choice=sc.nextLine();	
	}
	
	public static void save() {
		System.out.println("�󸶳� �Ա��Ͻðڽ��ϱ�?");
		save=Integer.parseInt(sc.nextLine());
		sum=sum+save;
		System.out.println(save+ "��(��) �Ա��ϼ̽��ϴ�. ");
		System.out.println("�� �ܾ��� "+ sum + " �Դϴ�.");
	}
	
	public static void draw() {
		System.out.println("�󸶳� ����Ͻðڽ��ϱ�?");
		draw=Integer.parseInt(sc.nextLine());
		if(draw>sum) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			System.out.println(draw + "��(��) ����ϼ̽��ϴ�.");
			sum= sum-draw;
			System.out.println("�� �ܾ���  "+ sum + "�Դϴ�.");
		}
	}
	
	public static void bankCal() { 
		while(!choice.equals("-1")) {
			menu();
		switch (choice) {
		
		case "1":
			save();
			break;
		case "2":
			draw();
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println("���α׷��� ����˴ϴ�.");
	}

	public static void main(String[] args) {	
		 bankCal();
	}
}
