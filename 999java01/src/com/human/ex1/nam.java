package com.human.ex1;

import com.human.eto.*;
public class nam {
	
	public static void main(String[] args) {

		car c = new car();
		c.name = "K7";
		c.color = "black";
		c.old = 19;
		c.pay = 4000;	
		c.option = "x";
		System.out.println("���� :"+c.name + "  �÷� :"+c.color+"  ���� :"+c.old+"  ���� :"+c.pay+"  �ɼ� :"+c.option);

		elevator e = new elevator();
		e.name = "**����";
		e.high = 20;
		e.old = 18;	
		e.weight = 900;
		e.pay = 2;
		System.out.print("�ּ� :"+e.name + "  �ִ� �� :"+e.high+"  ���� :"+e.old);
		System.out.println("  ���� :"+e.pay+"��  �ִ� ���� :"+e.weight);

		phone p = new phone();
		p.com = "Apple";
		p.name = "I Phone";
		p.color = "Gray";
		p.old = 18;
		p.pay = 100;
		System.out.print("ȸ���̸� :"+p.com +"  �̸� :"+p.name + "  �÷� :"+p.color);
		System.out.println("  �������� :"+p.old+"  ���� :"+p.pay);
		student s = new student();
		s.name = "I Phone";
		s.age = 16;
		s.gender = "��";
		System.out.println("�̸� :"+s.name + "  ����:"+s.age+"  ���� :"+s.gender);
		
		drink d = new drink();
		d.name = "I Phone";
		d.pay = 1900;
		d.time = "2��15��";
		System.out.println("�̸� :"+d.name + "  ����:"+d.pay+"  ������� :"+d.time);
  }	
	
}