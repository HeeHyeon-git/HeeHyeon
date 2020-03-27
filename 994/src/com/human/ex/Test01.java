package com.human.ex;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		//문제 1. 인덱스 상수 숫자 대신에 변수 숫자를 넣을 수 있다. 
		a[]={1,2,3,4,5}, b=1, p(a[0]), p(a[b]) 와 같이 사용할 수 있고 실행 결과는 1과 2가 출력 된다.
		int a[]= {1,2,3,4,5};
		int b=1;
		System.out.println(a[0]);
		System.out.println(a[b]);
		
		
		//문제 2. 다음을 순서도로 만들어 보자. 
		//배열 a에 인덱스 0~5에 1부터 6까지 순서대로 숫자를 집어 넣은 다음에 배열의 내용을 더한 값을 sum에 저장하여 출력하는 순서도를 만들어 보자. 
		//배열 초기화 방법을 사용하지 않고 만들어 보자.
			int a[]=new int[6];
			int sum=0;
			for(int i=0;i<6;i++) {
				a[i]=i+1;
				sum=sum+a[i];
			}System.out.println(sum);
			
		//문제 3. 배열에 3의 배수를 넣는 순서도와 프로그램을 작성해 보자.
			int a[]=new int [10];
			for(int i=0; i<10; i++) {
				a[i]=(i+1)*3;
			}System.out.println(Arrays.toString(a));
			
		
		//문제 4. a[]={12,1,5,3,6,8,5,3}의 a배열에서 
		//배열 안의 숫자가 짝수인 12,6,8 의 값을 더하는 순서도와 프로그램을 작성해 보자.
			int sum=0;
			int a[]= {12,1,5,3,6,8,5,3};
			for(int b:a) {
				if(b%2==0) {
					sum=sum+b;
				}
				
			}System.out.println(sum);
		
		//문제 5. a[]={12,1,51,3,6,8,5}의 a배열에서 
		//가장 큰 값과 가장 작은 값을 더하는 순서도와 프로그램을 작성해 보자.
			int a[]= {12,1,51,3,6,8,5};
			int max=Integer.MIN_VALUE;
			int min=Integer.MAX_VALUE;
			
			for(int c:a) {
				if(c>max) {
					max=c;
				}else if(c<min) {
					min=c;
				}
			}System.out.println("가장 큰 값 : "+max+" 가장 작은 값 : "+min);
			
		
		//문제 6. 아래는 야구게임 전광판이다. 여러 변수들을 이용하여 게임이 진행되는 순으로 값들을 화면에 출력해보자.
		//0,0,0,2,0,2,0,0,.....1,0,10,9 다음과 같이 출력되면 된다. 순서도와 프로그램을 작성해 보자.
			
			int team1[]={0,0,0,0,1,3,2,3,1};
			int team2[]={0,2,2,0,4,1,0,0,0};
			int total1=0;
			int total2=0;
			
			
		
		
		
	}

}
