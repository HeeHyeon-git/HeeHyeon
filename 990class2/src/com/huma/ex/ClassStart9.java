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
	//���� ���̿� �ѷ��� ���ϴ� Ŭ����
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
	
	//���α׷� �߰��� pi���� 3.141592�� �ٲٰ� �ʹٸ�?
	//���� �ٲ� �ʿ� ������ �׷��� static ������ ����.
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
