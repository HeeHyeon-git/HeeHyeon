package com.human.inheritanceTest3;

public class Person {
	private String name = null;
	private int age = 0;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("���[�̸� : " + this.getName() + ", ���� :  " + this.getAge()+"]");
	}
	
}
