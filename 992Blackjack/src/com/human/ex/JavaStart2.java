package com.human.ex;

import java.util.Arrays;

public class JavaStart2 {
	
//	����1. ���α׷� ��â�� ���� �ﰢ�� �� ���� ȭ�鿡 ����ϴ� �Լ�  
//	����� �̸��� ����  ������ ���� ����� triangle1(), triangle2(), triangle3() �� �Լ��� ȣ���ؼ� ȭ�鿡 �ﰢ���� ��µǵ��� ����� ����.
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
//	����2. ������ ���� �ڵ带 �⺻���� ���� �Լ����� ����� ����.������ ����� �Լ��� ����� ȣ�⿡�� ���� ������ ����� ����.
	public static void nameCard() { 
		System.out.println("�̸�   : ��ٿ�");
		System.out.println("�̸���: godips1006@naver.com ");
	}
	
	
//	����3. �迭�� �Ű������� ���Ͽ� �迭������ ���� �������ִ� �Լ��� ����� ����.
	public static int sumArr(int arr[]){
		int sumArr=0;
		for(int i=0; i<=arr.length ;i++) {
			sumArr=sumArr+arr[i];
		}		
		return sumArr;
	}
	
//	����4. �޷��� ����� �Լ��� ������ �޷��� ����ϴ� �Լ��� ������.
	public static void calendar(){ 
		int START_DAY=3;
		int DAYS_OF_MONTH=31;
		int day,date=0;
	
		System.out.println("==========================================================");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��\t");
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
	//���� 1.
		triangle1();
		triangle2();
		triangle3();
		
	//���� 2.
		nameCard();
		
	//���� 3.	
		int arr[]= {1,2,3,4};
		System.out.println(sumArr(arr));
		
	//���� 4.
		calendar();	
	}
}


