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
		//�Լ� overload overide overloading overriding
		//overload �Ű������� �ٸ��� ���� �̸��� �Լ��� ���� �� �ִ�.
		//���ϰ��� �� ���谡 ����.
		//overide ��� ������ �޼ҵ� ������
		int a=sum(10,20);
		System.out.println(a);
		double b=10.0;
		System.out.println(sum(a,b));
		//�Ű������� �ڵ�����ȯ�� �Ǿ� ����.
		
		
		
		
		
	}

}