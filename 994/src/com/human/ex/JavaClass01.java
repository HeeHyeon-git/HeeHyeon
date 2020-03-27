package com.human.ex;
	
import java.util.Arrays;

class Cat{
	public String name;
	public int age;
}

public class JavaClass01 {

	public static void main(String[] args) {
		int a;
		a=1;
		Cat cat1;
		cat1=new Cat();//new라는 뜻은 heap에 생성하라는 뜻.
		cat1.name="고양이1";//원래는 new String()해서 써야하는데 많이 사용해서 자바에서 추가로 만들어 제공해줌.
		cat1.age=13;
		Cat cat2;
		cat2=new Cat();
		cat2.name="고양이2";
		cat2.age=12;
		Cat cat3=cat2;
		cat3.name="고양이3";
		cat3.age=11;
		
		System.out.println(cat2.name);
		
		Cat cArr[]=new Cat[3];//고양이 객체를 저장할 수 있는 공간 3개 만들어짐.
		//cArr[0]=new Cat(); 꼭 이렇게 설정해주기 하지 않으면 .을 주소로 인식해서 널포인트 오류 남.
		cArr[0]=new Cat();
		cArr[0].name="고1";
		cArr[0].age=10;
		cArr[1]=new Cat();
		cArr[1].name="고2";
		cArr[1].age=11;
		cArr[2]=new Cat();
		cArr[2].name="고3";
		cArr[2].age=12;
		
		//cArr[0]=cArr[2]; 이런식으로 적용하면 안됨. 아래와 같이 설정해야함
		cArr[0].name=cArr[2].name; 
		cArr[0].age=cArr[2].age;// 이것도 나중에 문제 생길 수 있지만 차후 설명
		
		for(int i=0; i<3;i++) {
			cArr[i]=new Cat();//중요한 건 이게 있어야 한다는 사실
			cArr[i].name= "고"+i;
			cArr[i].age= i+10;
		}
		
		for(int i=0; i<3;i++) {
 			System.out.println(cArr[i].name+" : "+cArr[i].age);
		}
		
		int sum=0;
		for(int i=0; i<cArr.length;i++) {
			sum=sum+cArr[i].age;
			cArr[i].age=1;
			}
			System.out.println(sum);
		
		sum=0;
		for(Cat cat:cArr) {
			sum=sum+cat.age;
			cat.age=2;
		}
		System.out.println(sum);
		for(int i=0; i<3;i++) {
 			System.out.println(cArr[i].name+" : "+cArr[i].age);
		}
		
		//배열에 3의 배수 3개를 넣고 더한 값을 구하시오
		//고양이 나이에 총합을 구하시오.
		
		/*
		//객체란: 관련 있는 데이터를 묶은 것.
		//배열 : 쉽게 한번에 여러개의 데이터를 선언
		//int a1,a2,a3; int a[]=new int[3];
		int a[];
		a=new int[3];
		a[0]=0;//index는 0부터 시작한다.
		a[1]=1;
		a[2]=2;
		
		int index=1;
		a[index]=3;
		
		System.out.println(Arrays.toString(a));
		for(int i=0; i<3; i++) {
			a[i]=i; 
		}
		System.out.println(Arrays.toString(a));		
		
		a[0]=a[1]+a[2];
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		
		sum=0;
		for(int i:a) {
			//최근 언어:i가 배열인 a요소를 하나씩 읽어서 돌고 다 읽으면 빠져나간다는 뜻.
			sum=sum+i;			
		}
		System.out.println(sum);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
