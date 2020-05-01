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
//��� Ŭ������ object Ŭ������ ����Ѵ�.

class RectanglePillar extends Rectangle{
	public double pillar = 0;
	public double volume() {
		return area() * pillar;
	}
	public RectanglePillar() {}
	public RectanglePillar(double width, double height, double pillar) {
		super(width,height); //�����ڴ� �� ù �ٿ� �����
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
		
		//�簢����� ���̸� ���ϴ� ����� �߰��غ���.
		RectanglePillar rp = new RectanglePillar();
		rp.height = 10;
		rp.width = 30;
		System.out.println(re.area());
		System.out.println(re.around());
		
		RectanglePillar rp1 = new RectanglePillar(10,20,30);
		System.out.println(rp1.area());
		System.out.println(rp1.around());
		System.out.println(rp1.volume());
		
		//�ﰢ�� ���̸� ���� �� �ִ�  Ŭ��������
		//�ﰢ�� ���Ǹ� ���Ͻÿ�.
		Triangle tg = new Triangle(10,20,30);
		System.out.println(tg.area());
		System.out.println(tg.volume());
		
		
		
		
	}
}












