package com.human.ex;
class Cat {
	public static int ageVaccination=5;
	public String name="�̸�";//�ν��Ͻ� �ʵ�
	public int age=0;
	public static void changeAgeVaccination(int ageVacc) {
		//static�޼ҵ忡���� �ν��Ͻ� �ʵ忡 ������ �� ����.
		//static�޼ҵ忡���� static�ʿ� ������ �� �ִ�.
		//�ν��Ͻ� �޼ҵ忡���� static�ʵ带 ������ �� �ִ�.
		Cat.ageVaccination=ageVacc;
		
	}
	public String isVaccination() {
		String returnValue="";
		if(ageVaccination<age) {
			returnValue="��������";
		}else {
			returnValue="������������ھƴ�";
		}
		return returnValue;
	}
	//������ �޼ҵ�
	//1.���ϰ��� ����. 2. Ŭ������� �̸��� �����ϴ�.
	public Cat() {
		System.out.println("�⺻�������Լ�����");
	}
	
	public Cat(String name) {
		this(name,1);
		
	}
	public Cat(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//public default protected private
	//��� �޼ҵ� �ν��Ͻ� �޼ҵ�
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
		//����� ���̰� 5�������̸� ���������� �ǽ��Ѵ�.
		//1.���� �ٲ�� 6��� ����
		//�ν��Ͻ����� ���� �� �� �ִ� ���� Static
//		Cat c1=new Cat("��1",12);
//		c1.age=3;
//		System.out.println(c1.isVaccination());
//		c1.ageVaccination=6;
//		c1.name="��1";
//		c1.age=12;
//		Cat c2=new Cat("��2",13);
//		c2.name="��2";
//		c2.age=13;
//		Cat c3=new Cat("��3",14);
//		c3.name="��3";
//		c3.age=14;
//		Cat c4=new Cat();
//		Cat c5=new Cat("��5");
		Cat c1=new Cat("��1,12");
		Cat c2=new Cat("��2,13");
		Cat c3=new Cat("��3,14");
		Cat c4=new Cat();
		Cat c5=new Cat("��5");
		c1.catAddAge(5);
		c1.catPrint();
		c2.catPrint();
		c3.catPrint();
		c4.catPrint();
		c5.catPrint();
		//����� ���̸� �Ű����� ��ŭ ������Ű�ų� ���ҽ�Ű�� �Լ��� ����� ����.
		//catAddAge
		
		
		
		//�Լ��� ���
//		catPrint(c1);
//		catPrint(c2);
//		catPrint(c3);
		
		//������ ���
		System.out.println(c1.name+":"+c1.age);
		System.out.println(c2.name+":"+c2.age);
	}
	
	}

		//�ڵ���,TV, ���������� ������ �ϳ� �߰�
		//�ڵ�����ȣ,�̸�,��ǰ��
		//��ȭ�ɱ� �޽���������
		//�޽���
		//�����ڵ�����ȣ �޴»���ڵ�����ȣ ���� �޽��� �ð�
	

