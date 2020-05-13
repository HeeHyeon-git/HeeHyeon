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
		("�ܱ��л�[�̸� : " +super.getName()+", ���� : " +super.getAge() + 
				", �й� : " + super.getStudentNumber() +", ���� : " + this.getForeign() + "]" );
	}
	
	public String getForeign() {
		return foreign;
	}
	public void setForeign(String foreign) {
		this.foreign = foreign;
	};
	
	
	
}
