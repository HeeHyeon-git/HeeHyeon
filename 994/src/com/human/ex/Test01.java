package com.human.ex;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		//���� 1. �ε��� ��� ���� ��ſ� ���� ���ڸ� ���� �� �ִ�. 
		a[]={1,2,3,4,5}, b=1, p(a[0]), p(a[b]) �� ���� ����� �� �ְ� ���� ����� 1�� 2�� ��� �ȴ�.
		int a[]= {1,2,3,4,5};
		int b=1;
		System.out.println(a[0]);
		System.out.println(a[b]);
		
		
		//���� 2. ������ �������� ����� ����. 
		//�迭 a�� �ε��� 0~5�� 1���� 6���� ������� ���ڸ� ���� ���� ������ �迭�� ������ ���� ���� sum�� �����Ͽ� ����ϴ� �������� ����� ����. 
		//�迭 �ʱ�ȭ ����� ������� �ʰ� ����� ����.
			int a[]=new int[6];
			int sum=0;
			for(int i=0;i<6;i++) {
				a[i]=i+1;
				sum=sum+a[i];
			}System.out.println(sum);
			
		//���� 3. �迭�� 3�� ����� �ִ� �������� ���α׷��� �ۼ��� ����.
			int a[]=new int [10];
			for(int i=0; i<10; i++) {
				a[i]=(i+1)*3;
			}System.out.println(Arrays.toString(a));
			
		
		//���� 4. a[]={12,1,5,3,6,8,5,3}�� a�迭���� 
		//�迭 ���� ���ڰ� ¦���� 12,6,8 �� ���� ���ϴ� �������� ���α׷��� �ۼ��� ����.
			int sum=0;
			int a[]= {12,1,5,3,6,8,5,3};
			for(int b:a) {
				if(b%2==0) {
					sum=sum+b;
				}
				
			}System.out.println(sum);
		
		//���� 5. a[]={12,1,51,3,6,8,5}�� a�迭���� 
		//���� ū ���� ���� ���� ���� ���ϴ� �������� ���α׷��� �ۼ��� ����.
			int a[]= {12,1,51,3,6,8,5};
			int max=Integer.MIN_VALUE;
			int min=Integer.MAX_VALUE;
			
			for(int c:a) {
				if(c>max) {
					max=c;
				}else if(c<min) {
					min=c;
				}
			}System.out.println("���� ū �� : "+max+" ���� ���� �� : "+min);
			
		
		//���� 6. �Ʒ��� �߱����� �������̴�. ���� �������� �̿��Ͽ� ������ ����Ǵ� ������ ������ ȭ�鿡 ����غ���.
		//0,0,0,2,0,2,0,0,.....1,0,10,9 ������ ���� ��µǸ� �ȴ�. �������� ���α׷��� �ۼ��� ����.
			
			int team1[]={0,0,0,0,1,3,2,3,1};
			int team2[]={0,2,2,0,4,1,0,0,0};
			int total1=0;
			int total2=0;
			
			
		
		
		
	}

}
