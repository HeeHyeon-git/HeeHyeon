package com.huma.ex;
import java.util.*;
//�츮 �ֺ��� �ִ� �繰�� ��ü�� ����� ����ϴ� ���α׷��� ������.
//�ڵ���,TV,���������� ������ �ϳ� �߰�.
//�ڵ��� ��ȣ,�̸�,��ǰ�� (�ʵ�)
//��ȭ�ɱ� �޽��� ������ (�ൿ�� ��Ÿ���� ���� �޼ҵ�)
//�޽���			 (�ൿ�� ��Ÿ���� ���� �޼ҵ�)
//���� �ڵ��� ��ȣ, �޴� ��� �ڵ��� ��ȣ ���� �޽��� �ð�

//�ڵ���
class Phone{
	public String userNumber;
	public String name;
	public String product;
	
	public Phone() {}
	public Phone(String userNumber, String name, String product) {
		this.userNumber = userNumber;
		this.name = name;
		this.product = product;	
	}
	
	public void call(String personNumber) {
		System.out.println("�������� ��ȭ�� �Žðڽ��ϱ�>>");
		System.out.print(personNumber);
		System.out.println(" ���� �Ŵ� ��");
	}
	

	public void message(String personNumber, String text, String time ) {
		System.out.println("�޼����� �����ðڽ��ϱ� >>");
		System.out.println("�޴� ��� " + personNumber);
		System.out.println("���� " + text);
		System.out.println("�߼۽ð� " + time);
		System.out.println("�޼��� ������ �Ϸ��Ͽ����ϴ�.");
	}
	
	public void phoneInfo() {
		System.out.println("�ڵ��� ������ ������ �����ϴ�.");
		System.out.println("���� �ڵ��� ��ȣ:" + this.userNumber + ", ���� �̸� :"+ this.name + ", ���� �ڵ��� �� :" + this.product );	
	}
}

//TV
class Tv{
	public String made;
	public String channel;
	public String size;
	
	public Tv() {}
	public Tv(String made, String channel) {
		this.made = made;
		this.channel = channel;
		System.out.println("���� ��û���� ä���� " + this.channel + "�Դϴ�.");
	}
	
	public void channelChange(String channel) {
		System.out.println(this.channel+" ���� "+ channel+ " �� ä�η� �̵��մϴ�");
	}	
	
	public void tvInfo(int size) {
		System.out.println("tv�� ������ ������ �����ϴ�.");
		System.out.println("������ : "+ this.made +", ��ġ :" + size );
	}
}

//Ev
class Ev{
	public String made;
	public int floor;
	public int max;
	
	public Ev() {}
	public Ev(String made, int floor, int max) {
		this.made = made;
		this.floor = floor;
		this.max = max;
		System.out.println("���� "+ this.floor +"�� �Դϴ�.");
	}
	
	public void floorChange(int floor) {
		System.out.println(this.floor+" ������ " + floor + " ������ �̵��մϴ�. ");
	}

	public void evInfo(){
		System.out.println("Ev�� ������ ������ �����ϴ�.");
		System.out.println("������ :"+ this.made + ", �ְ� ���� ���� ���� : " + this.max);
	}
	
}

//���� ���� �� �ϳ�
class Bus{
	public int number;
	public int money ;
	public String company;
	public String busStop;
	
	public Bus() {}
	public Bus(int number, int money, String busStop) {
		this.number = number;
		this.money = money;
		this.busStop = busStop;
	}

	public void busStop(String nextStop) {
		System.out.println("�̹� �������� " + this.busStop + "�̸�, ���� ������ �������� " + nextStop + " �Դϴ�.");
	}
	
	public void busMoney() {
		int child;
		child= this.money-(this.money/20);
		int senior;
		senior=this.money-(this.money/30);
		System.out.println("���� ���� �����  "+ this.money + "�Դϴ�.");
		System.out.println("12�� ���� ��� ����� " +child + "�Դϴ�.");
		System.out.println("65�� �̻� ��� ��� ����� " +senior + "�Դϴ�." );
	}
	
	public void busInfo(String company) {
		System.out.println("���� ȸ�� :" + company );
		System.out.println("���� �뼱 :" + this.number );
		System.out.println("���� ��� :" + this.money );
	}

}


public class Test {
	
	public static void main(String[] args) {
		
		Phone phone = new Phone("010-0000-0000", "�趯��", "������");
		phone.call("010-3030-3030");
		phone.message("010-4949-3040","dd","1��10��");
		phone.phoneInfo();
		
		Tv tv = new Tv("�Ｚ","10��");
		tv.channelChange("15");
		tv.tvInfo(75);
	
		Ev ev = new Ev("����", 1, 350);
		ev.floorChange(6);
		ev.evInfo();	
		
		Bus bus = new Bus(1,1200,"õ�Ƚ�û");
		bus.busStop("������������");
		bus.busMoney();
		bus.busInfo("��ȣ");
	

	}
}