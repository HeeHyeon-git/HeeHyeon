package com.human.ex;
import java.util.*;
public class JavaClass04 {

	public static void main(String[] args) {
/*	�迭
	���ڰ� ������ ��� �迭�� ������.
	int [] a=new int[3]; 100�� ����� ������ 3��� 100
	�ε����� 0���� ����, 
	�׷��� �ε����� 0~2����
	a[0],a[1],a[2] 
	�ϳ��� ������ ��밡��
	���� �ְ� ������ a[0]=1, �о���� ������ a[0] 
	
*/
		int []a= {1,2,3};
		//�ش� �ε����� �о�ͼ� 2�� ���� ������ �ٽ� �ش� �ε����� �ִ´�
		a[0]=a[0]+2;
		a[1]=a[1]+2;
		a[2]=a[2]+2;
		
		
		for(int i=0; i<3; i++) {
			a[i]=a[i]+2;
		}
		for(int i=0; i<3; i++) {
		System.out.println(a[i]);
		}
		for(int i:a) {
			System.out.println(i);
		}
		
		
		int sum=0;
		for(int i=0; i<3; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		sum=0;
		for(int i:a) {
			sum=sum+i;
		}		
		System.out.println(sum);
	
		
		
		sum=0;
		for(int i=0; i<3; i++) {
			if(a[i]%2!=0)
			sum=sum+a[i];
		}
		System.out.println(sum);
		sum=0;
		for(int i:a) {
			if(i%2!=0) 
			sum=sum+i;
		}		
		System.out.println(sum);
		
		//�迭 �ȿ� ���� ū ���� ���� ���� ��
		//�ּҰ� �ִ밪 �Լ� �ᵵ ������, �̹� �񱳴���� �ִ� ���� �̷��� �ᵵ ��.
		int max=a[0];
		int min=a[0];
		for(int i:a) {
			if(max<i) {
			max=i;
		}
		if(min>i) {
			min=i;
		}
	}
	System.out.println(max);
	System.out.println(min);
		
		
		
		
		
		








	}

}
