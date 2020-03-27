package com.human.ex;
import java.util.*;
public class JavaClass04 {

	public static void main(String[] args) {
/*	배열
	숫자가 많아질 경우 배열로 선언함.
	int [] a=new int[3]; 100개 만들고 싶으면 3대신 100
	인덱스는 0부터 시작, 
	그러니 인덱스는 0~2까지
	a[0],a[1],a[2] 
	하나의 변수로 사용가능
	값을 넣고 싶으면 a[0]=1, 읽어오고 싶으면 a[0] 
	
*/
		int []a= {1,2,3};
		//해당 인덱스를 읽어와서 2를 더한 다음에 다시 해당 인덱스에 넣는다
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
		
		//배열 안에 가장 큰 수와 가장 작은 수
		//최소값 최대값 함수 써도 되지만, 이미 비교대상이 있는 경우는 이렇게 써도 됨.
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
