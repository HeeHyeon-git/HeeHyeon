package com.human.ex1;

import java.util.Scanner;

import com.human.eto.*;
public class nam2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		String s = null;
		int i = 0, i1 = 0, i2 = 0, i3 = 0, i4 = 0, b = 0 ;


		for(i = 1; i<=100; i++)
		{
			System.out.println(i);
		}

		for(i1 = 100; i1>=1; i1--)
		{
			System.out.println(i1);
		}
		
		for(i2 = 5; i2<=8; i2++)
		{
			System.out.println(i2);
		}
		
		for(i3 = 13; i3<=22; i3++)
		{
			System.out.println(i3);
		}
		
		for(i4=1;i4<=10; i4++)
		{
			b = i4+ b;
		}
		System.out.println(b);
	
	}	
	
	
}