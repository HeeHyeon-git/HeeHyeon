package com.human.ex;
import java.util.*;

public class JavaStart12 {
	public static int total=0;
	//���� ���� , static����, Ŭ���� ����(�ֱ� ��Ī)
	
	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		System.out.println(total);
		System.out.println(JavaStart12.total);
		//�ٸ� Ŭ���������� ��밡��.���� Ŭ���� �ȿ����� ���������� �ٸ� Ŭ�������� �� ���� Ŭ������ ���ֱ�.
		
		
		int i=0;
		{
			total=10;
			int i1=0;
		}
		if(true) {
			int i2=10;
		System.out.println(total);
		}
		for(int j=0; j<11; j++) {
			int i3=10;
			i++;
		}
	
	
	}

}
