package com.human.ex;
import java.util.*;

public class JavaStart12 {
	public static int total=0;
	//전역 변수 , static변수, 클래스 변수(최근 명칭)
	
	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		System.out.println(total);
		System.out.println(JavaStart12.total);
		//다른 클래스에서도 사용가능.같은 클래스 안에서는 생략하지만 다른 클래스에서 쓸 때는 클래스명 써주기.
		
		
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
