package com.human.ex;

public class JavaStart5 {
	public static int intFunc(int a) {
		int i=0;
		i=a+1;
		return i;
	}
	public static double doubleFunc(double d) {
		double b=0;
		d=b+1;
		return d;
	}
	
	public static String stringFunc(String a) {
		String s="null";
		s=a+"�ϼ���";
		return s;
	}
	
	public static int [] intArrFunc(int arr[]) {
		int rArr[]=new int [2];
		rArr[0]=arr[0];
		rArr[1]=arr[1]; //�������� for�� ������
		
		rArr[0]=rArr[0]+1;
		return rArr;
	}
	
	
	
	public static void main(String[] args) {
		int i=0;
		i=intFunc(i);
		System.out.println(i);
		
		double d=0;
		d=doubleFunc(d);
		System.out.println(d);
		
		String s="�ȳ�";
		s=stringFunc(s);
		System.out.println(s);
	
	
		//int[]arr1=new int[2];
		int[]arr1= {1,1};
		int[]arr2;
		arr2=intArrFunc(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);

	
	
	
	}

}
//����5. �Ű������� �Ѱ� �϶� ������ �ڷ����� ��Ʈ(int), ����(double) ��Ʈ�� (String), 
//�̸� ���̸� �����ϴ� �����(Cat) ��ü(Object), int�� �迭(Array), �����(Cat) 
//��ü �迭�� �Լ� 6���� ���� ����� ���� �Լ� ���ο��� �Ű������� ���� ������ �״�� ����ϰ� �Ű������� 
//�״�� �����Ͽ� ���� ����� ����ϴ� ���α׷��� ����� ����. �ᱹ ���� ���� 2�� ��µ� ���̴�. 
//�Լ��ȿ��� 1�� �Լ� ȣ���� ���� �޾Ƽ� �ѹ� �Լ� �̸��� ������ ���� ����. 
//intFunc, doubleFunc, stringFunc, catFunc, intArrFunc, catObjectFunc