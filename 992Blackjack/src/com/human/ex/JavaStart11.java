package com.human.ex;
import java.util.*;

public class JavaStart11 {
	//p.9  ����ڷκ��� �ϳ��� ���ڸ� �Է¹޾� �������� ����ϴ� ���α׷�(�Լ�)
	public static void mul(int a) {
		for(int i=1; i<10; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
	
	//p.10 ������ �޴� �ý���(�Լ�)
	public static void checkMenu(int a) {
		if(a==1) {
			System.out.println("1�� �޴��� ���õǾ����ϴ�." );
		}
		if(a==2) {
			System.out.println("2�� �޴��� ���õǾ����ϴ�." );
		}
		if(a==3) {
			System.out.println("3�� �޴��� ���õǾ����ϴ�." );
		}
		if(a==4) {
			System.out.println("����Ǿ����ϴ�." );
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		//p.9  ����ڷκ��� �ϳ��� ���ڸ� �Է¹޾� �������� ����ϴ� ���α׷�
		System.out.println("�ϳ��� ���ڸ� �Է��ϼ���");
		int input=Integer.parseInt(sc.nextLine());
		mul(input);
		

		//p.10 ������ �޴� �ý���
		System.out.println(" 1.�ܹ���\n 2.ġ�����\n 3.������ġ\n 4.����");
		System.out.print(" ���ϴ� �޴��� �����Ͻÿ� :");
		int inputMenu=Integer.parseInt(sc.nextLine());
		checkMenu(inputMenu);

			
		
		
		//p.11 ���� �ݺ����� ����ϴ� ���α׷����� �޴��� ����ϴ� �Լ�,
		//	���簢���� ���̸� ����ϴ� �Լ�, ���� ���̸� ����ϴ� �Լ�.
		//p.12 1~100�� �� �߿��� ¦���� ���Ͽ� �Լ��� Ȧ���� ���ϴ� �Լ� �ۼ�
		//p.17 ����
		
		
		
		
		
	}

}
