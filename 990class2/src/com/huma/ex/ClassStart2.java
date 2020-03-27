package com.huma.ex;
//Card card의 높이, card의 너비, card의 모양, card의 숫자
//class Card{
//클래스 안에 생성한 것들
//1.인스턴스 필드(멤버,변수)
//2.클래스 필드 (static변수)
//3.인스턴스 메소드 
//4.클래스 메소드
//5.생성자 메소드
//}
//1.인스턴스 필드(멤버,변수)
//각각의 인스턴스들이 값을 따로 가지는 변수
//2.클래스 필드 (static변수)
//모든 인스턴스에서 값을 공유하는 변수
//3.인스턴스 메소드 
//4.클래스 메소드
//5.생성자 메소드
//Card c1 = new Card();//c1이 인스턴스화 되었다.
//Card c2 = new Card();
//객체
//인스턴스 객체가 사용할 수 있도록 메모리에 올라간 형태
//클래스 실제 프로그램에서 객체 구현 할 때 사용하는 키워드 

//인스턴스는 클래스로 생성된 객체 
//클래스는 객체 만드려고 선언해 놓은 키워드
class Card{
	public static int width=100;//클래스 필드
	public static int height=200;//클래스 필드
	public String shape = "스페이드";//인스턴스 필드
	public String number = "2";//인스턴스 필드
	//카드에 넓이를 리턴하는 함수를 만들어보자.
	//클래스 메소드(할당없이 바로 쓸 수 있음)
	public static int area() {
		return Card.height*Card.width;
	}
	//인스턴스 메소드(new로 할당해야 쓸 수 있음)
	public String cardDisplay() {
		return shape+number;
	}
	//생성자 메소드
	public Card() {}
	public Card(String shape, String number) {
		this.shape = shape;
		this.number = number;
	}
}

public class ClassStart2 {

	public static void main(String[] args) {
	System.out.println(Card.area());	
	//System.out.println(Card.cardDisplay());
	//c 참조 변수, 참조 변수에는 주소가 들어 있음.
	//참조 변수에 들어있는 값을 참조 값(메모리 주소가 값이 됨)
	Card c = new Card();
	System.out.println(c.cardDisplay());
		
	
	}
}
