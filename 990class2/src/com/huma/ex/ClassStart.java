package com.huma.ex;
class Cat{
	public static int ageVaccination=5;//클래스 필드
	public String name="이름";//인스턴스 필드
	public int age=0;
	public static void changeAgeVaccination(int ageVacc) {
		//static메소드에서는 인스턴스 필드에 접근할 수 없다.
		//static메소드에서는 static필드에 접근 할 수 있다.
		//인스턴스 메소드에서는 static필드를 접근할 수 있다.
		Cat.ageVaccination=ageVacc;
	}
	public String isVaccaination() {
		String returnValue="";
			if(Cat.ageVaccination<age) {
				returnValue="예방접종 대상자";
			}else {
				returnValue="예방 접종 대상자가 아님";
			}
		return returnValue;
	}
	//생성자 메소드 : 인스턴스 필드의 값을 초기화 하는데 사용
	//1.리턴 값이 없다. 2.클래스명과 이름이 동일하다.
	
	public Cat() {
		System.out.println("기본생성자함수실행");
	}
	
	public Cat(String name) {
		this(name,1);
	}//다른 생성자 호출
	
	public Cat(String name, int age) {
	//변수 접근 순서  1. 지역 변수  2.인스턴스 필드   3.클래스 필드
		this.name = name;
		this.age = age;
	}
	//public default protected private
	//인스턴스 메소드, 멤버 메소드
	public void catPrint() {
		System.out.println(name + ":"+age);
	}
	
	public void catAddAge(int a) {
		age=age+a;
	}

 }

//class Rectangle{
//	private int width=0;
//	private int height=0;
//	public Rectangle() {}
//	public Rectangle(int width, int height) {
//		this.width=width;
//		this.height=height;
//	}
//	public int area() {
//		return width*height;
//	}
//}


//사각형 넓이 구하는 메소드를 포함한 객체를 만들어 사각형 넓이를 구해보자.
//class Rectangle{
//	private int width=0;
//	private int height=0;
//	
//	public void setHeight(int height) {
//		if(height<0) {
//			height=0;
//		}
//		this.height=height;
//	}
//	
//	public int getHeight() {
//		return this.height;
//	}
//	
//	//setter 값을 세팅하는 메소드
//	public void setWidth(int width) {
//		if(width<0) {
//			width=0;
//		}
//		this.width=width;
//	}
//	//getter 값을 읽어오는 메소드
//	public int getWidth() {
//		return this.width;
//	}
//	
//	public Rectangle() {}
//	public Rectangle(int width, int height) {
//		if(width<0) {
//			width=0;
//		}
//		if(height<0) {
//			height=0;
//		}
//		this.width=width;
//		this.height=height;
//	}
//	public int area() {
//		return width*height;
//	}
//}
//국영수 과목 평균과 총점을 출력할 수 있는 객체를 만들어 보자.
class Student{
	public int kor;
	public int eng;
	public int math;
	public Student() {}
	public Student(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;		
	}
	public int sum() {
		return kor+eng+math;
	}
	
	public int avg() {
		return sum()/3;
	}
}

public class ClassStart {
	
	public static void catPrint(Cat c) {
		System.out.println(c.name + ":"+c.age);
	}
	
	public static void main(String[] args) {
//		Rectangle rc = new Rectangle(12,6);
//		rc.setHeight(1);
//		rc.setWidth(5);
////		rc.width=-1;
////		rc.height=5;		
//		int area=rc.area();
//		System.out.println(area);
			
//		Student st = new Student(44,55,66);
//		System.out.println(st.avg());
//		System.out.println(st.sum());
		
//		Cat c1 = new Cat();
//		c1.name="고1";
//		c1.age=12;
//		
//		Cat c2 = new Cat();
//		c2.name="고2";
//		c2.age=13;
//		
//		Cat c3 = new Cat();
//		c3.name="고3";
//		c3.age=14;
		
		//고양이 나이가 5살 이하면 예방접종을 실시한다.
		//1.법이 바뀌면 6살로 변경
		//인스턴스들이 공유할 수 있는 변수 Static
		System.out.println(Cat.ageVaccination);
		Cat.changeAgeVaccination(10);
		
		Cat c1 = new Cat("고1", 12);
		c1.age=3;
		System.out.println(c1.isVaccaination());
		System.out.println(c1.isVaccaination());
		//c1.age=16;
		Cat c2 = new Cat("고2", 13);
		Cat c3 = new Cat("고3", 14); 
		Cat c4 = new Cat();
		Cat c5 = new Cat("고5");
		
		c1.catAddAge(5);

		c1.catPrint();
		c2.catPrint();
		c3.catPrint();
		c4.catPrint();
		c5.catPrint();
		
		//고양이 나이를 매개변수 만큼 증가시키거나 감소시키는 함수를 만들어보자.
		//catAddAge 
		
		//함수적 방식
//		catPrint(c1);
//		catPrint(c2);
//		catPrint(c3);
		
		//절차적 방식
//		System.out.println(c1.name + ":"+c1.age);
//		System.out.println(c2.name + ":"+c2.age);
		

	}	
}
