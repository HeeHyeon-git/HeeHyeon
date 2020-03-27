package com.huma.ex;
class Circle{
	private static double pi=3.14;
	public static void changePi(double pi) {
		Circle.pi=pi;
	}
	
	public double r=0;
	public Circle() {}
	public Circle(double r) {
		this.r=r;	
	}
	public double border() {
		return 2*pi*r;
	}
	public double area() {
		return 2*pi*r*r;
	}
}

public class ClassStart9 {

	public static void main(String[] args) {
	//원의 넓이와 둘레를 구하는 클래스
	double r=5;
	Circle c = new Circle(5);
	c.area();
	c.border();
	System.out.println("area : "+ c.area() + ", border : " + c.border());
	
	
	double r1=6;
	Circle c1 = new Circle(r1);
	c1.area();
	c1.border();
	
	double r2=7;
	Circle c2 = new Circle(r2);
	c2.area();
	c2.border();
	
	//프로그램 중간에 pi값을 3.141592로 바꾸고 싶다면?
	//전부 바꿀 필요 없도록 그래서 static 변수로 생성.
	Circle.changePi(3.141592);
	//	Circle.pi=3.141592;
//	c.pi=3.141592;
//	c.area();
//	c.area();
//	
//	c1.pi=3.141592;
//	c1.area();
//	c1.area();
//	
//	c2.pi=3.141592;
//	c2.area();
//	c2.area();

	
	
	
	
	}

}
