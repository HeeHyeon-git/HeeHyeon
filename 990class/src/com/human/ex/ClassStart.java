package com.human.ex;
class Cat {
	public static int ageVaccination=5;
	public String name="이름";//인스턴스 필드
	public int age=0;
	public static void changeAgeVaccination(int ageVacc) {
		//static메소드에서는 인스턴스 필드에 접근할 수 없다.
		//static메소드에서는 static필에 접근할 수 있다.
		//인스턴스 메소드에서는 static필드를 접근할 수 있다.
		Cat.ageVaccination=ageVacc;
		
	}
	public String isVaccination() {
		String returnValue="";
		if(ageVaccination<age) {
			returnValue="예방접종";
		}else {
			returnValue="예방접종대상자아님";
		}
		return returnValue;
	}
	//생성자 메소드
	//1.리턴값이 없다. 2. 클래스명과 이름이 동일하다.
	public Cat() {
		System.out.println("기본생성자함수실행");
	}
	
	public Cat(String name) {
		this(name,1);
		
	}
	public Cat(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//public default protected private
	//멤버 메소드 인스턴스 메소드
	public void catPrint()  {
		System.out.println(name+":"+age);
	}
	public void catAddAge(int a) {
		age=age+a;
	}
}
	public class ClassStart {
	public static void catPrint(Cat c) {
		System.out.println(c.name+":"+c.age);
	}
	public static void main(String[] args)  {
		//고양이 나이가 5살이하이면 예방접종을 실시한다.
		//1.법이 바뀌면 6살로 변경
		//인스턴스들이 공유 할 수 있는 변수 Static
//		Cat c1=new Cat("고1",12);
//		c1.age=3;
//		System.out.println(c1.isVaccination());
//		c1.ageVaccination=6;
//		c1.name="고1";
//		c1.age=12;
//		Cat c2=new Cat("고2",13);
//		c2.name="고2";
//		c2.age=13;
//		Cat c3=new Cat("고3",14);
//		c3.name="고3";
//		c3.age=14;
//		Cat c4=new Cat();
//		Cat c5=new Cat("고5");
		Cat c1=new Cat("고1,12");
		Cat c2=new Cat("고2,13");
		Cat c3=new Cat("고3,14");
		Cat c4=new Cat();
		Cat c5=new Cat("고5");
		c1.catAddAge(5);
		c1.catPrint();
		c2.catPrint();
		c3.catPrint();
		c4.catPrint();
		c5.catPrint();
		//고양이 나이를 매개변수 만큼 증가시키거나 감소시키는 함수를 만들어 보자.
		//catAddAge
		
		
		
		//함수적 방식
//		catPrint(c1);
//		catPrint(c2);
//		catPrint(c3);
		
		//절차적 방식
		System.out.println(c1.name+":"+c1.age);
		System.out.println(c2.name+":"+c2.age);
	}
	
	}

		//핸드폰,TV, 엘리베이터 본인이 하나 추가
		//핸드폰번호,이름,제품명
		//전화걸기 메시지보내기
		//메시지
		//본인핸드폰번호 받는사람핸드폰번호 보낼 메시지 시간
	

