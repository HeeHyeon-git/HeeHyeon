package com.human.inheritanceTest3;

public class StudentTest {

	public static void main(String[] args) {
		Person ps [] = {new Person("�浿��",22),new Student("Ȳ����" , 23 ,100),
				new ForeignStudent("Amy", 30, 200, "U.S.A") };
		
		for(Person p : ps) {
			p.show();
		}

	}

}
