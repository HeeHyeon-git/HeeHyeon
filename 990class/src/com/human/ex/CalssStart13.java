package com.human.ex;

class Animal{
	public static void displayName(Animal a) {
		a.getName();
		a.move();
	}
//	public static void displayName(Human a) {
//		a.getName();
//		a.move();
//	}
//	public static void displayName(Eagle a) {
//		a.getName();
//		a.move();
//	}
//
//	public static void displayName(Tiger a) {
//		a.getName();
//		a.move();
//	}
//	
	
	public String name;
	public Animal(String name) {
		this.name = name;
	}
	public void getName() {
		System.out.println(name);
	}
	public void eat() {
		System.out.println("먹는다.");
	}
	public void move() {
		System.out.println("움직인다.");
	}
	
}

class Human extends Animal{
	public Human(String name) {
		super(name);
	}
	@Override
	public void move() {
		//@ 어노테이션 Spring에서는 어노테이션으로 프로그램함
 		System.out.println("걷는다.");
	}
	public void read() {
		System.out.println("책을 읽는다.");
	}
}
class Tiger extends Animal{
	public Tiger(String name) {
		super(name);
	}
	public void move() {
		System.out.println("네발로 뛰어다님");
	}
	public void hunting() {
		System.out.println("사냥함");
	}
}

class Eagle extends Animal{
	public Eagle(String name) {
		super(name);
	}
	public void move() {
		System.out.println("날아다님");
	}
}

public class CalssStart13 {

	public static void main(String[] args) {
		Animal a = new Animal("cat1");
		a.getName();
		a.move();
		a.eat();
		Human h = new Human("홍길동");
		h.getName();
		h.read();
		h.move(); //자식 human의 move가 실행됨
		h.eat();
		
		//다형성: 부모에 자식을 넣을 수 있다.
		//사람, 호랑이, 독수리를 하나의 배열에 넣어서 출력해보자
		Animal a0 = new Animal("홍길동0");
		Animal a1 = new Human("홍길동1");
		Animal a2 = new Tiger("홍길동2");
		Animal a3 = new Eagle("홍길동3");
		//new Animal일 경우에는 아래 3가지만 출력 Animal 형태로는
		//아래의 3가지만 출력가능하고 형변환 하여도 출력할 수 없다.
		a0.eat();
		a0.getName();
		a0.move();
		//a0.read();
		//((Human)a0).read();//불가능
		//new Human일 경우 아래 3가지 출력
		a1.eat();
		a1.getName();
		a1.move(); //Animal 클래스이지만 들어있는 객체의 재정의된 move 즉 Human의 move가 실행된다.
		//a1.read(); //재정의 되지 않으면 부모를 통해서 출력 할 수 없다.
		((Human)a1).read(); //형변환하면 접근 가능하다.
		
		//overload: 메소드 이름은 같은데 매개변수가 다른 메소드
		//override: 상속을 통해서 재 정의된 메소드
		
		//부모 클래스에 자식클래스를 넣은 인스턴스에서 
		//기본적으로 부모에 있는 메소드나 필드에 접근한다.
		//예외적으로 override된 메소드는 자식 메소드가 출력된다.
		//자식에 있는 메소드를 실행시킬 수 없다. 실행시키고 싶으면
		//형변환을 통해서 원래의 클래스로 변환시켜야 한다.
		
		//human, eagle, tiger 클래스들을 하나의 배열에 넣어서 처리하는 방법
		//다형성을 이용해서 처리한다.
		Animal [] arr = new Animal[4];
		arr[0] = a0;
		arr[1] = a1;
		arr[2] = a2;
		arr[3] = a3;
		
		for(Animal ani:arr) {
			ani.move();
		}
		//동물을 매개변수로 받아서 name을 출력하는 함수를 만들자
		
		Animal.displayName(a0);
		Animal.displayName(a1);
		Animal.displayName(a2);
		Animal.displayName(a3);
		
		System.out.println(a0 instanceof Animal);
		System.out.println(a1 instanceof Animal);
		System.out.println(a2 instanceof Animal);
		System.out.println(a3 instanceof Animal);
		
		System.out.println(a0 instanceof Human);
		System.out.println(a1 instanceof Human);
		System.out.println(a2 instanceof Human);
		System.out.println(a3 instanceof Human);
		
		
		
	}
}
