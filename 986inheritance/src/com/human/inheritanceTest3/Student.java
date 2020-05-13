package com.human.inheritanceTest3;

public class Student extends Person {
	private int studentNumber = 0;
	
	public Student(){};
	public Student(String name, int age, int studentNumber) {
		super(name,age);
		this.studentNumber = studentNumber;
	}
	@Override
	public void show() {
		System.out.println
		("�л�[�̸� : " +super.getName()+", ���� : " +super.getAge() + ", �й� : " + this.getStudentNumber() + "]" );
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	};
}
