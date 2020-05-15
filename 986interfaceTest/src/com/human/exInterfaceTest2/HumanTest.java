package com.human.exInterfaceTest2;

public class HumanTest {

	public static void main(String[] args) {
		Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Worker w = new Worker();
		w.print();
		w.eat();
		
	}




	

}
