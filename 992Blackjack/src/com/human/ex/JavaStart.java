package com.human.ex;
import java.util.*;
public class JavaStart {
	//1. �޼ҵ��� ���������� �޼ҵ尡 ����Ǹ� stack�� �ö󰣴�.
	//2. �޼ҵ尣 ���������� �������� �ʴ´�.
	//3. �޼ҵ尡 ����Ǹ� �޸𸮿��� �������.
	//4. �ڵ���� ���������� �ڵ���� ����Ǹ� �������.
	
	//���� 1. ��Ģ������ �����ϴ� min, mul, div �Լ��� ���� ����غ���.
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
		//���� �ؿ��� sum=sum+1 ���� �ڵ� �� �� ���� 
		//���� ����� ���̱� ������
	
	//���� 2. �Ű������� ���� ���� ���� �Լ��� �̿��ؼ� "�ȳ��ϼ���" �̶�� ������  
	//		�Լ� hello�� ����� ���α׷� ������ �ǹ��ϴ� �����Լ����� ��� �Լ�������ϴ� ������ ȣ���Ͽ�
	//		"�ȳ��ϼ���"�� ����ϴ� ���α׷��� ����� ����� ����.

	public static void hello() {
		System.out.println("�ȳ��ϼ���");
	}	
	
	//���� 3. �� �� ������ ���� ���ϴ� �Լ��� ����� ����غ���.
	public static int gap(int a, int b) {
		int sum=0;
		if(a>b) {
			int temp;
			temp=a;
			a=b;
			b=temp;
		}//b�� �׻� ū ���� ��. a�� b�� ��ȯ�����ѱ�.
		for(int i=a; i<=b; i++) {//�ʱ�ȭ �� �Ⱦ��� �ٷ� �������� ��.
			sum=sum+i;
		}
		return sum;
	}	
	
	
	public static void main(String[] args) {
	//���� 1.
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
		
	//���� 2.
		hello();
		hello();
		hello();
		for(int i=0;i<3;i++) {
			hello();
		}
		
	//���� 3.
		a=10; b=12;
		//�����ϰ� �Ʒ��� ���� ���� ����.
		System.out.println(gap(a,b));
		System.out.println(gap(5,12));
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
