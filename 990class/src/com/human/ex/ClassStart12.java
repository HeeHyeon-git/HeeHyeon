package com.human.ex;

class Rectangle{
	public double width = 0;
	public double height = 0;
	public double area() {
		return width * height;
	}
	public double around() {
		return width * 2 + height * 2;
	}
	public Rectangle() {}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
}
//모든 클래스는 object 클래스를 상속한다.

class RectanglePillar extends Rectangle{
	public double pillar = 0;
	public double volume() {
		return area() * pillar;
	}
	public RectanglePillar() {}
	public RectanglePillar(double width, double height, double pillar) {
		super(width,height); //생성자는 맨 첫 줄에 써야함
//		this.width = width;
//		this.height = height;
		this.pillar = pillar;
	}
}

class Triangle extends Rectangle{  
	public double pillar = 0;
	public double volume() {
		return area() * 0.5 * (1/3) * pillar ;
	}
	public Triangle() {}
	public Triangle(double pillar, double width, double height ) {
		this.width = width;
		this.height = height;
		this.pillar = pillar;
	}
}


public class ClassStart12 {

	public static void main(String[] args) {
		Rectangle re = new Rectangle(10,30);
		System.out.println(re.area());
		System.out.println(re.around());
		
		//사각기둥의 넓이를 구하는 기능을 추가해보자.
		RectanglePillar rp = new RectanglePillar();
		rp.height = 10;
		rp.width = 30;
		System.out.println(re.area());
		System.out.println(re.around());
		
		RectanglePillar rp1 = new RectanglePillar(10,20,30);
		System.out.println(rp1.area());
		System.out.println(rp1.around());
		System.out.println(rp1.volume());
		
		//삼각형 넓이를 구할 수 있는  클래스에서
		//삼각형 부피를 구하시오.
		Triangle tg = new Triangle(10,20,30);
		System.out.println(tg.area());
		System.out.println(tg.volume());
		
		
		
		
	}
}












