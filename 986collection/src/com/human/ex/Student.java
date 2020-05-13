package com.human.ex;

//간단히 학생성적 관리하는 프로그램을 만들어보자
//학생 객체를 만들어서 국어, 영어, 수학 점수를 가지고 학생 객체를 만들고 
//국어, 영어, 수학 각 점수와 평균으로 학생 리스트 정렬

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
		System.out.print("학생 이름은 : " + name);
		System.out.print("국어 점수는 : " + korean);
		System.out.print("영어 점수는 : " + english);
		System.out.print("수학 점수는 : " + math);
		System.out.println("평균 점수는 " + average());
	}
	
}
