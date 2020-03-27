package com.huma.ex;
import java.util.*;
//우리 주변에 있는 사물을 객체로 만들어 출력하는 프로그램을 만들어보자.
//핸드폰,TV,엘리베이터 본인이 하나 추가.
//핸드폰 번호,이름,제품명 (필드)
//전화걸기 메시지 보내기 (행동을 나타내는 경우는 메소드)
//메시지			 (행동을 나타내는 경우는 메소드)
//본인 핸드폰 번호, 받는 사람 핸드폰 번호 보낼 메시지 시간

//핸드폰
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
		System.out.println("누구에게 전화를 거시겠습니까>>");
		System.out.print(personNumber);
		System.out.println(" 에게 거는 중");
	}
	

	public void message(String personNumber, String text, String time ) {
		System.out.println("메세지를 보내시겠습니까 >>");
		System.out.println("받는 사람 " + personNumber);
		System.out.println("내용 " + text);
		System.out.println("발송시간 " + time);
		System.out.println("메세지 전송을 완료하였습니다.");
	}
	
	public void phoneInfo() {
		System.out.println("핸드폰 정보는 다음과 같습니다.");
		System.out.println("본인 핸드폰 번호:" + this.userNumber + ", 본인 이름 :"+ this.name + ", 본인 핸드폰 모델 :" + this.product );	
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
		System.out.println("현재 시청중인 채널은 " + this.channel + "입니다.");
	}
	
	public void channelChange(String channel) {
		System.out.println(this.channel+" 에서 "+ channel+ " 번 채널로 이동합니다");
	}	
	
	public void tvInfo(int size) {
		System.out.println("tv의 정보는 다음과 같습니다.");
		System.out.println("제조사 : "+ this.made +", 인치 :" + size );
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
		System.out.println("현재 "+ this.floor +"층 입니다.");
	}
	
	public void floorChange(int floor) {
		System.out.println(this.floor+" 층에서 " + floor + " 층으로 이동합니다. ");
	}

	public void evInfo(){
		System.out.println("Ev의 정보는 다음과 같습니다.");
		System.out.println("제조사 :"+ this.made + ", 최고 수용 가능 무게 : " + this.max);
	}
	
}

//내가 만든 거 하나
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
		System.out.println("이번 정류장은 " + this.busStop + "이며, 다음 내리실 정류장은 " + nextStop + " 입니다.");
	}
	
	public void busMoney() {
		int child;
		child= this.money-(this.money/20);
		int senior;
		senior=this.money-(this.money/30);
		System.out.println("성인 버스 요금은  "+ this.money + "입니다.");
		System.out.println("12세 이하 어린이 요금은 " +child + "입니다.");
		System.out.println("65세 이상 경로 우대 요금은 " +senior + "입니다." );
	}
	
	public void busInfo(String company) {
		System.out.println("버스 회사 :" + company );
		System.out.println("버스 노선 :" + this.number );
		System.out.println("버스 요금 :" + this.money );
	}

}


public class Test {
	
	public static void main(String[] args) {
		
		Phone phone = new Phone("010-0000-0000", "김땡땡", "아이폰");
		phone.call("010-3030-3030");
		phone.message("010-4949-3040","dd","1시10분");
		phone.phoneInfo();
		
		Tv tv = new Tv("삼성","10번");
		tv.channelChange("15");
		tv.tvInfo(75);
	
		Ev ev = new Ev("현대", 1, 350);
		ev.floorChange(6);
		ev.evInfo();	
		
		Bus bus = new Bus(1,1200,"천안시청");
		bus.busStop("성정여성공원");
		bus.busMoney();
		bus.busInfo("금호");
	

	}
}