package com.human.inheritanceTest3;

public class ForeignStudent extends Student {
	private String foreign = null;
	
	public ForeignStudent() {};
	public ForeignStudent(String name, int age, int studentNumber, String foreign) {
		super(name,age,studentNumber);
		this.foreign = foreign;
	}
	
	public void show() {
		System.out.println
		("외국학생[이름 : " +super.getName()+", 나이 : " +super.getAge() + 
				", 학번 : " + super.getStudentNumber() +", 국적 : " + this.getForeign() + "]" );
	}
	
	public String getForeign() {
		return foreign;
	}
	public void setForeign(String foreign) {
		this.foreign = foreign;
	};
	
	
	
}
