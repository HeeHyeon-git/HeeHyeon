package com.huma.ex;
import java.util.*;
public class BankClass {
	
public static void bankCal() {
	int sum=0;
	int choice=0;
	Scanner sc = new Scanner(System.in);
	while (!(choice==-1)) {
		System.out.println("�޴��� �����ϼ��� 1.���� 2.��� (����� -1)");
		choice=Integer.parseInt(sc.nextLine());
	switch (choice) {
	case 1:
		System.out.println("�󸶳� �����Ͻðڽ��ϱ�?");
		int save=Integer.parseInt(sc.nextLine());
		sum=sum+save;
		System.out.println("�� �ܾ���  "+ sum +" �Դϴ�.");
		break;
	case 2: 
		System.out.println("�󸶳� ����Ͻðڽ��ϱ�?");
		int draw=Integer.parseInt(sc.nextLine());
		if(draw>sum) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			sum=sum=draw;
			System.out.println("�� �ܾ��� " +(sum-draw)+ " �Դϴ�. ");
		}
	default:
	break;
	}
	
}
	System.out.println("���α׷��� �����մϴ�.");
}


	public static void main(String[] args) {
		
		bankCal();
		
//	Scanner sc = new Scanner(System.in);
//		int sum=0;
//		int choice=0;
//		while (!(choice==-1)) {
//			System.out.println("�޴��� �����ϼ��� 1.���� 2.��� (����� -1)");
//			choice=Integer.parseInt(sc.nextLine());
//		switch (choice) {
//		case 1:
//			System.out.println("�󸶳� �����Ͻðڽ��ϱ�?");
//			int save=Integer.parseInt(sc.nextLine());
//			sum=sum+save;
//			System.out.println("�� �ܾ���  "+  sum +" �Դϴ�.");
//			break;
//		case 2: 
//			System.out.println("�󸶳� ����Ͻðڽ��ϱ�?");
//			int draw=Integer.parseInt(sc.nextLine());
//			if(draw>sum) {
//				System.out.println("�ܾ��� �����մϴ�.");
//			}else {
//				System.out.println("�� �ܾ��� " +(sum-draw)+ " �Դϴ�. ");
//			}
//
//		default:
//		break;
//		}
//		
//	}
//		System.out.println("���α׷��� �����մϴ�.");
//		
//		
//		
		
	}

}
