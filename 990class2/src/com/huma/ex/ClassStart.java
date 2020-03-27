package com.huma.ex;
class Cat{
	public static int ageVaccination=5;//Ŭ���� �ʵ�
	public String name="�̸�";//�ν��Ͻ� �ʵ�
	public int age=0;
	public static void changeAgeVaccination(int ageVacc) {
		//static�޼ҵ忡���� �ν��Ͻ� �ʵ忡 ������ �� ����.
		//static�޼ҵ忡���� static�ʵ忡 ���� �� �� �ִ�.
		//�ν��Ͻ� �޼ҵ忡���� static�ʵ带 ������ �� �ִ�.
		Cat.ageVaccination=ageVacc;
	}
	public String isVaccaination() {
		String returnValue="";
			if(Cat.ageVaccination<age) {
				returnValue="�������� �����";
			}else {
				returnValue="���� ���� ����ڰ� �ƴ�";
			}
		return returnValue;
	}
	//������ �޼ҵ� : �ν��Ͻ� �ʵ��� ���� �ʱ�ȭ �ϴµ� ���
	//1.���� ���� ����. 2.Ŭ������� �̸��� �����ϴ�.
	
	public Cat() {
		System.out.println("�⺻�������Լ�����");
	}
	
	public Cat(String name) {
		this(name,1);
	}//�ٸ� ������ ȣ��
	
	public Cat(String name, int age) {
	//���� ���� ����  1. ���� ����  2.�ν��Ͻ� �ʵ�   3.Ŭ���� �ʵ�
		this.name = name;
		this.age = age;
	}
	//public default protected private
	//�ν��Ͻ� �޼ҵ�, ��� �޼ҵ�
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


//�簢�� ���� ���ϴ� �޼ҵ带 ������ ��ü�� ����� �簢�� ���̸� ���غ���.
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
//	//setter ���� �����ϴ� �޼ҵ�
//	public void setWidth(int width) {
//		if(width<0) {
//			width=0;
//		}
//		this.width=width;
//	}
//	//getter ���� �о���� �޼ҵ�
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
//������ ���� ��հ� ������ ����� �� �ִ� ��ü�� ����� ����.
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
//		c1.name="��1";
//		c1.age=12;
//		
//		Cat c2 = new Cat();
//		c2.name="��2";
//		c2.age=13;
//		
//		Cat c3 = new Cat();
//		c3.name="��3";
//		c3.age=14;
		
		//����� ���̰� 5�� ���ϸ� ���������� �ǽ��Ѵ�.
		//1.���� �ٲ�� 6��� ����
		//�ν��Ͻ����� ������ �� �ִ� ���� Static
		System.out.println(Cat.ageVaccination);
		Cat.changeAgeVaccination(10);
		
		Cat c1 = new Cat("��1", 12);
		c1.age=3;
		System.out.println(c1.isVaccaination());
		System.out.println(c1.isVaccaination());
		//c1.age=16;
		Cat c2 = new Cat("��2", 13);
		Cat c3 = new Cat("��3", 14); 
		Cat c4 = new Cat();
		Cat c5 = new Cat("��5");
		
		c1.catAddAge(5);

		c1.catPrint();
		c2.catPrint();
		c3.catPrint();
		c4.catPrint();
		c5.catPrint();
		
		//����� ���̸� �Ű����� ��ŭ ������Ű�ų� ���ҽ�Ű�� �Լ��� ������.
		//catAddAge 
		
		//�Լ��� ���
//		catPrint(c1);
//		catPrint(c2);
//		catPrint(c3);
		
		//������ ���
//		System.out.println(c1.name + ":"+c1.age);
//		System.out.println(c2.name + ":"+c2.age);
		

	}	
}
