package com.human.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		//간단히 학생성적 관리하는 프로그램을 만들어보자
		//학생 객체를 만들어서 국어, 영어, 수학 점수를 가지고 학생 객체를 만들고 
		//국어, 영어, 수학 각 점수와 평균으로 학생 리스트 정렬
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new Student("lee", 90, 90, 90));
		stuList.add(new Student("kim", 80, 40, 70));
		stuList.add(new Student("oh", 60, 80, 60));
		stuList.add(new Student("choi", 100, 95, 98));
		stuList.add(new Student("seo", 50, 40, 60));
		
		Collections.sort(stuList, new Comparator <Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {
				int returnValue = 0;
				if(arg0.korean > arg1.korean) {
					returnValue = -1;
				}else if(arg0.korean < arg1.korean) {
					returnValue = 1;
				}
				return  returnValue;
			}
		});
		
		System.out.println("korean Score");
		for(Student s : stuList) {
			System.out.println(s);
		}
		
		Collections.sort(stuList, new Comparator <Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				int returnValue = 0;
				if(o1.english > o2.english) {
					returnValue = -1;
				}else if(o1.english < o2.english) {
					returnValue = 1;
				}
				return returnValue;
			}
		});
		
		System.out.println("english Score");
		for(Student s : stuList) {
			System.out.println(s);
		}
		
		Collections.sort(stuList, new Comparator <Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {
				int returnValue = 0;
				if(arg0.math > arg1.math) {
					returnValue = -1;
				}else if(arg0.math < arg1.math) {
					returnValue = 1;
				}
				return returnValue;
			}
		});
		
		System.out.println("math Score");
		for(Student s : stuList) {
			System.out.println(s);
		}
		
		Collections.sort(stuList, new Comparator <Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int returnValue = 0;
				if(o1.average() > o2.average()) {
					returnValue = -1;
				}else if(o1.average() < o2.average()) {
					returnValue = 1;
				}
				return returnValue;
			}
			
		});
		
		System.out.println("average");
		for(Student s : stuList) {
			System.out.println(s);
		}
	
}

}
