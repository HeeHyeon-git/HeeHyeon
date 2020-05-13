package com.human.ex;

//������ �л����� �����ϴ� ���α׷��� ������
//�л� ��ü�� ���� ����, ����, ���� ������ ������ �л� ��ü�� ����� 
//����, ����, ���� �� ������ ������� �л� ����Ʈ ����

public class Student {
	public int korean;
	public int english;
	public int math;
	public String name;
	
	public Student() {}
	public Student(String name, int korean, int english, int math ) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public double average() {
		return (this.korean + this.english + this.math)/3;
	}
	
	@Override
	public String toString() {
		return "Student [korean=" + korean + ", english=" + english + ", math=" + math + ", average=" + average()
				+ ", name=" + name + "]";
	}
	
	public void studentInfo() {
		System.out.print("�л� �̸��� : " + name);
		System.out.print("���� ������ : " + korean);
		System.out.print("���� ������ : " + english);
		System.out.print("���� ������ : " + math);
		System.out.println("��� ������ " + average());
	}
	
}
