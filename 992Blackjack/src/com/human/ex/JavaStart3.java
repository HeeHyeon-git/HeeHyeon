package com.human.ex;
import java.util.*;
public class JavaStart3 {
	public static void b() {
		System.out.println("b�Լ� ����");
		System.out.println("b�Լ� ����");
	}
	
	public static void a() {
		System.out.println("a�Լ� ����");
		b();
		System.out.println("a�Լ� ����");
	}
	
	public static void c() {
		System.out.println("c�Լ� ����");
		c();
		System.out.println("c�Լ� ����");
	}
	
	public static void main(String[] args) {
		c();

		
		
		
		
		
	}

}
