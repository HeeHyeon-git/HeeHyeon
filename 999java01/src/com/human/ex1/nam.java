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
		System.out.println("차종 :"+c.name + "  컬러 :"+c.color+"  연식 :"+c.old+"  가격 :"+c.pay+"  옵션 :"+c.option);

		elevator e = new elevator();
		e.name = "**빌라";
		e.high = 20;
		e.old = 18;	
		e.weight = 900;
		e.pay = 2;
		System.out.print("주소 :"+e.name + "  최대 층 :"+e.high+"  연식 :"+e.old);
		System.out.println("  가격 :"+e.pay+"억  최대 하중 :"+e.weight);

		phone p = new phone();
		p.com = "Apple";
		p.name = "I Phone";
		p.color = "Gray";
		p.old = 18;
		p.pay = 100;
		System.out.print("회사이름 :"+p.com +"  이름 :"+p.name + "  컬러 :"+p.color);
		System.out.println("  생산일자 :"+p.old+"  가격 :"+p.pay);
		student s = new student();
		s.name = "I Phone";
		s.age = 16;
		s.gender = "남";
		System.out.println("이름 :"+s.name + "  나이:"+s.age+"  성별 :"+s.gender);
		
		drink d = new drink();
		d.name = "I Phone";
		d.pay = 1900;
		d.time = "2월15일";
		System.out.println("이름 :"+d.name + "  가격:"+d.pay+"  유통기한 :"+d.time);
  }	
	
}