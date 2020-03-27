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
		s=a+"하세요";
		return s;
	}
	
	public static int [] intArrFunc(int arr[]) {
		int rArr[]=new int [2];
		rArr[0]=arr[0];
		rArr[1]=arr[1]; //여러개면 for문 돌리기
		
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
		
		String s="안녕";
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
//문제5. 매개변수가 한개 일때 변수의 자료형이 인트(int), 더블(double) 스트링 (String), 
//이름 나이를 저장하는 고양이(Cat) 객체(Object), int형 배열(Array), 고양이(Cat) 
//객체 배열인 함수 6개를 각각 만들어 보고 함수 내부에서 매개변수로 받은 내용을 그대로 출력하고 매개변수를 
//그대로 리턴하여 받은 결과를 출력하는 프로그램을 만들어 보자. 결국 같은 값이 2번 출력될 것이다. 
//함수안에서 1번 함수 호출후 리턴 받아서 한번 함수 이름은 다음과 같이 하자. 
//intFunc, doubleFunc, stringFunc, catFunc, intArrFunc, catObjectFunc