package com.human.ex;
class Cat{
	String name;
	int age;
}
public class JavaStart7 {
	public static Cat[] catArrFunc(Cat[]arr) {
		Cat rArr[]=new Cat[2];
		//일일이 복사해줘야 함. 분리 안됨.
		//rArr[0]=arr[0];
		//위에도 안됨. 결국에는 같은 고양이.
		rArr[0]=new Cat();
		rArr[0].name=arr[0].name;
		rArr[0].age=arr[0].age;
		
		rArr[1]=new Cat();
		rArr[1].name=arr[1].name;
		rArr[1].age=arr[1].age;
	
		rArr[1].age=6;
		return rArr;
	}
	
	public static void main(String[] args) {
		Cat cArr1[]=new Cat[2];
		Cat cArr2[];
		
		cArr1[0]=new Cat();
		cArr1[0].name="고1";
		cArr1[0].age=15;
		
		cArr1[1]=new Cat();
		cArr1[1].name="고2";
		cArr1[1].age=16;

		cArr2=catArrFunc(cArr1);
		System.out.println(cArr1[1].age);
		System.out.println(cArr2[1].age);
		
		
//		cArr2=cArr1;
//		cArr2[1].age=6;
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
	}

}
//문제5. 매개변수가 한개 일때 변수의 자료형이 인트(int), 더블(double) 스트링 (String), 
//이름 나이를 저장하는 고양이(Cat) 객체(Object), int형 배열(Array), 고양이(Cat) 
//객체 배열인 함수 6개를 각각 만들어 보고 함수 내부에서 매개변수로 받은 내용을 그대로 출력하고 매개변수를 
//그대로 리턴하여 받은 결과를 출력하는 프로그램을 만들어 보자. 결국 같은 값이 2번 출력될 것이다. 
//함수안에서 1번 함수 호출후 리턴 받아서 한번 함수 이름은 다음과 같이 하자. 
//intFunc, doubleFunc, stringFunc, catFunc, intArrFunc, catObjectFunc